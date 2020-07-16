import java.util.*;

public class Pinolaskin {   
    
    public long laske(String lasku) {
        ArrayDeque<String> pino = new ArrayDeque<>();
        String[] merkit = lasku.split(" ");
        
        for (int i = 0; i < merkit.length; i++) {
            if (merkit[i].equals("+")) {                
                long summa = Long.valueOf(pino.getFirst());
                pino.removeFirst();
                summa += Long.valueOf(pino.getFirst());
                pino.removeFirst();
                pino.addFirst("" + summa);
            } else if (merkit[i].equals("*")) {
                long tulo = Long.valueOf(pino.getFirst());
                pino.removeFirst();
                tulo *= Long.valueOf(pino.getFirst());
                pino.removeFirst();
                pino.addFirst("" + tulo);
            } else {
                pino.addFirst(merkit[i]);
            }
        }
        long palauta = Long.parseLong(pino.getFirst());
        return palauta;
    }    
}
