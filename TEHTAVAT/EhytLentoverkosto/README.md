## Ehyt lentoverkosto ##

Sinulle annetaan tiedot kaupunkien välisistä lentoyhteyksistä ja tehtäväsi on selvittää, voiko mistä tahansa kaupungista päästä mihin tahansa kaupunkiin lentojen avulla.

Tee luokka <em>Lennot</em>, jossa on seuraavat metodit:

<pre>public void lisaaKaupunki(String nimi)
public void lisaaYhteys(String alku, String loppu)
public boolean onkoKaikki()</pre>

Metodi <em>lisaaKaupunki</em> lisää kaupungin, jonka nimessä on enintään 10 englannin kielen kirjainta. Metodi <em>lisaaYhteys</em> lisää yksisuuntaisen lentoyhteyden kaupungista toiseen.
Metodi <em>onkoKaikki</em> ilmoittaa, onko kaikkien kaupunkien välillä tapa matkustaa.
Kun luokkaasi testataan, metodia <em>lisaaKaupunki</em> kutsutaan ensin enintään 500 kertaa. Tämän jälkeen metodeja <em>lisaaYhteys</em> ja <em>onkoKaikki</em> kutsutaan niin,
että ensimmäistä metodia kutsutaan enintään 10000 kertaa ja jälkimmäistä metodia kutsutaan enintään 1000 kertaa.

Seuraava koodi esittelee luokan käyttämistä:

<pre>Lennot l = new Lennot();
l.lisaaKaupunki("Helsinki");
l.lisaaKaupunki("Turku");
l.lisaaKaupunki("Tampere");
l.lisaaYhteys("Helsinki","Turku");
l.lisaaYhteys("Helsinki","Tampere");
l.lisaaYhteys("Turku","Tampere");
System.out.println(l.onkoKaikki()); // false
l.lisaaYhteys("Tampere","Helsinki");
System.out.println(l.onkoKaikki()); // true</pre>
