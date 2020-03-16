
import java.util.*;

public class Lennot {

    HashMap<String, Integer> koodit = new HashMap<>();
    ArrayList<Integer>[] eteen = new ArrayList[501];
    ArrayList<Integer>[] taakse = new ArrayList[501];
    boolean[] mukana = new boolean[501];

    public Lennot() {
        for (int i = 1; i <= 500; i++) {
            eteen[i] = new ArrayList<>();
            taakse[i] = new ArrayList<>();
        }
    }

    public void lisaaKaupunki(String nimi) {
        if (!koodit.containsKey(nimi)) {
            koodit.put(nimi, koodit.size() + 1);
        }
    }

    public void lisaaYhteys(String alku, String loppu) {
        int eka = koodit.get(alku);
        int toka = koodit.get(loppu);
        eteen[eka].add(toka);
        taakse[toka].add(eka);
    }


    public boolean onkoKaikki() {
        int n = koodit.size();
        for (int i = 1; i <= n; i++) {
            mukana[i] = false;
        }
        hakuEes(1);
        for (int i = 1; i <= n; i++) {
            if (!mukana[i]) {
                return false;
            }
            mukana[i] = false;
        }
        hakuTaas(1);
        for (int i = 1; i <= n; i++) {
            if (!mukana[i]) {
                return false;
            }
        }
        return true;
    }
    
        void hakuEes(int solmu) {
        if (mukana[solmu]) {
            return;
        }
        mukana[solmu] = true;
        for (Integer k : eteen[solmu]) {
            hakuEes(k);
        }
    }

    void hakuTaas(int solmu) {
        if (mukana[solmu]) {
            return;
        }
        mukana[solmu] = true;
        for (Integer k : taakse[solmu]) {
            hakuTaas(k);
        }
    }
}
