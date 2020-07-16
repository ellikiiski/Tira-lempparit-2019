## Onko reitti? ##

Sinulle annetaan kartta talon huoneista, ja tehtäväsi on vastata kyselyihin muotoa: onko kahden ruudun välillä reittiä? Kartta on ruudukko, jonka jokainen ruutu on lattiaa (0) tai seinää (1). Kaksi lattiaruutua ovat yhteydessä toisiinsa, jos ne ovat vierekkäin vaaka- tai pystysuunnassa. Voit olettaa, että jokainen reunalla oleva ruutu on seinää.

Tee luokka <em>Reitit</em>, jossa on seuraava metodi:

<pre>public void asetaKartta(int[][] kartta)
public boolean onkoReitti(int y1, int x1, int y2, int x2)</pre>

Metodille <em>asetaKartta</em> annetaan kartta huoneista. Tämän jälkeen metodilta <em>onkoReitti</em> voi kysyä, onko ruudusta (<em>y1</em>,<em>x1</em>)
reittiä ruutuun (<em>y2</em>,<em>x2</em>). Ruudut on numeroitu nollasta alkaen. Voit olettaa, että talon leveys ja korkeus on enintään 1000. 
Lisäksi metodia <em>asetaKartta</em> kutsutaan vain kerran ja metodia <em>onkoReitti</em> kutsutaan enintään 10<sup>5</sup> kertaa.
Seuraava koodi esittelee luokan käyttämistä:

<pre>Reitit r = new Reitit();
int[][] kartta = {
    {1,1,1,1,1,1,1,1},
    {1,0,1,0,1,0,0,1},
    {1,1,1,0,1,0,1,1},
    {1,0,1,0,1,0,0,1},
    {1,1,1,1,1,1,1,1},
};
r.asetaKartta(kartta);
System.out.println(r.onkoReitti(1,1,1,1)); // true
System.out.println(r.onkoReitti(1,1,3,6)); // false
System.out.println(r.onkoReitti(1,6,3,6)); // true
System.out.println(r.onkoReitti(1,2,3,2)); // false</pre>
