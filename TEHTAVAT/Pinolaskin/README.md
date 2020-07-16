## Pinolaskin ##

Käänteinen puolalainen notaatio on tavallisesta poikkeava tapa esittää laskutoimituksia.
Esimerkiksi laskutoimitus "5*(1+2)+4" esitetään muodossa "5 1 2 + * 4 +". Notaation etuna on,
että siinä ei ole sulkuja ja laskutoimitus on helppoa laskea tietokoneella.

Käänteisessä puolalaisessa notaatiossa oleva laskutoimitus lasketaan pinon avulla. Laskennan alussa pino on tyhjä, ja laskutoimituksen osat käydään läpi vasemmalta oikealle.
Kun vastaan tulee luku, se lisätään pinoon. Kun taas vastaan tulee operaatio (esim. + tai *), pinosta poistetaan kaksi ylintä lukua ja niiden tulos operaation jälkeen lisätään pinoon.
Lopuksi pinossa on vain yksi luku, joka on laskutoimituksen tulos.

Tee luokka <em>Pinolaskin</em>, jossa on seuraava metodi:

<pre>public long laske(String lasku)</pre>

Metodille annetaan laskutoimitus käänteisessä puolalaisessa notaatiossa, ja sen tulee palauttaa laskun tulos.
Voit olettaa, että kaikki luvut ovat kokonaislukuja, jokainen operaatio on + tai * ja kaikissa väleissä on yksi välilyönti.
Voit lisäksi olettaa, että laskussa on enintään tuhat merkkiä ja kaikki laskennan aikana esiintyvät luvut mahtuvat <em>long</em>-muuttujaan.
Seuraava koodi esittelee luokan käyttämistä:

<pre>Pinolaskin p = new Pinolaskin();
System.out.println(p.laske("1 2 +")); // 3
System.out.println(p.laske("1 1 1 1 + + +")); // 4
System.out.println(p.laske("5 1 2 + * 4 +")); // 19
System.out.println(p.laske("10 10 10 * *")); // 1000</pre>
