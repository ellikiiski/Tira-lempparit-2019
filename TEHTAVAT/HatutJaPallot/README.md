## Hatut ja pallot ##

Sinulla on 10<sup>9</sup> hattua, jotka on numeroitu 1, 2, ..., 10<sup>9</sup>. Aluksi kaikki hatut ovat tyhjiä, mutta voit lisätä niihin palloja.
Tee luokka <em>HatutJaPallot</em>, jossa on seuraavat metodit:

<pre>public void lisaaPallo(int hattuId)
public int enitenPalloja()</pre>

Metodi <em>lisaaPallo</em> lisää yhden pallon hattuun, jonka tunnus on <em>hattuId</em>. Metodi <em>enitenPalloja</em> puolestaan kertoo, mikä on suurin määrä palloja jossain hatussa. Kummankin metodin tulee toimia tehokkaasti.
Seuraava koodi esittelee luokan käyttämistä:

<pre>HatutJaPallot h = new HatutJaPallot();
h.lisaaPallo(5);
System.out.println(h.enitenPalloja()); // 1
h.lisaaPallo(3);
System.out.println(h.enitenPalloja()); // 1
h.lisaaPallo(5);
System.out.println(h.enitenPalloja()); // 2
h.lisaaPallo(5);
System.out.println(h.enitenPalloja()); // 3
h.lisaaPallo(9);
System.out.println(h.enitenPalloja()); // 3</pre>
