## Kolikkoruudukko ##
### HUOM tätä tehtävää ei ole tehty lainkaan ###

Annettuna on <em>n</em> × <em>n</em> -ruudukko, jossa osassa ruuduista on kolikko. Saat kerättyä joka siirolla kaikki kolikot valitsemaltasi pysty- tai vaakariviltä.
Mikä on pienin määrä siirtoja, joilla saat kerättyä kaikki kolikot?

Tee luokka <em>Ruudukko</em>, jossa on seuraava metodi:

<pre>public int laske(int[][] ruudukko)</pre>

Metodille annetaan kuvaus ruudukosta niin, että 0 tarkoittaa tyhjää ruutua ja 1 tarkoittaa kolikkoa. Metodin tulee palauttaa pienin siirtojen määrä,
jolla kaikki kolikot saa kerättyä. Voit olettaa, että <em>n</em> on enintään 100.
Seuraava koodi esittelee luokan käyttämistä:

<pre>int[][] ruudukko =
{   {0,1,0,0,1},
    {0,1,0,0,0},
    {1,0,1,1,1},
    {0,0,0,0,1},
    {0,1,0,0,0}
};
Ruudukko r = new Ruudukko();
System.out.println(r.laske(ruudukko)); // 3</pre>

Tässä tapauksessa voit kerätä ensin kolikot toiselta ja viidenneltä pystyriviltä ja sitten kolmannelta vaakariviltä.

Vihje: Tehtävää 3 (Kőnigin lause) kannattaa katsoa ennen tätä.
