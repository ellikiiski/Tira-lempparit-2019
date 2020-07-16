
import java.util.*;

public class Kone implements Comparable<Kone> {
        public long valmAika;
        public long valmAikaSeur;
        
        public Kone(int aika, long valmAika, long valmAikaSeur) {
            this.valmAika = valmAika;
            this.valmAikaSeur = valmAikaSeur;
        }
        
        @Override
        public int compareTo(Kone toinen) {
            if (this.valmAikaSeur < toinen.valmAikaSeur) {
                return -1;
            } else if (this.valmAikaSeur > toinen.valmAikaSeur) {
                return 1;
            } else {
                return 0;
            }
        }

        public long getValmAika() {
            return valmAika;
        }

        public long getValmAikaSeur() {
            return valmAikaSeur;
        }
        
        
}

