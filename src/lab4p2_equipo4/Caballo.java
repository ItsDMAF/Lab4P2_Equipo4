
package lab4p2_equipo4;

public class Caballo {

    public boolean movimiento(int x, int y, int finalx, int finaly, boolean esblanco) {
        boolean temp = true;
        int distanciax = Math.abs(x - finalx);
        int distanciay = Math.abs(y - finaly);
        if (tablero[finalx][finaly].getEsBlanco == esblanco) {
            if (distanciax == 1 && distanciay == 2 || distanciax == 2 && distanciay == 1) {
            } else {
                temp = false;
            }
        } else {
            temp = false;
        }

        return temp;
    }
}
