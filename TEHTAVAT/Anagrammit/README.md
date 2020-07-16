## Anagrammit ##

Kaksi merkkijonoa ovat anagrammit, jos ne voi muuttaa toisikseen vaihtamalla kirjainten järjestystä. Esimerkiksi merkkijonot <em>sieni</em> ja <em>iines</em> ovat anagrammit.
Tee luokka <em>Anagrammit</em>, jossa on seuraavat metodit:

<pre>public void lisaaSana(String sana)
public int etsiAnagrammit(String sana)</pre>

Metodi <em>lisaaSana</em> lisää uuden sanan sanakirjaan. Metodi <em>etsiAnagrammit</em> ilmoittaa, moniko sanakirjan sana on anagrammi annetun sanan kanssa. Kummankin metodin tulee toimia tehokkaasti. Voit olettaa, että jokainen sana muodostuu merkeistä a–z. Huomaa, että sama sana voi esiintyä sanakirjassa monta kertaa.
Seuraava koodi esittelee luokan käyttämistä:

<pre>Anagrammit a = new Anagrammit();
a.lisaaSana("antoisa");
a.lisaaSana("asiaton");
a.lisaaSana("mikrosekunti");
System.out.println(a.laskeAnagrammit("tosiaan")); // 2
System.out.println(a.laskeAnagrammit("apina")); // 0
System.out.println(a.laskeAnagrammit("sointumerkki")); // 1
a.lisaaSana("isontaa");
System.out.println(a.laskeAnagrammit("tosiaan")); // 3</pre>
