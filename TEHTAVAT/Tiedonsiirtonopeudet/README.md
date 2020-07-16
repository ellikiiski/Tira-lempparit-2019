## Tiedonsiirtonopeudet ##

Sinulle annetaan tietokoneverkon kuvaus ja tehtäväsi on selvittää, kuinka nopeasti verkossa pystyy välittämään tietoa koneesta toiseen.

Tee luokka <em>Verkkoyhteys</em>, jossa on seuraavat metodit:

<pre>public void lisaaYhteys(int alku, int loppu, int nopeus)
public int laskeNopeus(int alku, int loppu)</pre>

Metodi <em>lisaaYhteys</em> lisää verkkoon yksisuuntaisen yhteyden, joka alkaa solmusta <em>alku</em>, päättyy solmuun <em>loppu</em> ja jonka kautta voi siirtää tietoa nopeudella <em>nopeus</em>.
Metodi <em>laskeNopeus</em> ilmoittaa, millä nopeudella tietoa pystyy siirtämään koneesta <em>alku</em> koneeseen <em>loppu</em>.
Verkossa on enintään 100 konetta, ja niiden tunnukset ovat 1, 2, 3, jne. Jokaisen yhteyden nopeus on välillä 1...100.
Kun luokkaasi testataan, metodia <em>lisaaYhteys</em> kutsutaan ensin enintään 1000 kertaa. Tämän jälkeen metodia <em>laskeNopeus</em> kutsutaan tasan kerran.

Seuraava koodi esittelee luokan käyttämistä:

<pre>Verkkoyhteys v = new Verkkoyhteys();
v.lisaaYhteys(1,2,2);
v.lisaaYhteys(1,4,6);
v.lisaaYhteys(2,3,3);
v.lisaaYhteys(2,4,7);
v.lisaaYhteys(3,4,2);
v.lisaaYhteys(3,5,8);
v.lisaaYhteys(4,3,4);
v.lisaaYhteys(4,5,1);
System.out.println(v.laskeNopeus(1,5)); // 7</pre>

Tässä tapauksessa tietoa voi välittää reittiä 1 → 2 → 3 → 5 nopeudella 2, reittiä 1 → 4 → 3 → 5 nopeudella 4 sekä reittiä 1 → 4 → 5 nopeudella 1.
