## Toipuminen kyberhyökkäyksestä ##

Kyberhyökkäys on kaatanut Suomen tietoverkot, mikä estää pääsysi Iltasanomien nettisivuille. Verkkoa korjataan yhteys kerrallaan,
kunnes kaikki yhteydet on saatu korjattua. Tehtävänäsi on selvittää, mihin aikaan saat taas yhteyden suosikkiuutissivustoosi.

Toteuta seuraava metodi:

<pre>long yhteysaika(int n, int[] mista, int[] minne, long[] milloin)</pre>

Parametri <em>n</em> on verkon koneiden määrä. Se on kokonaisluku välillä 1..10<sup>5</sup>. Koneet on numeroitu tuttuun tapaan kokonaisluvuin 1..<em>n</em>.
Sinun koneesi on kone numero 1 ja iltasanomien nettisivu löytyy koneelta numero <em>n</em>.

Taulukot <em>mista</em>, <em>minne</em> ja <em>milloin</em> kuvaavat tietoverkon korjaustöiden etenemistä.
Tiedot ovat muotoa "ajanhetkellä <em>milloin[i]</em> muodostuu koneiden <em>mista[i]</em> ja <em>minne[i]</em> välille yhteys". 
**Kaikki yhteydet ovat kaksisuuntaisia!** Näiden taulukoiden pituus on korkeintaan 10<sup>5</sup>. Taulukon milloin sisältämät luvut ovat välillä 1..10<sup>18</sup>.

Metodisi tulee palauttaa pienin ajanhetki, jolloin tietoverkossa on tarpeeksi korjattuja yhteyksiä, jotta yhteyden muodostaminen koneesta 1 koneeseen <em>n</em> on mahdollista.
Voit olettaa, että tämä on aina mahdollista, kunhan kaikki yhteydet on korjattu.

Esimerkit

<pre>yhteysaika(4, new int[] {1,2,3}, new int[] {2,3,4}, new long[] {1,2,1}) // 2
yhteysaika(4, new int[] {1,1,2,3}, new int[] {2,3,4,4}, new long[] {1,5,8,7})	7
yhteysaika(5, new int[] {1,2,2,3,4}, new int[] {2,3,4,5,5}, new long[] {10,1,8,1,9}) // 10
yhteysaika(5, new int[] {1,2,2,3,4}, new int[] {2,3,4,5,5}, new long[] {1,1,8,1,9}) // 1</pre>
