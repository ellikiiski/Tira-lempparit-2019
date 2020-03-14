## Laske luku 2 3 5 ##

Tarkastellaan lukujonoa, jonka jokainen luku on positiivinen kokonaisluku ja saadaan kertomalla lukuja 2, 3 ja 5 keskenään sopivasti. Lukujono alkaa näin:
2, 3, 4, 5, 6, 8, 9, 10, 12, 15, ...

Tee luokka <em>Lukujono</em>, jossa on seuraava metodi:

<pre>public long laskeLuku(int kohta)</pre>

Metodin tulee palauttaa annetussa lukujonon kohdassa oleva luku. Esimerkiksi jos kohta on 6, metodin tulee palauttaa luku 8. Voit olettaa, että kohta on enintään 10000.
Seuraava koodi esittelee luokan käyttämistä:

<pre>Lukujono l = new Lukujono();
System.out.println(l.laskeLuku(1)); // 2
System.out.println(l.laskeLuku(2)); // 3
System.out.println(l.laskeLuku(3)); // 4
System.out.println(l.laskeLuku(10)); // 15
System.out.println(l.laskeLuku(100)); // 1600</pre>
