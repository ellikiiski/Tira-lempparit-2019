
import java.util.*;

public class Main {

    static class Laskuri {
        ArrayDeque<Long> jono;
        long yhtVeloitettu;

        Laskuri() {
            jono = new ArrayDeque<>();
            yhtVeloitettu = 0;
            jono.addFirst(yhtVeloitettu);
        }

        void lisaaJonoon() {
            jono.addLast(yhtVeloitettu);
        }

        void veloita(long x) {
            yhtVeloitettu += x;
            long apu = jono.pollFirst();
            jono.addFirst(yhtVeloitettu);
        }

        long paastaSisaan() {
            if (jono.size() == 1) {
                return 0;
            }
            long apu = jono.getFirst();
            long yhtVeloitettuNyt = jono.pollFirst();
            long ekaaEnnenVeloitettu = jono.pollFirst();
            long maksettu = yhtVeloitettuNyt - ekaaEnnenVeloitettu;
            jono.addFirst(apu);
            return maksettu;
        }
    }

    public static void main(String[] args) {
        Laskuri l = new Laskuri();
        System.out.println(l.paastaSisaan()); //0
        l.veloita(1);
        l.lisaaJonoon();
        System.out.println(l.paastaSisaan()); //0
        l.lisaaJonoon();
        l.veloita(2);
        l.lisaaJonoon();
        l.veloita(3);
        System.out.println(l.paastaSisaan()); //5
        System.out.println(l.paastaSisaan()); //3

        System.out.println("");

        l.lisaaJonoon();
        l.lisaaJonoon();
        l.lisaaJonoon();
        l.veloita(1337);
        l.lisaaJonoon();
        l.veloita(1);
        l.lisaaJonoon();
        System.out.println(l.paastaSisaan()); //1338
        System.out.println(l.paastaSisaan()); //1338
        l.veloita(2);
        l.lisaaJonoon();
        System.out.println(l.paastaSisaan()); //1340
        System.out.println(l.paastaSisaan()); //3
        System.out.println(l.paastaSisaan()); //2
        System.out.println(l.paastaSisaan()); //0

        System.out.println("");

        l.lisaaJonoon();
        l.veloita(1000000000);
        l.veloita(1000000000);
        l.veloita(1000000000);
        System.out.println(l.paastaSisaan()); // 3000000000
    }
}
