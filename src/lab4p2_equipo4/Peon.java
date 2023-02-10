package lab4p2_equipo4;

public class Peon extends Pieza {

    public Peon(boolean esBlanco, int x, int y, int finalx, int finaly) {
        super(esBlanco, x, y, finalx, finaly);
    }

    public Peon() {
        super();
    }

    public boolean movimiento(int x, int y, int finalx, int finaly, boolean esblanco) {
        boolean temp = true;
        int distanciay = Math.abs(y - finaly);
        if (y == 1 && esblanco == true) {//PEONES BLANCOS
            if (distanciay >= 2 && distanciay > y) {
            } else {
                temp = false;
            }
        }
        if (y == 6 && esblanco == false) {//PEONES NEGROS
            if (distanciay <= 2 && distanciay < y) {
            } else {
                temp = false;
            }
        }
        if (y != 1 && esblanco == true || y != 6 && esblanco == false) {//Proximos movimientos
            if (distanciay <= 1) {
            } else {
                temp = false;
            }
        }
        return temp;
    }
}
