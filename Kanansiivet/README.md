## Kanansiivet ##

Ravintola myy kanansiipiä eri kokoisissa paketeissa. Tehtäväsi on rakentaa luokka, johon voi lisätä tarjolle paketteja ja niiden hintoja sekä selvittää halvimman tavan hankkia tietyn määrän kanansiipiä.

Tarkastellaan esimerkkiä, jossa tarjolla ovat seuraavat paketit:

* paketti 1: voit ostaa 1 kanansiiven hintaan 3
* paketti 2: voit ostaa 2 kanansiipeä hintaan 5
* paketti 3: voit ostaa 3 kanansiipeä hintaan 7

Tässä tapauksessa halvin tapa hankkia 8 kanansiipeä on ostaa kerran paketti 2 ja kahdesti paketti 3, joille tulee hintaa 5+2⋅7=19.

Tee luokka <em>Ravintola</em>, jossa on seuraavat metodit:

<pre>public void lisaaPaketti(int maara, int hinta)
public int halvinHinta(int maara)</pre>

Metodi <em>lisaaPaketti</em> lisää tarjolle paketin, jolla voi ostaa <em>maara</em> kanansiipeä hintaan <em>hinta</em>. Tarjolla voi olla useita paketteja, joissa on yhtä monta kanansiipeä.
Metodi <em>halvinHinta</em> puolestaan kertoo, mikä on halvin hinta ostaa <em>maara</em> kanansiipeä. Määrä on aina välillä 1...1000 ja hinta on aina välillä 1..10<sup>6</sup>.
Voit lisäksi olettaa, että kumpaakin metodia kutsutaan enintään 1000 kertaa.

Huom! Metodin <em>halvinHinta</em> tulee löytää tapa, jolla saat tarkalleen halutun määrän kanankoipia. Et saa ostaa ylimääräisiä, vaikka tämä tulisi halvemmaksi.

Seuraava koodi esittelee luokan käyttämistä:

<pre>Ravintola r = new Ravintola();
r.lisaaPaketti(1,3);
r.lisaaPaketti(2,5);
r.lisaaPaketti(3,7);
System.out.println(r.halvinHinta(5)); // 12
System.out.println(r.halvinHinta(12)); // 28
r.lisaaPaketti(10,20);
System.out.println(r.halvinHinta(12)); // 25</pre>
