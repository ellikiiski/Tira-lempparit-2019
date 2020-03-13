import java.util.*;

public class Pysakit { 
    
    public int laske(int[] talot, int x) {
        Arrays.sort(talot);
        int laskuri = 1;
        int vp = talot[0] + x;
        for (int i = 0; i < talot.length; i++) {            
            if (talot[i] - x > vp) {
                vp = talot[i] + x;
                laskuri++;
            }
        }        
        return laskuri;
    }    
}
