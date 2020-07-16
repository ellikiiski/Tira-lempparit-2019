
import java.util.*;

public class Main {

    public static long lyhinAika(int[] koneet, int maara) {
        PriorityQueue<Kone> kone = new PriorityQueue<>();
        long aika = 0;
        int valmiit = 0;
        for (int i = 0; i < koneet.length; i++) {
            kone.add(new Kone(0, koneet[i], koneet[i]));
        }
        while (valmiit < maara) {
            if (aika == kone.peek().getValmAikaSeur()) {
                valmiit++;
                kone.add(new Kone(0, kone.peek().getValmAika(), kone.peek().getValmAikaSeur() + kone.poll().getValmAika()));
            } else {
                aika = (long) kone.peek().getValmAikaSeur();
            }
        }
        return aika;
    }

    public static void main(String[] args) {
        System.out.println(lyhinAika(new int[]{1}, 5)); // 5
        System.out.println(lyhinAika(new int[]{1, 1, 1}, 6)); // 2
        System.out.println(lyhinAika(new int[]{5, 1, 1}, 6)); // 3
        System.out.println(lyhinAika(new int[]{1, 2, 3, 4}, 10)); // 6
    }
}
