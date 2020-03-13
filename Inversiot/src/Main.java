import java.util.*;

public class Main {
    public static void main(String[] args) {
        Inversiot i = new Inversiot();
        int[] taulukko1 = i.muodosta(4,3);
        int[] taulukko2 = i.muodosta(4,0);
        int[] taulukko3 = i.muodosta(4,6);
        int[] taulukko4 = i.muodosta(3,1);
        int[] taulukko5 = i.muodosta(3,2);
        System.out.println(Arrays.toString(taulukko1)); // [3,1,4,2] esim
        System.out.println(Arrays.toString(taulukko2)); // [1,1,1,1]
        System.out.println(Arrays.toString(taulukko3)); // [4,3,2,1]
        System.out.println(Arrays.toString(taulukko4));
        System.out.println(Arrays.toString(taulukko5));
    }
}
