package lab4p2_equipo4;

public class Alfil {

    public boolean movimiento(int x, int y, int finalx, int finaly, boolean esblaco) {
        boolean temp = true;
        int xdistancia = Math.abs(x - finalx);
        int ydistancia = Math.abs(y - finaly);
        if (xdistancia == ydistancia) {
            return temp;
        } else {
            return temp = false;
        }
    }
}
