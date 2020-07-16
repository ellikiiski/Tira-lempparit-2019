
import java.util.*;

public class Main {

    public static int kierros(int[][] et) {
        int n = et.length;
        boolean[] mukana = new boolean[n];
        mukana[0] = true;
        for (int i = 1; i < n; i++) {
            mukana[i] = false;
        }
        int[] reitti = new int[n];
        reitti[0] = 0;
        reitti[n-1] = 0;
        return tsp(reitti, mukana, 1, 0, et);
    }
    
    public static int tsp(int[] reitti, boolean[] mukana, int k, int pituus, int[][] et) {
        int n = mukana.length;
        if (n == k) {
            return pituus + et[reitti[n-1]][0];
        }
        int paras = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (!mukana[i]) {
                reitti[k] = i;
                mukana[i] = true;
                int arvo = tsp(reitti, mukana, k+1, pituus + et[reitti[k-1]][i], et);
                paras = Math.min(paras, arvo);
                mukana[i] = false;
            }
        }
        return paras;
    }  

    public static void main(String[] args) {
        int[][] e1 = {{0, 3, 2, 1},
        {3, 0, 4, 2},
        {2, 4, 0, 4},
        {1, 2, 4, 0}};
        System.out.println(kierros(e1));    //9

        int[][] e2 = {{0, 2, 1, 1},
        {2, 0, 1, 1},
        {1, 1, 0, 2},
        {1, 1, 2, 0}};
        System.out.println(kierros(e2));    //4

        int[][] e3 = {{0, 1, 2, 1},
        {1, 0, 1, 2},
        {2, 1, 0, 1},
        {1, 2, 1, 0}};
        System.out.println(kierros(e3));    //4

        int[][] e4 = {{0, 1, 2, 3},
        {1, 0, 4, 5},
        {2, 4, 0, 6},
        {3, 5, 6, 0}};
        System.out.println(kierros(e4));    //14
    }
}
