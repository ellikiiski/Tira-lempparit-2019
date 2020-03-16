## Huoneiden lukumäärä ##

Sinulle annetaan kartta talon huoneista, ja tehtäväsi on laskea, montako huonetta talossa on. Kartta on ruudukko, jonka jokainen ruutu on lattiaa (0) tai seinää (1). Kaksi lattiaruutua ovat samassa huoneessa, jos ne ovat vierekkäin vaaka- tai pystysuunnassa. Voit olettaa, että jokainen reunalla oleva ruutu on seinää.

Tee luokka <em>Huoneet</em>, jossa on seuraava metodi:

<pre>public int laske(int[][] kartta)</pre>

Metodin tulee palauttaa talon huoneiden määrä. Voit olettaa, että talon leveys ja korkeus on enintään 1000.
Seuraava koodi esittelee luokan käyttämistä:

<pre>Huoneet h = new Huoneet();
int[][] kartta = {
    {1,1,1,1,1,1,1,1},
    {1,0,1,0,1,0,0,1},
    {1,1,1,0,1,0,1,1},
    {1,0,1,0,1,0,0,1},
    {1,1,1,1,1,1,1,1},
};
System.out.println(h.laske(kartta)); // 4</pre>
