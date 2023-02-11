package lab4p2_equipo4;

public class Rey extends Pieza {

    public Rey() {
        super();
    }

    public Rey(boolean esBlanco, int x, int y, int finalx, int finaly) {
        super(esBlanco, x, y, finalx, finaly);
    }

    public boolean movimiento(int x, int y, int finalx, int finaly, boolean esblanco, Object[][] tablero) {
        boolean temp = true;
        int distanciax = Math.abs(x - finalx);
        int distanciay = Math.abs(y - finaly);
        if (((Pieza) tablero[finalx][finaly]).getEsBlanco() == esblanco) {
            if (distanciax <= 1 && distanciay <= 1) {
            } else {
                temp = false;
            }
        } else {
            temp = false;
        }

        return temp;
    }

    public String toString() {
        if (super.esBlanco) {
            return "K";
        } else {
            return "k";
        }
    }

    @Override
    public String getPiece() {
        if (super.esBlanco) {
            return "K";
        } else {
            return "k";
        }
    }

    public boolean jaque(Object[][] tablero) {
        boolean temp = false;
        if (x == finalx) {
            for (int i = y; i < finaly; i++) {
                if (tablero[i][finaly] instanceof Pieza) {
                    if (tablero[i][finaly] instanceof Torre) {
                        temp = true;
                    } else {
                        break;
                    }
                }
            }
        } else {
            for (int i = x; i < finalx; i++) {
                if (tablero[i][finaly] instanceof Pieza) {
                    if (tablero[i][finaly] instanceof Torre) {
                        temp = true;
                    } else {
                        break;
                    }
                }
            }
        }
        return temp;
    }
}
