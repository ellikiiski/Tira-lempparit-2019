## Mediaani ##

Listan mediaani on keskimmäinen alkio, kun alkiot järjestetään pienimmästä suurimpaan. Esimerkiksi listan [3,1,4,7,1] mediaani on 3, koska lista on järjestettynä [1,1,3,4,7]. Jos listalla on parillinen määrä alkioita, määrittelemme mediaanin tässä tehtävässä niin, että se on keskikohdan vasemmalla puolella oleva alkio.
Tee luokka <em>Mediaani</em>, jossa on seuraavat metodit:

<pre>public void lisaaLuku(int x)
public int mediaani()</pre>

Lista on aluksi tyhjä, ja metodi <em>lisaaLuku</em> lisää uuden luvun listan loppuun. Voit olettaa, että luku on välillä 1...10<sup>9</sup>. Metodi <em>mediaani</em> puolestaan ilmoittaa listan mediaanin.
Seuraava koodi esittelee luokan käyttämistä:

<pre>Mediaani m = new Mediaani();
m.lisaaLuku(3);
System.out.println(m.mediaani()); // 3
m.lisaaLuku(1);
System.out.println(m.mediaani()); // 1
m.lisaaLuku(4);
System.out.println(m.mediaani()); // 3
m.lisaaLuku(7);
System.out.println(m.mediaani()); // 3
m.lisaaLuku(1);
System.out.println(m.mediaani()); // 3</pre>
