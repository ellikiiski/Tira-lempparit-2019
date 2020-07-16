## Bussipysäkit ##

Tien varrella on <em>n</em> taloa, joiden sijainnit (x-koordinaatit) on annettu taulukossa. Tielle tulee rakentaa bussipysäkkejä niin, että minkä tahansa talon etäisyys lähimpään pysäkkiin on enintään <em>x</em>. Mikä on pienin mahdollinen pysäkkien määrä?
Esimerkiksi jos talojen sijainnit ovat [2,5,7] ja <em>x</em> = 1, pysäkkejä tarvitaan ainakin 2. Yksi optimaalinen ratkaisu on rakentaa pysäkit kohtiin 2 ja 6. Tällöin kohdan 2 talon etäisyys pysäkkiin on 0 ja kohtien 5 ja 7 talojen etäisyys pysäkkiin on 1.

Tee luokka <em>Pysakit</em>, jossa on seuraava metodi:

<pre>public int laske(int[] talot, int x)</pre>

Metodin tulee palauttaa pienin pysäkkien määrä annetussa tapauksessa. Voit olettaa, että taulukossa on enintään 10<sup>6</sup> lukua, ja jokainen luku on välillä 1...10<sup>9</sup>.
Seuraava koodi esittelee luokan käyttämistä:

<pre>Pysakit p = new Pysakit();
int[] talot1 = {2,5,7};
System.out.println(p.laske(talot1,1)); // 2
System.out.println(p.laske(talot1,2)); // 2
System.out.println(p.laske(talot1,3)); // 1
int[] talot2 = {12,3,20,17,5,28,3};
System.out.println(p.laske(talot2,1)); // 5
System.out.println(p.laske(talot2,2)); // 4
System.out.println(p.laske(talot2,3)); // 4
System.out.println(p.laske(talot2,4)); // 3</pre>
