import java.util.*;

public class Pisteet {
    TreeSet<Integer> pistepuu = new TreeSet<>();
    
    public void lisaaPiste(int x) {
        pistepuu.add(x);
    }
    
    public int etaisyys(int x) {
        if (pistepuu.contains(x)) {
            return 0;
        }
        int ylempi = -1;
        int alempi = -1;
        if (pistepuu.higher(x) != null) {
            ylempi = pistepuu.higher(x);
        }
        if (pistepuu.lower(x) != null) {
            alempi = pistepuu.lower(x);
        }        
        if (ylempi == -1) {
            return x - alempi;
        }
        if (alempi == -1) {
            return ylempi - x;
        }
        return Math.min(x - alempi, ylempi - x);
    }
}
