## Örkit ja haltiat ##
### HUOM ratkaisu ei toimi oikein suuressa testissä ###

Syrjälässä on 10<sup>6</sup> tietokonetta, jotka on numeroitu 1, 2, 3, jne. Koneiden välillä ei ole aluksi mitään yhteyksiä, mutta yhteyksiä aletaan rakentaa.

Syrjälän asukkaat pelaavat verkkopeliä, jossa hahmoilla on kaksi mahdollista roolia: örkit ja haltiat. Jokaista konetta käyttää yksi pelaaja, jonka tulee valita jompikumpi rooli. Lisäksi kahdella pelaajalla tulee olla eri rooli, jos heidän välillään on suora yhteys verkossa. Tehtäväsi on tutkia, voivatko kaikki pelata näiden vaatimusten mukaisesti.

Tee luokka <em>PeliVerkko</em>, jossa on seuraavat metodit:

<pre>public void lisaaYhteys(int a, int b)
public boolean voikoPelata()</pre>

Metodi <em>lisaaYhteys</em> lisää kaksisuuntaisen yhteyden koneiden <em>a</em> ja <em>b</em> välille. Metodi <em>voikoPelata</em> ilmoittaa, voivatko kaikki pelata.
Kun luokkaasi testataan, metodia <em>lisaaYhteys</em> kutsutaan enintään 10<sup>5</sup> kertaa ja samoin metodia <em>voikoPelata</em> kutsutaan enintään 10<sup>5</sup> kertaa.

Seuraava koodi esittelee luokan käyttämistä:

<pre>PeliVerkko p = new PeliVerkko();
p.lisaaYhteys(1,2);
p.lisaaYhteys(1,3);
System.out.println(p.voikoPelata()); // true
p.lisaaYhteys(2,3);
System.out.println(p.voikoPelata()); // false</pre>

Ensimmäisessä tilanteessa kaikki voivat pelata, koska esimerkiksi koneella 1 pelaava voi olla örkki ja muut ovat haltioita. Toisessa tilanteessa pelaaminen ei onnistu, koska ei ole mitään tapaa valita rooleja vaatimusten mukaisesti.
