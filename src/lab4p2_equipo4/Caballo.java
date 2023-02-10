package lab4p2_equipo4;

public class Caballo extends Pieza {

    public Caballo() {
        super();
    }

    public Caballo(boolean esBlanco, int x, int y, int finalx, int finaly) {
        super(esBlanco, x, y, finalx, finaly);
    }

    public boolean movimiento(int x, int y, int finalx, int finaly, boolean esblanco, Object[][] tablero) {
        boolean temp = true;
        int distanciax = Math.abs(x - finalx);
        int distanciay = Math.abs(y - finaly);
        if (((Pieza) tablero[finalx][finaly]).getEsBlanco() == esblanco) {
            if (distanciax == 1 && distanciay == 2 || distanciax == 2 && distanciay == 1) {
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
            return "N";
        } else {
            return "n";
        }
    }

    @Override
    public String getPiece() {
        if (super.esBlanco) {
            return "N";
        } else {
            return "n";
        }
    }

}
