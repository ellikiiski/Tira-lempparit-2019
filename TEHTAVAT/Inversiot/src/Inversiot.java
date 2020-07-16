import java.util.*;

public class Inversiot {

    public int[] muodosta(int n, long k) {
        int[] taulukko = new int[n];
        double muuttuja = n - 1;
        int pienin = 1;
        for (int i = 0; i < n; i++) {
            if (k - muuttuja >= 0) {
                taulukko[i] = n - i;
                k -= muuttuja;
            } else {
                taulukko[i] = pienin;
            }
            muuttuja--;
        }
        return taulukko;
    }
}