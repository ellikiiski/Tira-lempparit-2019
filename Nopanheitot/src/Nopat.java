import java.util.*;

public class Nopat {
    
    public long laske(int n) {
        long[] heitot = new long[n+1];
        if (n == 1 || n == 0) {
            return 1;
        }
        heitot[0] = 1;
        heitot[1] = 1;
        for (int i = 2; i < 6; i++) {
            heitot[i] = heitot[i-1] * 2;
            if (i == n) {
                return heitot[i];
            }
        }
        for (int i = 6; i <= n; i++) {
            heitot[i] = heitot[i-1] + heitot[i-2] + heitot[i-3] + heitot[i-4] + heitot[i-5] + heitot[i-6];
        }
        return heitot[n];
    }
}
