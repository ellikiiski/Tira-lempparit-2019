## Suurin verkko ##

Syrjälässä on 10<sup>6</sup> tietokonetta, jotka on numeroitu 1, 2, 3, jne. Koneiden välillä ei ole aluksi mitään yhteyksiä, mutta yhteyksiä aletaan rakentaa. Kaksi konetta kuuluvat samaan verkkoon, jos niiden välillä voi lähettää viestejä yhteyksien avulla.

Tee luokka <em>SuurinVerkko</em>, jossa on seuraavat metodit:

<pre>public void lisaaYhteys(int a, int b)
public int suurinVerkko()</pre>

Metodi <em>lisaaYhteys</em> lisää kaksisuuntaisen yhteyden koneiden <em>a</em> ja <em>b</em> välille. Metodi <em>suurinVerkko</em> ilmoittaa, montako konetta on suurimmassa verkossa.
Kun luokkaasi testataan, metodia <em>lisaaYhteys</em> kutsutaan enintään 10<sup>5</sup> kertaa ja samoin metodia <em>suurinVerkko</em> kutsutaan enintään 10<sup>5</sup> kertaa.

Seuraava koodi esittelee luokan käyttämistä:

<pre>SuurinVerkko s = new SuurinVerkko();
s.lisaaYhteys(1,2);
s.lisaaYhteys(1,3);
s.lisaaYhteys(2,3);
s.lisaaYhteys(4,5);
System.out.println(s.suurinVerkko()); // 3
s.lisaaYhteys(2,5);
System.out.println(s.suurinVerkko()); // 5</pre>
