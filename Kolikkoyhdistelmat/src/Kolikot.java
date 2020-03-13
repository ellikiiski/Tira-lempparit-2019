
import java.util.ArrayList;

public class Kolikot {
    ArrayList<Integer> lista;
    boolean[] mukana;
    int yht;
    int osajoukot;
    
    Kolikot() {
        lista = new ArrayList<Integer>();        
    }

    public void lisaaKolikko(int arvo) {
        lista.add(arvo);
    }
    
    public int laskeYhdistelmat(int summa) {
        yht = 0;
        osajoukot = 0;
        mukana = new boolean[lista.size()];
        rekursio(0, summa);
        return osajoukot;
    }
    
    public void rekursio(int k, int summa) {
        if (k == lista.size()) {
            for (int i = 0; i < mukana.length; i++) {
                if (mukana[i]) {
                    yht += lista.get(i);
                }
            }
            if (yht == summa) {
                osajoukot++;
            }
            yht = 0;
        } else {
            mukana[k] = true;
            rekursio(k + 1, summa);
            mukana[k] = false;
            rekursio(k + 1, summa);
        }
    }    
}
