
import java.util.*;

public class SuurinVerkko {

    int[] vanhempi = new int[1000001];
    int[] koko = new int[1000001];
    int suurinVerkko;

    public SuurinVerkko() {
        this.suurinVerkko = 1;
        for (int i = 1; i <= 1000000; i++) {
            vanhempi[i] = i;
            koko[i] = 1;
        }
    }

    int edustaja(int e) {
        while (vanhempi[e] != e) {
            e = vanhempi[e];
        }
        return e;
    }

    void yhdista(int a, int b) {
        int edustajaA = edustaja(a);
        int edustajaB = edustaja(b);

        if (koko[edustajaA] < koko[edustajaB]) {
            int apu = edustajaA;
            edustajaA = edustajaB;
            edustajaB = apu;
        }

        vanhempi[edustajaB] = edustajaA;
        koko[edustajaA] += koko[edustajaB];
        this.suurinVerkko = Math.max(this.suurinVerkko, koko[edustajaA]);
    }

    public void lisaaYhteys(int a, int b) {
        if (edustaja(a) == edustaja(b)) {
            return;
        }
        yhdista(a, b);
    }

    public boolean onkoSamassa(int a, int b) {
        if (edustaja(a) == edustaja(b)) {
            return true;
        }
        return false;
    }

    public int suurinVerkko() {
        return this.suurinVerkko;
    }
}
