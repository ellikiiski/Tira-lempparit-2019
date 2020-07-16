public class Main {
    public static void main(String[] args) {
        Jakokohta j = new Jakokohta();
        int[] taulukko1 = {2,1,3,5,4,6};
        int[] taulukko2 = {6,1,5,2,4,3};
        int[] taulukko3 = {3,2,1,6,5,4};
        int[] taulukko4 = {1,1,1,2,2,2};
        int[] taulukko5 = {3,1,5,2,6,4};
        int[] taulukko6 = {3,1,4,2,6,5};
        int[] taulukko7 = {2,5,3,7,4,2,4,5,6,7,8,9};
        int[] taulukko8 = {6,5,4,7,8,9};
        System.out.println(j.laske(taulukko1)); // 3
        System.out.println(j.laske(taulukko2)); // 0
        System.out.println(j.laske(taulukko3)); // 1
        System.out.println(j.laske(taulukko4)); // 1
        System.out.println(j.laske(taulukko5));
        System.out.println(j.laske(taulukko6));
        System.out.println(j.laske(taulukko7));
        System.out.println(j.laske(taulukko8));
    }
}
