import java.util.*;

public class Anagrammit {
    HashMap<String, Integer> hajaArvot;
    
    public Anagrammit() {
        hajaArvot = new HashMap<>();
    }
    
    public void lisaaSana(String sana) {
        char[] kirjaimet = sana.toCharArray();
        String sortedSana = "";
        Arrays.sort(kirjaimet);
        for (int i = 0; i < kirjaimet.length; i++) {
            sortedSana += kirjaimet[i];
        }
        if (hajaArvot.containsKey(sortedSana) ) {
            hajaArvot.put(sortedSana, hajaArvot.get(sortedSana) + 1);
        } else {
            hajaArvot.put(sortedSana, 1);
        }
    }

    public int laskeAnagrammit(String sana) {
        char[] kirjaimet = sana.toCharArray();
        String sortedSana = "";
        Arrays.sort(kirjaimet);
        for (int i = 0; i < kirjaimet.length; i++) {
            sortedSana += kirjaimet[i];
        }
        if (!hajaArvot.containsKey(sortedSana)) {
            return 0;
        }        
        return hajaArvot.get(sortedSana);
    }

}
