## Pistejoukko suoralla ##

Tehtäväsi on pitää yllä joukkoa pisteitä suoralla. Jokaisella pisteellä on tietty x-koordinaatti ja sen y-koordinaatti on 0.
Tee luokka <em>Pisteet</em>, jossa on seuraavat metodit:

<pre>public void lisaaPiste(int x)
public int etaisyys(int x)</pre>

Metodi <em>lisaaPiste</em> lisää joukkoon pisteen <em>x</em>, ja metodi <em>etaisyys</em> kertoo, mikä on etäisyys pisteestä <em>x</em> lähimpään pisteeseen joukossa. Kummankin metodin tulee toimia tehokkaasti. Huomaa, että sama piste saatetaan lisätä joukkoon monta kertaa.
Seuraava koodi esittelee luokan käyttämistä:

<pre>Pisteet p = new Pisteet();
p.lisaaPiste(2);
p.lisaaPiste(5);
p.lisaaPiste(6);
System.out.println(p.etaisyys(3)); // 1
System.out.println(p.etaisyys(5)); // 0
System.out.println(p.etaisyys(9)); // 3
p.lisaaPiste(8);
System.out.println(p.etaisyys(9)); // 1</pre>
