## Kuinka monta lyhintä reittiä ##
### HUOM ratkaisu ei toimi oikein! ###

Verkon solmut esittävät kaupunkeja ja kaaret yhteyksiä kaupunkien välillä. Kaupungit on numeroitu luvuilla 1,…,<em>n</em>, missä 1≤<em>n</em>≤10<sup>5</sup>. Olemme kiinnostuneita lyhimmistä reiteistä kaupungista 1 kaupunkiin n. Lyhin reitti ei välttämättä ole yksikäsitteinen, vaan usealla eri reitillä voi olla sama pienin mahdollinen pituus. Tehtävänä on määrittää lyhimpien reittien lukumäärä.

Toteuta seuraava metodi:

<pre>long reittimaara(int n, int[] mista, int[] minne)</pre>

Metodin tulee palauttaa, kuinka monta erilaista lyhintä reittiä on olemassa kaupungista 1 kaupunkiin <em>n</em>.

Parametri <em>n</em> on kaupunkien määrä, kokonaisluku välillä 1…10<sup>5</sup>.

Taulukot <em>mista</em> ja <em>minne</em> kuvaavat tiet kaupunkien välillä. Taulukko <em>mista</em> kertoo, mistä kaupungista tie lähtee, ja taulukko <em>minne</em> kertoo, mihin kaupunkiin tie johtaa.
Kaikki tiet ovat kaksisuuntaisia, ja niiden määrä on 0…10<sup>5</sup>.

Voit olettaa, että vastaus on enintään 10<sup>18</sup>.

Tehtävässä alkuun auttava vinkki: Leveyshaulla lyhintä reittiä kahden solmun välillä etsiessä lasketaan itseasiassa lyhimpien polkujen pituus jostain lähtösolmusta kaikkiin muihin solmuihin. Samalla tavalla kannattaa toimia tässä.

Esimerkit

reittimaara(2, new int[] {1}, new int[] {2}) // 1
reittimaara(5, new int[] {1,1,2,3,4}, new int[] {2,3,4,4,5}) // 2
reittimaara(5, new int[] {1, 1, 1, 2, 3, 4}, new int[] {2, 3, 4, 5, 5, 5}) // 3
reittimaara(7, new int[] {1,2,3,1,1,4,5,6}, new int[] {2,3,7,4,5,6,6,7}) // 3
