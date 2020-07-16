## Lyhin reitti tieverkostossa ##

Sinulle on annettu tieverkosto, ja tehtäväsi on etsiä lyhin reitti kahden kaupungin välillä.

Toteuta seuraava metodi:

<pre>long lyhinReitti(int n, int[] mista, int[] minne, long[] matka)</pre>

Parametri <em>n</em> on kaupunkien määrä. Se on kokonaisluku välillä 1..10<sup>5</sup>. Kaupungit on numeroitu tuttuun tapaan kokonaisluvuin 1..<em>n</em>.

Taulukot <em>mista</em>, <em>minne</em> ja <em>matka</em> kuvaavat kaupunkien väliset tiet. Kaikki taulukot ovat samankokoisia, ja teiden määrä on välillä 1..10<sup>5</sup>. 
Taulukko <em>mista</em> kertoo, mistä kaupungista tie alkaa, taulukko <em>minne</em> kertoo, mihin kaupunkiin tie johtaa, ja taulukko <em>matka</em> kertoo tien pituuden.
Kaikki tiet ovat kaksisuuntaisia, ja jokaisen tien pituus on kokonaisluku välillä 1..10<sup>9</sup>.

Metodin tulee palauttaa lyhimmän reitin pituus kaupungista 1 kaupunkiin <em>n</em>. Jos mitään reittiä ei ole olemassa, metodin tulee palauttaa -1.

Esimerkit

<pre>lyhinReitti(3, new int[] {1, 2}, new int[] {2, 3}, new int[] {5, 3}) // 8
lyhinReitti(3, new int[] {1, 1}, new int[] {2, 3}, new int[] {2, 3}) // 3
lyhinReitti(3, new int[] {1, 2, 1}, new int[] {3, 3, 2}, new int[] {9, 1, 1}) // 2
lyhinReitti(3, new int[] {1, 2, 1}, new int[] {3, 3, 2}, new int[] {1, 9, 9}) // 1</pre>
