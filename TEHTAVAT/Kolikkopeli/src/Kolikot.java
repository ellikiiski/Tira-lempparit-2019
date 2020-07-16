
import java.util.*;

public class Kolikot {

    ArrayList<Integer>[] vl = new ArrayList[501];
    int[] kolikot = new int[501];
    int alku;
    int[] summa = new int[501];
    boolean[] kasitelty = new boolean[501];

    public Kolikot() {
        for (int i = 1; i <= 500; i++) {
            vl[i] = new ArrayList<>();
        }
    }    

    public void lisaaYhteys(int alku, int loppu) {
        vl[loppu].add(alku);
    }

    public void lisaaKolikko(int huone) {
        kolikot[huone]++;
    }

    int haku(int huone) {
        if (huone == alku) {
            return kolikot[huone];
        }
        if (kasitelty[huone]) {
            return summa[huone];
        }
        int tulos = -1;
        for (Integer mista : vl[huone]) {
            tulos = Math.max(tulos, haku(mista) + kolikot[huone]);
        }
        kasitelty[huone] = true;
        summa[huone] = tulos;
        return tulos;
    }

    public int parasTulos(int alku, int loppu) {
        this.alku = alku;
        int tulos = haku(loppu);
        if (tulos < 0) {
            return -1;
        }
        return tulos;
    }

}
