## Teiden kunnostus ##
### HUOM tehtävää ei ole tehty lainkaan ###

Kaupunkien väliset tiet ovat huonossa kunnossa ja jokaisesta tiestä tiedetään, paljonko sen kunnostaminen maksaisi. Tehtäväsi on etsiä ratkaisu, jossa teitä kunnostetaan niin, että jokaisen kahden kaupungin välillä pääsee matkustamaan kunnostettuja teitä pitkin ja kunnostamisen yhteishinta on pienin mahdollinen.

Tee luokka <em>Kunnostus</em>, jossa on seuraavat metodit:

<pre>public void lisaaKaupunki(String nimi)
public void lisaaTie(String nimi, String loppu, int hinta)
public int halvinHinta()</pre>

Metodi <em>lisaaKaupunki</em> lisää kaupungin, jonka nimi muodostuu englannin kielen aakkosista ja sen pituus on enintään 10 kirjainta. Metodi <em>lisaaTie</em> lisää kaksisuuntaisen tien, jonka kunnostamisella on tietty hinta. Metodi <em>halvinHinta</em> ilmoittaa, paljonko teiden kunnostaminen maksaa halvimmillaan (tai -1 jos ei ole koskaan mahdollista matkustaa kaikkien kaupunkien välillä).
Metodia <em>lisaaKaupunki</em> kutsutaan ensin enintään 500 kertaa. Tämän jälkeen metodia <em>lisaaTie</em> kutsutaan enintään 10000 kertaa. Lopuksi metodia <em>halvinHinta</em> kutsutaan tasan kerran.

Seuraava koodi esittelee luokan käyttämistä:

<pre>Kunnostus k = new Kunnostus();
k.lisaaKaupunki("Helsinki");
k.lisaaKaupunki("Turku");
k.lisaaKaupunki("Tampere");
k.lisaaTie("Helsinki","Turku",100);
k.lisaaTie("Turku","Tampere",200);
k.lisaaTie("Helsinki","Tampere",150);
System.out.println(k.halvinHinta()); // 250</pre>
