## Jakokohdat ##

Annettuna on taulukko, jossa on <em>n</em> kokonaislukua. Haluat jakaa taulukon kahteen osaan niin, että jokainen vasemman osan luku on pienempi kuin jokainen oikean osan luku.
Montako mahdollista tapaa tähän on olemassa?
Esimerkiksi kun taulukko on [2,1,3,5,4,6], oikea vastaus on 3. Ratkaisut ovat seuraavat:

* [2,1] ja [3,5,4,6]
* [2,1,3] ja [5,4,6]
* [2,1,3,5,4] ja [6]

Tee luokka Jakokohta, jossa on seuraava metodi:
<pre>public int laske(int[] taulukko)</pre>

Metodin tulee palauttaa jakokohtien määrä annetulle taulukolle. Voit olettaa, että taulukossa on enintään 10<sup>6</sup> lukua, ja jokainen luku on välillä 1...10<sup>9</sup>.
