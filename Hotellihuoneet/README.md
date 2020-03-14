## Hotellihuoneet ##

Tehtäväsi on pitää yllä tietoa hotellin huoneista. Hotelliin tulee uusia vapaita huoneita, ja asiakkaat varaavat huoneita.
Tee luokka <em>Hotelli</em>, jossa on seuraavat metodit:

<pre>public void lisaaHuone(int koko)
public int varaaHuone(int koko)</pre>

Alussa hotellissa ei ole saatavilla mitään huonetta. Metodi <em>lisaaHuone</em> lisää saataville huoneen, jolla on tietty koko. Metodi <em>varaaHuone</em> varaa asiakkaalle huoneen, jonka koko on vähintään parametrina annettu mutta mahdollisimman pieni. Metodi palauttaa varatun huoneen koon tai luvun 0, jos mitään sopivaa huonetta ei löytynyt. Kummankin metodin tulee toimia tehokkaasti.
Seuraava koodi esittelee luokan käyttämistä:

<pre>Hotelli h = new Hotelli();
h.lisaaHuone(5);
h.lisaaHuone(5);
h.lisaaHuone(7);
System.out.println(h.varaaHuone(1)); // 5
System.out.println(h.varaaHuone(5)); // 5
System.out.println(h.varaaHuone(6)); // 7
System.out.println(h.varaaHuone(7)); // 0
h.lisaaHuone(3);
h.lisaaHuone(9);
System.out.println(h.varaaHuone(7)); // 9</pre>
