public class Piirileikki {
    
    public int viimeinen(int n) {
        int[] taulukko = new int[n];
        for (int i = 0; i < n; i++) {
            taulukko[i] = i + 1;
        }
        boolean pois = false;
        int viimPoistettu = 0;
        int jaljella = taulukko.length;
        while (true) {
            
            for (int i = 0; i < taulukko.length; i++) {
                if (taulukko[i] == 0) {
                    continue;
                } else if (pois) {
                    //System.out.println(taulukko[i]);
                    viimPoistettu = taulukko[i];
                    taulukko[i] = 0;
                    jaljella -= 1;
                }
                pois = !pois;                
            }
            if (jaljella == 0) {
                return viimPoistettu;
            }            
        }
    }
    
}
