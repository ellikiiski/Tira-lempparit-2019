## Piirileikki ##

Piirissä on <em>n</em> lasta, jotka on numeroitu 1, 2, 3, ..., <em>n</em>. Vuoro kiertää piirissä lapsesta 1 alkaen niin, että joka toinen lapsi jää piiriin ja joka toinen poistuu siitä. Esimerkiksi kun <em>n</em> = 6, lapset poistuvat piiristä järjestyksessä 2, 4, 6, 3, 1, 5.
Tee luokka <em>Piirileikki</em>, jossa on seuraava metodi:

<pre>public int viimeinen(int n)</pre>

Metodin tulee palauttaa viimeisenä piirissä olevan lapsen numero. Voit olettaa, että n on kokonaisluku välillä 1...10<sup>6</sup>.
Seuraava koodi esittelee luokan käyttämistä:

<pre>Piirileikki p = new Piirileikki();
System.out.println(p.viimeinen(2)); // 1
System.out.println(p.viimeinen(6)); // 5
System.out.println(p.viimeinen(7)); // 7
System.out.println(p.viimeinen(8)); // 1
System.out.println(p.viimeinen(123)); // 119</pre>
