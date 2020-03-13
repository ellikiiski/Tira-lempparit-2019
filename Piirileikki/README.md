##Piirileikki##

Piirissä on n lasta, jotka on numeroitu 1, 2, 3, ..., n. Vuoro kiertää piirissä lapsesta 1 alkaen niin, että joka toinen lapsi jää piiriin ja joka toinen poistuu siitä. Esimerkiksi kun n = 6, lapset poistuvat piiristä järjestyksessä 2, 4, 6, 3, 1, 5.
Tee luokka Piirileikki, jossa on seuraava metodi:

public int viimeinen(int n)
Metodin tulee palauttaa viimeisenä piirissä olevan lapsen numero. Voit olettaa, että n on kokonaisluku välillä 1...106.
Seuraava koodi esittelee luokan käyttämistä:

Piirileikki p = new Piirileikki();
System.out.println(p.viimeinen(2)); // 1
System.out.println(p.viimeinen(6)); // 5
System.out.println(p.viimeinen(7)); // 7
System.out.println(p.viimeinen(8)); // 1
System.out.println(p.viimeinen(123)); // 119
