## Nopanheitot ##

Tehtäväsi on laskea, monellako tavalla voit heittää nopilla tietyn summan. Jokainen heitto voi tuottaa silmäluvun 1–6.
Esimerkiksi jos summa on 4, tapoja on 8:

1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2, 1+3, 3+1, 4

Tee luokka <em>Nopat</em>, jossa on seuraava metodi:

<pre>public long laske(int n)</pre>

Metodin tulee palauttaa tapojen määrä, kun haluttu summa on <em>n</em>. Voit olettaa, että <em>n</em> on enintään 50, jolloin vastaus mahtuu long-tyyppiin.
Seuraava koodi esittelee luokan käyttämistä:

<pre>Nopat n = new Nopat();
System.out.println(n.laske(2)); // 2
System.out.println(n.laske(5)); // 16
System.out.println(n.laske(10)); // 492
System.out.println(n.laske(20)); // 463968</pre>
