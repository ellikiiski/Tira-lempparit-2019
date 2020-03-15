## Kauppamatkustaja ##

Kauppamatkustaja haluaa käydä <em>n</em> kaupungissa, joiden väliset etäisyydet on tallennettu <em>n</em> kertaa <em>n</em> matriisiin (eli kaksiulotteiseen taulukkoon) <em>et</em>.
Kauppamatkustaja haluaa kiertää kaikki kaupungit läpi mahdollisimman nopeasti. Hän aloittaa kierroksensa kaupungista 0, käy kaikissa muissa
kaupungeissa **tasan kerran** ja palaa lopuksi kaupunkiin 0. Auta kauppamatkustajaa selvittämään lyhimmän mahdollisen kierroksen pituus.

Toteuta metodi

<pre>int kierros(int[][] et)</pre>

Syötteenä annettu taulukko <em>et</em> sisältää tiedon kaupunkien välisistä etäisyyksistä. Kaupunkien <em>i</em> ja <em>j</em> välinen etäisyys on <em>et[i][j] == et[j][i]</em>.
Kun siirrytään kaupungista <em>i</em> suoraan kaupunkiin <em>j</em> käymättä missään muussa kaupungissa, on reitin pituus <em>et[i][j]</em>, vaikka olisikin epäsuora reitti,
joka olisi lyhyempi.
Kaupunkien määrä <em>n</em> on korkeintaan 10. Matriisin <em>et</em> sisältämät luvut ovat välillä 0..10<sup>6</sup>.

Esimerkki

Olkoon matriisi <em>et</em> seuraavanlainen:

<pre>0321
3042
2404
1240</pre>

Matriisin kuvaama verkko näyttää siis tältä:

Kauppamatkustajan verkko

Nyt yksi esimerkki lyhimmästä mahdollisesta kierroksesta käy kaupungit läpi järjestyksessä 0→2→1→3→0. Tämän reitin pituus on 2+4+2+1=9, joka on haettu vastaus.
