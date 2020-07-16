import java.util.*;

public class Hotelli {
    
    TreeMap<Integer, Integer> hotelli = new TreeMap<>();
    
    public void lisaaHuone(int koko) {
        if (hotelli.containsKey(koko)) {
            hotelli.put(koko, hotelli.get(koko) + 1);
        } else {
            hotelli.put(koko, 1);
        }
    }
    
    public int varaaHuone(int koko) {
        if (hotelli.ceilingKey(koko) == null) {
            return 0;
        }
        int varaus = hotelli.ceilingKey(koko);
        hotelli.put(varaus, hotelli.get(varaus) - 1);
        if (hotelli.get(varaus) == 0) {
            hotelli.remove(varaus);
        }
        return varaus;
    }
}
