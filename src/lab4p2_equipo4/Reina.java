package lab4p2_equipo4;

public class Reina extends Pieza {

    public Reina() {
        super();
    }

    public Reina(boolean esBlanco, int x, int y, int finalx, int finaly) {
        super(esBlanco, x, y, finalx, finaly);
    }

    public boolean movimiento(int x, int y, int finalx, int finaly, boolean esblanco, Object[][] tablero) {
        boolean temp = true;
        int distanciax = Math.abs(x - finalx);
        int distanciay = Math.abs(y - finaly);
        //movimiento de torre
        if (((Pieza) tablero[finalx][finaly]).getEsBlanco() == esblanco) {
            if (distanciax == x || distanciay == y) {
                temp = testmiddlepiece(x, y, finalx, finaly, tablero);
            } else {
                temp = false;
            }
        }
        //movimiento de arfil
        if (((Pieza) tablero[finalx][finaly]).getEsBlanco() == esblanco) {
            if (distanciax == distanciay) {
                temp = testmiddlepieceA(x, y, finalx, finaly, tablero);
            } else {
                temp = false;
            }
        } else {
            temp = false;
        }

        return temp;

    }

    private boolean testmiddlepiece(int x, int y, int finalx, int finaly, Object[][] tablero) {
        if (x == finalx) {
            for (int i = y; i < finaly; i++) {
                if (tablero[i][finaly] instanceof Pieza) {
                    return false;
                }
            }
        } else {
            for (int i = x; i < finalx; i++) {
                if (tablero[i][finaly] instanceof Pieza) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean testmiddlepieceA(int x, int y, int finalx, int finaly, Object[][] tablero) {
        boolean temp = true;
        if (finalx < x) { //x --
            if (finaly > x) {//y ++
                for (int i = x - 1, j = y + 1; i < finalx; i--, j++) {
                    if (tablero[i][j] instanceof Pieza) {
                        return false;
                    }
                }
            } else {//y --
                for (int i = x - 1, j = y - 1; i < finalx; i--, j--) {
                    if (tablero[i][j] instanceof Pieza) {
                        return false;
                    }
                }

            }

        }
        if (finalx > x) {//x ++
            if (finaly > x) {//y ++
                for (int i = x + 1, j = y + 1; i < finalx; i++, j++) {
                    if (tablero[i][j] instanceof Pieza) {
                        return false;
                    }
                }

            } else {//y --
                for (int i = x + 1, j = y - 1; i < finalx; i++, j--) {
                    if (tablero[i][j] instanceof Pieza) {
                        return false;
                    }
                }

            }
        }

        return temp;
    }
}
