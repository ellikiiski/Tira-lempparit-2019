
import java.util.*;
public class Main {
    
    static int lyhin;
    static int maara;
    static int reitti;    

    public static long reittimaara(int n, int[] mista, int[] minne) {
        lyhin = Integer.MAX_VALUE;
        maara = 0;
        reitti = 0;        
        return leveyshaku(1, n, mista, minne);
    }
    
    public static int leveyshaku(int mista, int paamaara, int[] mistaTaulu, int[] minneTaulu) {
        reitti++;
        if (mista == paamaara) {
            if (reitti == lyhin) {
                maara++;
            }
            if (reitti < lyhin) {
                lyhin = reitti;
                reitti = 0;
                maara = 1;
            }
        }        
        for (int i = 0; i < mistaTaulu.length; i++) {
            if (mistaTaulu[i] == mista) {
                leveyshaku(minneTaulu[i], paamaara, mistaTaulu, minneTaulu);
            }            
        }
        return maara;        
    }

    public static void main(String[] args) {
        System.out.println(reittimaara(2, new int[]{1}, new int[]{2}));                               //1
        System.out.println(reittimaara(5, new int[]{1, 1, 2, 3, 4}, new int[]{2, 3, 4, 4, 5}));       //2
        System.out.println(reittimaara(5, new int[]{1, 1, 1, 2, 3, 4}, new int[]{2, 3, 4, 5, 5, 5})); //3
        System.out.println(reittimaara(7, new int[]{1, 2, 3, 1, 1, 4, 5, 6}, new int[]{2, 3, 7, 4, 5, 6, 6, 7}));   //3


    }
}
