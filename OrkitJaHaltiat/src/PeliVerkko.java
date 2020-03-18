
import java.util.*;

public class PeliVerkko {

    public int n = 1000001;
    public int[] vanhempi = new int[n + 1];
    public int[] koko = new int[n + 1];
    boolean joo = true;
    ArrayList<Integer>[] edustajat = new ArrayList[n];
    int[] orkkiVaiHaltia = new int[n];

    public PeliVerkko() {
        for (int i = 1; i <= n; i++) {
            vanhempi[i] = i;
            koko[i] = 1;
        }
        for (int i = 0; i < edustajat.length; i++) {
            edustajat[i] = new ArrayList<>();
        }
    }

    public int edustaja(int edu) {
        while (edu != vanhempi[edu]) {
            edu = vanhempi[edu];
        }
        return edu;
    }

    public void lisaaYhteys(int a, int b) {
        int edustajaA = edustaja(a);
        int edustajaB = edustaja(b);

        if (edustajaA == edustajaB && orkkiVaiHaltia[a] == orkkiVaiHaltia[b]) {
            joo = false;
        }
        if (edustajaA != edustajaB) {
            if (orkkiVaiHaltia[a] == orkkiVaiHaltia[b]) {
                edustajat[edustaja(a)].add(a);
                edustajat[edustaja(b)].add(b);
                int apumuuttuja;
                for (int i : edustajat[b]) {
                    apumuuttuja = orkkiVaiHaltia[i];
                    if (apumuuttuja == 0) {
                        orkkiVaiHaltia[i] = 1;
                    }
                    if (apumuuttuja == 1) {
                        orkkiVaiHaltia[i] = 0;
                    }
                }
            }

            if (koko[edustajaA] < koko[edustajaB]) {
                int apumuuttuja = edustajaB;
                edustajaB = edustajaA;
                edustajaA = apumuuttuja;
            }
            vanhempi[edustajaB] = edustajaA;
            koko[edustajaA] += koko[edustajaB];
        }
    }

    public boolean voikoPelata() {
        return joo;
    }
}
