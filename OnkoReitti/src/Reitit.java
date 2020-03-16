import java.util.*;

public class Reitit {
    int laskuri = 1;
    int[][] theKartta;    
    
    public void asetaKartta(int[][] kartta) {
        theKartta = kartta;
        for (int i = 1; i < theKartta.length - 1; i++) {
            for (int j = 1; j < theKartta[i].length - 1; j++) {
                if (theKartta[i][j] == 0) {
                    laskuri++;                    
                    kasitteleHuone(theKartta, i, j);
                }
            }
        }
    }    

    public void kasitteleHuone(int[][] kartta, int i, int j) {
        if (kartta[i][j] == 0) {            
            kartta[i][j] = laskuri;
            kasitteleHuone(kartta, i + 1, j);
            kasitteleHuone(kartta, i - 1, j);
            kasitteleHuone(kartta, i, j + 1);
            kasitteleHuone(kartta, i, j - 1);
        }
    }    
    
    public boolean onkoReitti(int y1, int x1, int y2, int x2) {
        if (theKartta[y1][x1] == 1) {
            return false;
        }
        if (theKartta[y1][x1] == theKartta[y2][x2]) {
            return true;
        }
        return false;        
    }
}
