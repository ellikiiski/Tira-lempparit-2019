import java.util.*;

public class Mediaani {
    private PriorityQueue<Integer> alleM;
    private PriorityQueue<Integer> yliM;
    boolean alleMisompi;
    
    public Mediaani() {
        alleM = new PriorityQueue<>(1000000, Collections.reverseOrder());
        yliM = new PriorityQueue<>();
        alleMisompi = false;
    }
    
    public void lisaaLuku(int x) {
        if (alleM.isEmpty()) {
            alleM.add(x);
        } else if (alleMisompi) {
            if (x < alleM.peek()) {
                yliM.add(alleM.poll());
                alleM.add(x);
            } else {
                yliM.add(x);
            }
        } else {
            if (x <= alleM.peek()) {
                alleM.add(x);
            } else {
                yliM.add(x);
                alleM.add(yliM.poll());
            }
        }
        alleMisompi = !alleMisompi;        
    }
    
    public int mediaani() {
        return alleM.peek();
    }
}
