
package lab4p2_equipo4;

public class Peon extends Pieza {

    public Peon(boolean esBlanco, int x, int y, int finalx, int finaly) {
        super(esBlanco, x, y, finalx, finaly);
    }

    public Peon() {
        super();
    }
    

    public boolean movimiento(int x, int y, int finalx, int finaly, boolean esblanco){
        if(y == 1 && esblanco == true){
            
        }
        if (y == 6 && esblanco == false ) {
            
        }
        if (y != 1  && esblanco == true || y != 6 && esblanco == false) {
            
        }
    }
}
