import java.util.*;

public class Huoneet {
    
    public int laske(int[][] kartta) {
        int huoneet = 0;
        for (int i = 1; i < kartta.length - 1; i++) {
            for (int j = 1; j < kartta[i].length - 1; j++) {
                if (kartta[i][j] == 0) {
                    kasitteleHuone(kartta, i, j);
                    huoneet++;
                }
            }
        }
        return huoneet;
    }
    
    public static void kasitteleHuone(int[][] kartta, int i, int j) {
        if (kartta[i][j] == 0) {
            kartta[i][j] = 1;
            kasitteleHuone(kartta, i+1, j);
            kasitteleHuone(kartta, i-1, j);
            kasitteleHuone(kartta, i, j+1);
            kasitteleHuone(kartta, i, j-1);            
        }
    }
}
