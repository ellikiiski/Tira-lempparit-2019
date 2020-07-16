## Inversiot ##

Taulukon inversio on alkiopari, jonka vasen alkio on suurempi kuin oikea alkio. Esimerkiksi taulukon [3,1,4,2] inversiot ovat (3,1), (3,2) ja (4,2), eli taulukossa on yhteensä 3 inversiota.
Tehtäväsi on muodostaa taulukko, jossa on <em>n</em> lukua väliltä 1...<em>n</em> ja <em>k</em> inversiota.

Tee luokka <em>Inversiot</em>, jossa on seuraava metodi:

<pre>public int[] muodosta(int n, long k)</pre>

Metodin tulee palauttaa mikä tahansa taulukko, joka täyttää vaaditut ehdot. Voit olettaa, että <em>n</em> on välillä 1...10<sup>6</sup> ja <em>k</em> on sellainen, että jokin ratkaisu on olemassa.
Seuraava koodi esittelee luokan käyttämistä:

<pre>Inversiot i = new Inversiot();
int[] taulukko1 = i.muodosta(4,3);
int[] taulukko2 = i.muodosta(4,0);
int[] taulukko3 = i.muodosta(4,6);
System.out.println(Arrays.toString(taulukko1)); // [3,1,4,2]
System.out.println(Arrays.toString(taulukko2)); // [1,1,1,1]
System.out.println(Arrays.toString(taulukko3)); // [4,3,2,1]</pre>
