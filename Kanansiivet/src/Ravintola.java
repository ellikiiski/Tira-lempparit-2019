import java.util.*;

public class Ravintola {

    private int[] hinnat;
    
    public Ravintola() {
        this.hinnat = new int[1001];        
    }

    public void lisaaPaketti(int maara, int hinta) {        
        for (int i = maara; i < hinnat.length; i++) {
            if (i % maara == 0) {
                if (hinnat[i] == 0) {
                    hinnat[i] = i / maara * hinta;
                } else {
                    hinnat[i] = Math.min(hinnat[i], (i / maara * hinta));
                }
            } else {
                for (int j = 1; j < i; j++) {
                    int vert1 = Integer.MAX_VALUE;
                    if (hinnat[i - j] != 0 && hinnat[j] != 0) {
                        vert1 = hinnat[i - j] + hinnat[j];
                    }
                    if (hinnat[i] == 0 && hinnat[i - j] != 0 && hinnat[j] != 0) {
                        hinnat[i] = vert1;
                    } else {
                        hinnat[i] = Math.min(hinnat[i], vert1);
                    }
                }
            }             
        }
    }

    public int halvinHinta(int maara) {
        return hinnat[maara];
    }
    
    
}
