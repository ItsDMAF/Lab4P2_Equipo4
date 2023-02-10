package lab4p2_equipo4;

public class Alfil extends Pieza {

    public Alfil(boolean esBlanco, int x, int y, int finalx, int finaly) {
        super(esBlanco, x, y, finalx, finaly);
    }

    public Alfil() {
        super();
    }

    public boolean movimiento(int x, int y, int finalx, int finaly, boolean esblanco, Object[][] tablero) {
        boolean temp = true;
        int xdistancia = Math.abs(x - finalx);
        int ydistancia = Math.abs(y - finaly);
        if (((Pieza) tablero[finalx][finaly]).getEsBlanco() == esblanco) {
            if (xdistancia == ydistancia) {
                temp = testmiddlepiece(x, y, finalx, finaly, tablero);
            } else {
                temp = false;
            }
        } else {
            temp = false;
        }

        return temp;
    }

    private boolean testmiddlepiece(int x, int y, int finalx, int finaly, Object[][] tablero) {
        boolean temp = true;
        if (finalx < x) { //x --
            if (finaly > x) {//y ++
                for (int i = x - 1, j = y + 1; i < finalx; i--, j++) {
                    if (tablero[i][j] instanceof Pieza) {
                        return temp = false;
                    }
                }
            } else {//y --
                for (int i = x - 1, j = y - 1; i < finalx; i--, j--) {
                    if (tablero[i][j] instanceof Pieza) {
                        return temp = false;
                    }
                }

            }

        }
        if (finalx > x) {//x ++
            if (finaly > x) {//y ++
                for (int i = x + 1, j = y + 1; i < finalx; i++, j++) {
                    if (tablero[i][j] instanceof Pieza) {
                        return temp = false;
                    }
                }

            } else {//y --
                for (int i = x + 1, j = y - 1; i < finalx; i++, j--) {
                    if (tablero[i][j] instanceof Pieza) {
                        return temp = false;
                    }
                }

            }
        }

        return temp;
    }

    @Override
    public String toString() {
        if (super.esBlanco) {
            return "B";
        } else {
            return "b";
        }
    }

    @Override
    public String getPiece() {
        if (super.esBlanco) {
            return "B";
        } else {
            return "b";
        }
    }
    

}
