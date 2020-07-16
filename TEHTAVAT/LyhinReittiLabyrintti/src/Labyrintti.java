import java.util.*;

public class Labyrintti {
    
    public int laske(int[][] kartta) {
        int lahtoX = 0;
        int lahtoY = 0;
        int maaliX = 0;
        int maaliY = 0;
        for (int i = 0; i < kartta.length; i++) {
            for (int j = 0; j < kartta[0].length; j++) {
                if (kartta[i][j] == 2) {
                    lahtoY = i;
                    lahtoX = j;
                }
                if (kartta[i][j] == 3) {
                    maaliY = i;
                    maaliX = j;
                }
            }
        }
        int[][] matka = new int[kartta.length][kartta[0].length];
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        kartta[lahtoY][lahtoX] = 1;
        y.add(lahtoY);
        x.add(lahtoX);
        for (int i = 0; i < y.size(); i++) {
            int yNyt = y.get(i);
            int xNyt = x.get(i);
            if (yNyt == maaliY && xNyt == maaliX) {
                return matka[maaliY][maaliX];
            }
            for (int j = -1; j < 2; j++) {
                for (int k = -1; k < 2; k++) {
                    if (Math.abs(j) != Math.abs(k)) {
                        int uusiX = xNyt + k;
                        int uusiY = yNyt + j;
                        //System.out.println(j + "" + k);
                        if (kartta[uusiY][uusiX] != 1) {
                            kartta[uusiY][uusiX] = 1;
                            matka[uusiY][uusiX] = matka[yNyt][xNyt] + 1;
                            x.add(uusiX);
                            y.add(uusiY);
                        }
                    }                    
                }
            }
        }
        return -1;
    }
}
