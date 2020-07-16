public class Jakokohta {
    
    public int laske(int[] taulukko) {
        int laskuri = 0;
        int n = taulukko.length;
        int[] suurin = new int[n];
        int[] pienin = new int[n];
        suurin[0] = taulukko[0];
        pienin[n-1] = taulukko[n-1];
        
        for (int i = 1; i < n; i++) {
            if (taulukko[i] > suurin[i-1]) {
                suurin[i] = taulukko[i];
            } else {
                suurin [i] = suurin[i-1];
            }                      
        }
        for (int i = n - 2; i >= 0; i--) {
            if (taulukko[i] < pienin[i + 1]) {
                pienin[i] = taulukko[i];
            } else {
                pienin[i] = pienin[i + 1];
            }
        }
        for (int i = 0; i < n; i++) {
            if (i+1 == n) {
                continue;
            } else if (suurin[i] < suurin[i+1] && suurin[i] < pienin[i+1]) {
                laskuri++;
            }
        }
        return laskuri;
    }    
}
