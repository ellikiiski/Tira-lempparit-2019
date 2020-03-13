## Listan lyhennys ##

Annettuna on lista, jossa on <em>n</em> kokonaislukua. Saat valita joka siirrolla kaksi vierekkäistä lukua, jotka ovat yhtä suuret, ja poistaa ne listalta. Haluat poistaa listalta mahdollisimman monta lukua.
Esimerkiksi jos lista on [1,2,2,1,1,1,3], voit tehdä poistot näin: [1,2,2,1,1,1,3] → [1,1,1,1,3] → [1,1,3] → [3]. Tämä on lyhin mahdollinen lista, jonka voit saada aikaan poistoja tekemällä.

Tee luokka <em>ListanLyhennys</em>, jossa on seuraava metodi:

<pre>public int laske(int[] taulukko)</pre>

Metodin tulee palauttaa yksi kokonaisluku: pienin mahdollinen listan pituus poistojen jälkeen. Voit olettaa, että <em>n</em>
on enintään 10<sup>6</sup> ja jokainen luku on välillä 1...10<sup>9</sup>.
Seuraava koodi esittelee luokan käyttämistä:

<pre>ListanLyhennys l = new ListanLyhennys();
int[] lista1 = {1,2,2,1,1,1,3};
int[] lista2 = {1,2,3,4,5,6,7,8};
int[] lista3 = {1,1,1,1,2,2,2,2};
int[] lista4 = {1,2,3,4,4,3,2,1};
int[] lista5 = {1,2,1,1,2,2,1,1,2,2,1};
System.out.println(l.laske(lista1)); // 1
System.out.println(l.laske(lista2)); // 8
System.out.println(l.laske(lista3)); // 0
System.out.println(l.laske(lista4)); // 0
System.out.println(l.laske(lista5)); // 3</pre>
