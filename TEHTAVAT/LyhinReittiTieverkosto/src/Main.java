
import java.util.*;

public class Main {

    public static class Reitti implements Comparable<Reitti> {
        public Integer solmu;
        public Long aika;

        Reitti(int solmu, long aika) {
            this.solmu = solmu;
            this.aika = aika;
        }

        @Override
        public int compareTo(Reitti re) {
            if (aika.equals(re.aika)) {
                return solmu.compareTo(re.solmu);
            }
            return aika.compareTo(re.aika);
        }
    }

    public static long lyhinReitti(int n, int[] mista, int[] minne, long[] matka) {
        ArrayList<Reitti>[] vieruslista = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            vieruslista[i] = new ArrayList();
        }
        for (int i = 0; i < mista.length; i++) {
            vieruslista[mista[i]].add(new Reitti(minne[i], matka[i]));
            vieruslista[minne[i]].add(new Reitti(mista[i], matka[i]));
        }
        long[] etaisyys = new long[n + 1];
        boolean[] kasitelty = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            etaisyys[i] = Long.MAX_VALUE;
        }
        PriorityQueue<Reitti> jono = new PriorityQueue();
        etaisyys[1] = 0;
        jono.add(new Reitti(1, 0l));
        while (!jono.isEmpty()) {
            Reitti reitti = jono.poll();
            int s = reitti.solmu;
            long a = reitti.aika;
            if (kasitelty[s]) {
                continue;
            }
            kasitelty[s] = true;
            for (Reitti seuraava : vieruslista[s]) {
                if (etaisyys[seuraava.solmu] > a + seuraava.aika) {
                    etaisyys[seuraava.solmu] = a + seuraava.aika;
                    jono.add(new Reitti(seuraava.solmu, etaisyys[seuraava.solmu]));
                }
            }
        }

        if (etaisyys[n] == Long.MAX_VALUE) {
            return -1;
        }
        return etaisyys[n];
    }

    public static void main(String[] args) {
        System.out.println(lyhinReitti(3, new int[]{1, 2}, new int[]{2, 3}, new long[]{5, 3}));
        System.out.println(lyhinReitti(3, new int[]{1, 1}, new int[]{2, 3}, new long[]{2, 3}));
        System.out.println(lyhinReitti(3, new int[]{1, 2, 1}, new int[]{3, 3, 2}, new long[]{9, 1, 1}));
        System.out.println(lyhinReitti(3, new int[]{1, 2, 1}, new int[]{3, 3, 2}, new long[]{1, 9, 9}));
    }
}
