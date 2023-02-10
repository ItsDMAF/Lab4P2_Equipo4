package lab4p2_equipo4;

public class Lab4P2_Equipo4 {

    public static void main(String[] args) {

        Object[][] tablero = new Object[8][8];

    }

    public Object[][] arreglartablero(Object[][] tablero) {
        //torres
        {
            Torre T = new Torre(true, 0, 0, 0, 0);
            tablero[0][0] = T;
        }
        {
            Torre T = new Torre(true, 7, 0, 0, 0);
            tablero[7][0] = T;
        }
        {
            Torre T = new Torre(false, 0, 7, 0, 0);
            tablero[0][7] = T;
        }
        {
            Torre T = new Torre(false, 7, 0, 0, 0);
            tablero[7][7] = T;
        }

        //caballos
        {
            Caballo C = new Caballo(true, 1, 0, 0, 0);
            tablero[1][0] = C;
        }
        {
            Caballo C = new Caballo(true, 6, 0, 0, 0);
            tablero[6][0] = C;
        }
        {
            Caballo C = new Caballo(false, 1, 7, 0, 0);
            tablero[1][7] = C;
        }
        {
            Caballo C = new Caballo(false, 6, 7, 0, 0);
            tablero[6][7] = C;
        }

        //alfil
        {
            Alfil A = new Alfil(true, 2, 0, 0, 0);
            tablero[2][0] = A;
        }
        {
            Alfil A = new Alfil(true, 5, 0, 0, 0);
            tablero[5][0] = A;
        }
        {
            Alfil A = new Alfil(false, 2, 7, 0, 0);
            tablero[2][7] = A;
        }
        {
            Alfil A = new Alfil(false, 5, 7, 0, 0);
            tablero[5][7] = A;
        }

        //rey
        {
            Rey R = new Rey(true, 4, 0, 0, 0);
            tablero[4][0] = R;
        }
        {
            Rey R = new Rey(false, 4, 7, 0, 0);
            tablero[4][7] = R;
        }
        //reina
        {
            Reina R = new Reina(true, 3, 0, 0, 0);
            tablero[3][0] = R;
        }
        {
            Reina R = new Reina(false, 3, 7, 0, 0);
            tablero[3][7] = R;
        }

        //peones
        for (int i = 0; i <= 7; i++) {
            {
                Peon P = new Peon(true, i, 1, 0, 0);
                tablero[i][1] = P;

            }
            {
                Peon P = new Peon(false, i, 6, 0, 0);
                tablero[i][6] = P;

            }
        }
        return tablero;

    }
}
