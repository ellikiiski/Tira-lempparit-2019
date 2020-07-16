
import java.util.*;

public class Main {
    
    public static class Yhteys implements Comparable<Yhteys> {

        public Integer solmu;
        public Long aika;

        Yhteys(int solmu, long aika) {
            this.solmu = solmu;
            this.aika = aika;
        }

        @Override
        public int compareTo(Yhteys yh) {
            if (aika.equals(yh.aika)) {
                return solmu.compareTo(yh.solmu);
            }
            return aika.compareTo(yh.aika);
        }
    }

    public static long yhteysaika(int n, int[] mista, int[] minne, long[] milloin) {
        ArrayList<Yhteys>[] vieruslista = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            vieruslista[i] = new ArrayList();
        }        
        for (int i = 0; i < mista.length; i++) {
            vieruslista[mista[i]].add(new Yhteys(minne[i], milloin[i]));
            vieruslista[minne[i]].add(new Yhteys(mista[i], milloin[i]));
        }
        PriorityQueue<Long>[] toipumisaika = new PriorityQueue[n + 1];
        boolean[] kasitelty = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            toipumisaika[i] = new PriorityQueue<>();
        }
        toipumisaika[1].add(0l);        
        PriorityQueue<Yhteys> jono = new PriorityQueue();
        jono.add(new Yhteys(1, 0l));        
        while (!jono.isEmpty()) {
            Yhteys yhteys = jono.poll();
            int s = yhteys.solmu;
            long a = yhteys.aika;
            if (kasitelty[s]) {
                continue;
            }
            kasitelty[s] = true;
            for (Yhteys seuraava : vieruslista[s]) {
                toipumisaika[seuraava.solmu].add(Math.max(seuraava.aika, a));
                jono.add(new Yhteys(seuraava.solmu, toipumisaika[seuraava.solmu].peek()));
            }
        }
        return toipumisaika[n].peek();
    }

    public static void main(String[] args) {
        System.out.println(yhteysaika(4, new int[]{1, 2, 3}, new int[]{2, 3, 4}, new long[]{1, 2, 1})); //2
        System.out.println(yhteysaika(4, new int[]{1, 1, 2, 3}, new int[]{2, 3, 4, 4}, new long[]{1, 5, 8, 7})); //7
        System.out.println(yhteysaika(5, new int[]{1, 2, 2, 3, 4}, new int[]{2, 3, 4, 5, 5}, new long[]{10, 1, 8, 1, 9})); //10
        System.out.println(yhteysaika(5, new int[]{1, 2, 2, 3, 4}, new int[]{2, 3, 4, 5, 5}, new long[]{1, 1, 8, 1, 9})); //1
    }
}
