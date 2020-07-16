import java.util.*;

public class ListanLyhennys {    
    public int laske(int[] taulukko) {
        ArrayDeque<Integer> luvut = new ArrayDeque<>();
        for (int i = 0; i < taulukko.length; i++) {
            luvut.addFirst(taulukko[i]);
        }
        luvut.addLast(0);
        while (true) {
            if (luvut.getFirst() == 0) {
                luvut.removeFirst();
                break;
            } else if (Objects.equals(luvut.getFirst(), luvut.getLast())) {
                luvut.pollFirst();
                luvut.pollLast();
            } else {
                luvut.addLast(luvut.pollFirst());
            }
        }        
        return luvut.size();
    }    
}
