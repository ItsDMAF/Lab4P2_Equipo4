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
        try {
            for (int i = 0; i < 8; i++) {
                if (tablero[i][y] instanceof Pieza) {
                    if (tablero[i][y] instanceof Torre && esBlanco != esBlanco || tablero[i][y] instanceof Reina && esBlanco != esBlanco) {
                        temp = ((Pieza) tablero[i][y]).movimiento(finalx, finaly, i, y, esBlanco, tablero);
                    } else {
                        break;
                    }
                }
            }
        } catch (Exception e) {
        }

        for (int i = 0; i < 8; i++) {
            try {
                if (tablero[x][i] instanceof Pieza && esBlanco != esBlanco || tablero[x][i] instanceof Reina) {
                    if (tablero[x][i] instanceof Torre) {
                        temp = ((Pieza) tablero[i][y]).movimiento(finalx, finaly, x, i, esBlanco, tablero);
                    } else {
                        break;
                    }
                }
            } catch (Exception e) {
            }
        }

        //-----------------------------
        //Arfill
        try {
            for (int i = x; i < 10; i++) {
                for (int j = y; j < 10; j++) {
                    if (tablero[i][j] instanceof Pieza && esBlanco != esBlanco || tablero[i][j] instanceof Reina) {
                        if (tablero[i][j] instanceof Alfil) {
                            temp = ((Pieza) tablero[i][j]).movimiento(i, j, x, y, esBlanco, tablero);
                        } else {
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
        try {
            for (int i = x; i < 10; i++) {
                for (int j = y; j < 10; j--) {
                    if (tablero[i][j] instanceof Pieza && esBlanco != esBlanco || tablero[i][j] instanceof Reina) {
                        if (tablero[i][j] instanceof Alfil) {
                            temp = ((Pieza) tablero[i][j]).movimiento(i, j, x, y, esBlanco, tablero);
                        } else {
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
        try {
            for (int i = x; i < 10; i--) {
                for (int j = y; j < 10; j++) {
                    if (tablero[i][j] instanceof Pieza && esBlanco != esBlanco || tablero[i][j] instanceof Reina) {
                        if (tablero[i][j] instanceof Alfil) {
                            temp = ((Pieza) tablero[i][j]).movimiento(i, j, x, y, esBlanco, tablero);
                        } else {
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
        try {
            for (int i = x; i < 10; i--) {
                for (int j = y; j < 10; j--) {
                    if (tablero[i][j] instanceof Pieza && esBlanco != esBlanco || tablero[i][j] instanceof Reina) {
                        if (tablero[i][j] instanceof Alfil) {
                            temp = ((Pieza) tablero[i][j]).movimiento(i, j, x, y, esBlanco, tablero);
                        } else {
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
        //------------------------------------------------------
        //peon
        if (esBlanco == true) {//Comer lado blanco
            if (tablero[x - 1][y + 1] instanceof Peon || tablero[x + 1][y + 1] instanceof Peon) {
                temp = true;
            }

        }
        if (esBlanco == false) {//Comer lado negro
            if (tablero[x - 1][y - 1] instanceof Peon || tablero[x + 1][y - 1] instanceof Peon) {
                temp = true;
            }

        }
        //----------------------------------
        //caballo
        try {
            temp = tablero[x + 1][y + 2] instanceof Caballo || esBlanco != ((Pieza) tablero[x + 1][y + 2]).getEsBlanco();
        } catch (Exception e) {
        }
        try {
            temp = tablero[x + 1][y - 2] instanceof Caballo || esBlanco != ((Pieza) tablero[x + 1][y - 2]).getEsBlanco();
        } catch (Exception e) {
        }
        try {
            temp = tablero[x - 1][y + 2] instanceof Caballo || esBlanco != ((Pieza) tablero[x - 1][y + 2]).getEsBlanco();
        } catch (Exception e) {
        }
        try {
            temp = tablero[x - 1][y - 2] instanceof Caballo || esBlanco != ((Pieza) tablero[x - 1][y - 2]).getEsBlanco();
        } catch (Exception e) {
        }
        try {
            temp = tablero[x + 2][y + 1] instanceof Caballo || esBlanco != ((Pieza) tablero[x + 2][y + 1]).getEsBlanco();
        } catch (Exception e) {
        }
        try {
            temp = tablero[x + 2][y - 1] instanceof Caballo || esBlanco != ((Pieza) tablero[x + 2][y - 1]).getEsBlanco();
        } catch (Exception e) {
        }
        try {
            temp = tablero[x - 2][y + 1] instanceof Caballo || esBlanco != ((Pieza) tablero[x - 2][y + 1]).getEsBlanco();
        } catch (Exception e) {
        }
        try {
            temp = tablero[x - 2][y - 1] instanceof Caballo || esBlanco != ((Pieza) tablero[x - 2][y - 1]).getEsBlanco();
        } catch (Exception e) {
        }

        return temp;
    }
}
