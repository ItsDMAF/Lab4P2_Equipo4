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
        return tablero;

    }
}
