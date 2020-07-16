## Valmistumisajat ##

Tehtaassa on koneita, joista jokainen pystyy valmistamaan yhden tuotteen tietyssä ajassa.
Tehtäväsi on valmistaa mahdollisimman nopeasti annettu määrä tuotteita käyttämällä koneita parhaalla mahdollisella tavalla.

Oletetaan että koneet ovat seuraavat:

| kone | toiminta-aika |
| :----:|:-----|
| A | 1 |
| B | 2 |
| C | 3 |
| D | 4 |

Kun haluat valmistaa 10 tuotetta, yksi optimaalisista tavoista on seuraava:

| ajanhetki |	tapahtumat |
| :----:|:-----|
| 0	| Laitat käyntiin koneet A, B, C ja D. |
| 1	| Kone A saa valmiiksi tuotteen. Laitat uudestaan käyntiin koneen A. (1 tuote valmiina.) |
| 2	| Koneet A ja B saavat valmiiksi tuotteen. Laitat uudestaan käyntiin koneet A ja B. (3 tuotetta valmiina.) |
| 3	| Koneet A ja C saavat valmiiksi tuotteen. Laitat uudestaan käyntiin koneet A ja C. (5 tuotetta valmiina.) |
| 4	| Koneet A, B ja D saavat valmiiksi tuotteen. Laitat uudestaan käyntiin koneen B. (8 tuotetta valmiina.) |
| 5	| Käyt hesarin nettisivulla lukemassa päivän fingerporin. |
| 6	| Koneet B ja C saavat valmiiksi tuotteen. (10 tuotetta valmiina.) Tehtävä suoritettu! |

Toteuta seuraava metodi:

<pre>long lyhinAika(int[] koneet, int maara)</pre>

Taulukko <em>koneet</em> sisältää tiedon, kuinka kauan kullakin koneella menee valmistaa tuote.
Koneiden määrä on välillä 1..10<sup>5</sup>. Jokainen taulukon arvo on kokonaisluku välillä 1..10<sup>9</sup>.

Kokonaisluku <em>maara</em> on valmistettava tuotteiden määrä. Tämä luku on välillä 1..10<sup>5</sup>.

Metodin tulee palauttaa pienin mahdollinen aika, jossa saat valmistettua tuotteet koneiden avulla.

Esimerkit

<pre>lyhinAika(new int[] {1}, 5) // 5
lyhinAika(new int[] {1, 1, 1}, 6) // 2
lyhinAika(new int[] {5, 1, 1}, 6) // 3
lyhinAika(new int[] {1, 2, 3, 4}, 10) // 6</pre>
