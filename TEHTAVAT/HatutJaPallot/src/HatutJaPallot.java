import java.util.*;

public class HatutJaPallot {
    HashMap<Integer, Integer> hatut;
    int eniten;
    
    public HatutJaPallot() {
        hatut = new HashMap<>();
        eniten = 0;
    }
    
    public void lisaaPallo(int hattuId) {
        hatut.put(hattuId, (hatut.getOrDefault(hattuId, 0) + 1));
        if (hatut.get(hattuId) > eniten) {
            eniten = hatut.get(hattuId);
        }
    }

    public int enitenPalloja() {
        return eniten;
    }

}
