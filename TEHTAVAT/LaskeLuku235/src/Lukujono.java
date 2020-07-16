import java.util.*;

public class Lukujono {
    public long laskeLuku(int kohta) {
        PriorityQueue<Long> jono = new PriorityQueue<>();
        long i = 0;
        long luku = 1;
        while (i < kohta) {
            jono.add(2*luku);
            if (luku % 2 != 0) {
                jono.add(3*luku);
            }
            if (luku % 2 != 0 && luku % 3 != 0) {
                jono.add(5*luku);
            }
            luku = jono.poll();
            i++;
        }
        return luku;
    }
}
