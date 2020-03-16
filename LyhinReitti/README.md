## Lyhin reitti labyrintissa ##

Sinulle annetaan labyrintin kuvaus, ja tehtäväsi on etsiä lyhin reitti alkuruudusta loppuruutuun. Kuvauksessa 0 tarkoittaa lattiaa, 1 tarkoittaa seinää, 2 tarkoittaa alkuruutua ja 3 tarkoittaa loppuruutua. Labyrintissa on tarkalleen yksi alkuruutu ja loppuruutu, ja jokainen reunaruutu on seinää.

Tee luokka <em>Labyrintti</em>, jossa on seuraava metodi:

<pre>public int laske(int[][] kartta)</pre>

Metodin tulee palauttaa lyhimmän reitin pituus alkuruudusta loppuruutuun. Kuitenkin jos mitään reittiä ei ole olemassa, metodin tulee palauttaa luku -1. Voit olettaa, että labyrintin korkeus ja leveys ovat enintään 1000.
Seuraava koodi esittelee luokan käyttämistä:

<pre>Labyrintti l = new Labyrintti();
int[][] kartta = {
    {1,1,1,1,1,1,1,1},
    {1,2,1,0,0,3,0,1},
    {1,0,1,0,1,1,0,1},
    {1,0,0,0,0,0,0,1},
    {1,1,1,1,1,1,1,1},
};
System.out.println(l.laske(kartta)); // 8</pre>
