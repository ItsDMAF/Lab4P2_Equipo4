package lab4p2_equipo4;

public class Torre extends Pieza {

    public Torre(boolean esBlanco, int x, int y, int finalx, int finaly) {
        super(esBlanco, x, y, finalx, finaly);
    }

    public Torre() {
        super();
    }

    public boolean movimiento(int x, int y, int finalx, int finaly, boolean esblanco, Object[][] tablero) {
        boolean temp = true;
        int distanciax = Math.abs(x - finalx);
        int distanciay = Math.abs(y - finaly);
        if (((Pieza) tablero[finalx][finaly]).getEsBlanco() == esblanco) {
            if (distanciax == x || distanciay == y) {
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

    @Override
    public String toString() {
        if (super.esBlanco) {
            return "T";
        } else {
            return "t";
        }
    }

}
