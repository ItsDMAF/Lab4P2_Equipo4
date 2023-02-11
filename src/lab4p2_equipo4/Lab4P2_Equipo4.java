package lab4p2_equipo4;

import java.util.Scanner;

public class Lab4P2_Equipo4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Object[][] tablero = new Object[8][8];
        tablero = arreglartablero(tablero);
        imprimirPosicionNegro(tablero);
        imprimirposicionBlanca(tablero);
        boolean win = true;
        do {

            System.out.print("Ingrese: ");

            String mov = leer.nextLine();
            String instru[] = mov.split(" - ");

            for (int i = 0; i < instru.length; i++) {
                if (instru[i].charAt(0)) {
                    if (instru[i].charAt(0)) {

                    }
                }
            }

        } while (win);
    }

    public static Object[][] arreglartablero(Object[][] tablero) {
        //torres
        {
            Torre T = new Torre(true, 0, 0, 0, 0);
            tablero[0][0] = T;
        }
        {
            Torre T = new Torre(true, 7, 0, 0, 0);
            tablero[0][7] = T;
        }
        {
            Torre T = new Torre(false, 0, 7, 0, 0);
            tablero[7][0] = T;
        }
        {
            Torre T = new Torre(false, 7, 0, 0, 0);
            tablero[7][7] = T;
        }

        //caballos
        {
            Caballo C = new Caballo(true, 1, 0, 0, 0);
            tablero[0][1] = C;
        }
        {
            Caballo C = new Caballo(true, 6, 0, 0, 0);
            tablero[0][6] = C;
        }
        {
            Caballo C = new Caballo(false, 1, 7, 0, 0);
            tablero[7][1] = C;
        }
        {
            Caballo C = new Caballo(false, 6, 7, 0, 0);
            tablero[7][6] = C;
        }

        //alfil
        {
            Alfil A = new Alfil(true, 2, 0, 0, 0);
            tablero[0][2] = A;
        }
        {
            Alfil A = new Alfil(true, 5, 0, 0, 0);
            tablero[0][5] = A;
        }
        {
            Alfil A = new Alfil(false, 2, 7, 0, 0);
            tablero[7][2] = A;
        }
        {
            Alfil A = new Alfil(false, 5, 7, 0, 0);
            tablero[7][5] = A;
        }

        //rey
        {
            Rey R = new Rey(true, 4, 0, 0, 0);
            tablero[0][4] = R;
        }
        {
            Rey R = new Rey(false, 4, 7, 0, 0);
            tablero[7][4] = R;
        }
        //reina
        {
            Reina R = new Reina(true, 3, 0, 0, 0);
            tablero[0][3] = R;
        }
        {
            Reina R = new Reina(false, 3, 7, 0, 0);
            tablero[7][3] = R;
        }

        //peones
        for (int i = 0; i <= 7; i++) {
            {
                Peon P = new Peon(true, i, 1, 0, 0);
                tablero[1][i] = P;

            }
            {
                Peon P = new Peon(false, i, 6, 0, 0);
                tablero[6][i] = P;

            }
        }
        return tablero;

    }

    public static void imprimirPosicionNegro(Object[][] tablero) {
        System.out.println("-------------------------------");
        //imprimir id de letras
        System.out.print("   ");
        for (int i = 72; i >= 65; i--) {
            System.out.print(((char) i) + "  ");
        }
        System.out.println("");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] instanceof Pieza) {
                    System.out.print("[" + ((Pieza) tablero[i][j]).getPiece() + "]");

                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------");

    }

    public static void imprimirposicionBlanca(Object[][] tablero) {
        System.out.println("-------------------------------");
        //imprimir id de letras
        System.out.print("   ");
        for (int i = 65; i <= 72; i++) {
            System.out.print(((char) i) + "  ");
        }
        System.out.println("");
        for (int i = tablero.length - 1; i >= 0; i--) {
            System.out.print(i + " ");
            for (int j = tablero[0].length - 1; j >= 0; j--) {
                if (tablero[i][j] instanceof Pieza) {
                    System.out.print("[" + ((Pieza) tablero[i][j]).getPiece() + "]");

                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
    }

}
