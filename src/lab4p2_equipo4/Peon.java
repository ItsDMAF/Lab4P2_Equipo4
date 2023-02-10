package lab4p2_equipo4;

public class Peon extends Pieza {

    public Peon(boolean esBlanco, int x, int y, int finalx, int finaly) {
        super(esBlanco, x, y, finalx, finaly);
    }

    public Peon() {
        super();
    }

    public boolean movimiento(int x, int y, int finalx, int finaly, boolean esblanco, Object[][] tablero) {
        boolean temp = true;
        int distanciay = Math.abs(y - finaly);

        if (((Pieza) tablero[finalx][finaly]).getEsBlanco() == esblanco) {

            if (y == 1 && esblanco == true) {//PEONES BLANCOS
                if (distanciay >= 2 && distanciay > y) {
                    if (tablero[x][y-1] instanceof  Pieza) {
                        
                    }
                } else {
                    temp = false;
                }
            }
            if (y == 6 && esblanco == false) {//PEONES NEGROS
                if (distanciay <= 2 && distanciay < y) {
                    if (tablero[x][y+1] instanceof  Pieza) {
                        
                    }
                } else {
                    temp = false;
                }
            }
//------------------------------------------------------------------------------
            if (y != 1 && esblanco == true || y != 6 && esblanco == false) {//Proximos movimientos
                if (distanciay <= 1) {
                } else {
                    temp = false;
                }
            }
            if (esblanco == false && finaly == y - 1) {//Comer lado blanco
                temp = true;

            }
            if (esblanco == true && finaly == y + 1) {//Comer lado negro
                temp = true;

            }
        }

        return temp;
    }

    @Override
    public String getPiece() {
        if (super.esBlanco) {
            return "P";
        } else {
            return "p";
        }
    }

}
