package lab4p2_equipo4;

public class Torre extends Pieza {

    public boolean movimiento(int x, int y, int finalx, int finaly, boolean esblanco, Object[][] tablero) {
        boolean temp = true;
        int distanciax = Math.abs(x - finalx);
        int distanciay = Math.abs(y - finaly);
        if (((Pieza) tablero[finalx][finaly]).getEsBlanco() == esblanco) {
            if (distanciax == x || distanciay == y) {
            } else {
                temp = false;
            }
        } else {
            temp = false;
        }

        return temp;
    }

    private boolean testmiddlepiece(int x, int y, int finalx, int finaly) {
        boolean temp=true;
        if (x != finalx) {
            
        } else {

        }
        return temp;
    }
}
