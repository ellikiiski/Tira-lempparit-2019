## Kolikkoyhdistelmät ##

Sinulla on n kolikkoa, joilla on tietyt arvot. Monellako tavalla voit valita osajoukon kolikoista niin, että niiden arvojen summa on haluttu luku?
Esimerkiksi jos n = 4 ja kolikot ovat [2,2,2,3], voit valita 3 tavalla osajoukon, jonka summa on 7. Osajoukossa on kaksi kolikkoa, joiden arvo on 2, sekä yksi kolikko, jonka arvo on 3.

Tee luokka Kolikot, jossa on seuraavat metodit:

<em>public void lisaaKolikko(int arvo)</em>

<em>public int laskeYhdistelmat(int summa)</em>

Metodi lisaaKolikko lisää uuden kolikon, jolla on tietty arvo, ja metodi laskeYhdistelmat ilmoittaa, monellako tavalla kolikoista voi muodostaa osajoukon, jolla on haluttu summa. Voit olettaa, että jokaisessa testissä kolikoiden määrä on enintään 20.
Seuraava koodi esittelee luokan käyttämistä:

<pre>Kolikot k = new Kolikot();
k.lisaaKolikko(2);
k.lisaaKolikko(2);
k.lisaaKolikko(2);
k.lisaaKolikko(3);
System.out.println(k.laskeYhdistelmat(1)); // 0
System.out.println(k.laskeYhdistelmat(2)); // 3
System.out.println(k.laskeYhdistelmat(7)); // 3
System.out.println(k.laskeYhdistelmat(8)); // 0
System.out.println(k.laskeYhdistelmat(9)); // 1</pre>
