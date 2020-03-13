## Ovimies ##

Läheisen yökerhon korruptoitunut ovimies on päättänyt hankkia lisätienestejä kiristämällä jonottavia asiakkaita. Välillä hän veloittaa <em>x</em> euroa jokaiselta jonossa sillä hetkellä olevalta henkilöltä,
ja koska kaikki jonottajat haluavat päästä sisään, maksavat he ovimiehelle aina hänen pyytämänsä summan. Tehtäväsi on auttaa ovimiestä pitämään kirjaa siitä, kuinka paljon hän on onnistunut saamaan
rahaa kultakin asiakkaalta.

Toteutus:

Tehtävänäsi on toteuttaa tehtäväpohjassa oleva luokka <em>Laskuri</em> ja siihen seuraavat metodit:

<pre>Laskuri() // luo tyhjän jonon
void lisaaJonoon() // lisää jonon perälle uuden asiakkaan
void veloita(long x) //veloittaa jokaiselta jonossa tällä hetkellä olevalta jonottajalta x euroa
long paastaSisaan() // päästää jonossa ensimmäisenä olevan asiakkaan sisään ja palauttaa tiedon siitä,
                       kuinka monta euroa kyseinen asiakas on joutunut maksamaan ovimiehelle jonossa pysyäkseen</pre>

Testeissä luokan metodeja kutsutaan korkeintaan 500000 kertaa. Luku <em>x</em> on välillä 1..10<sup>9</sup>. Jos jonossa ei ole asiakkaita, niin metodin <em>long paastaSisaan()</em> tulee palauttaa 0.
