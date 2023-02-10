
package lab4p2_equipo4;

public class Pieza {
    protected boolean esBlanco;
    protected int x,y,finalx,finaly;

    public Pieza(boolean esBlanco, int x, int y, int finalx, int finaly) {
        this.esBlanco = esBlanco;
        this.x = x;
        this.y = y;
        this.finalx = finalx;
        this.finaly = finaly;
    }

    public Pieza() {
    }

    public boolean getEsBlanco() {
        return esBlanco;
    }

    public void setEsBlanco(boolean esBlanco) {
        this.esBlanco = esBlanco;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getFinalx() {
        return finalx;
    }

    public void setFinalx(int finalx) {
        this.finalx = finalx;
    }

    public int getFinaly() {
        return finaly;
    }

    public void setFinaly(int finaly) {
        this.finaly = finaly;
    }

    @Override
    public String toString() {
        return "Pieza{" + "esBlanco=" + esBlanco + ", x=" + x + ", y=" + y + ", finalx=" + finalx + ", finaly=" + finaly + '}';
    }
    
    
    
}
