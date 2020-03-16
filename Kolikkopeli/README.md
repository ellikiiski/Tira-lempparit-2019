## Kolikkopeli ##

Pelaat peliä, joka muodostuu huoneista ja niiden välisistä yhteyksistä. Jokainen yhteys on yksisuuntainen teleportti, ja peli on suunniteltu niin, että mistään huoneesta ei voi päästä takaisin samaan huoneeseen teleporttien kautta. Joissakin pelin huoneissa voi olla kolikkoja.
Montako kolikkoa voit kerätä enintään pelissä, kun tiedät, mistä huoneesta aloitat ja mihin huoneeseen peli päättyy?

Tee luokka <em>Kolikot</em>, jossa on seuraavat metodit:

<pre>public void lisaaYhteys(int alku, int loppu)
public void lisaaKolikko(int huone)
public int parasTulos(int alku, int loppu)</pre>

Metodi <em>lisaaYhteys</em> lisää peliin teleportin huoneesta toiseen. Metodi <em>lisaaKolikko</em> lisää yhden kolikon annettuun huoneeseen (alussa missään huoneessa ei ole kolikoita).
Metodi <em>parasTulos</em> kertoo, montako kolikkoa voit kerätä enintään pelissä (jos mitään reittiä ei ole, metodin tulee palauttaa -1). Huoneet on numeroitu kokonaisluvuin 1, 2, 3, jne.

Voit olettaa, että pelissä on enintään 500 huonetta. Kun luokkaasi testataan, metodia <em>lisaaYhteys</em> kutsutaan ensin enintään 10000 kertaa.
Tämän jälkeen metodia <em>lisaaKolikko</em> kutsutaan enintään 10000 kertaa. Lopuksi metodia <em>parasTulos</em> kutsutaan tasan kerran.

Seuraava koodi esittelee luokan käyttämistä:

<pre>Kolikot k = new Kolikot();
k.lisaaYhteys(1,2);
k.lisaaYhteys(2,4);
k.lisaaYhteys(1,3);
k.lisaaYhteys(3,4);
k.lisaaKolikko(2);
k.lisaaKolikko(3);
k.lisaaKolikko(3);
System.out.println(k.parasTulos(1,4)); // 2</pre>
