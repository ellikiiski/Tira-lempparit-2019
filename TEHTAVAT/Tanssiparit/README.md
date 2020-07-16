## Tanssiparit ##
### HUOM tätä tehtävää ei ole tehty lainkaan ###

Kumpulan ja Viikin opiskelijat järjestävät yhteiset tanssiaiset. Jokainen tanssiaisiin osallistuva pari muodostetaan niin,
että parin toinen jäsen opiskelee Kumpulassa ja toinen Viikissä.
Tehtäväsi on etsiä tapa muodostaa suurin mahdollinen määrä tanssipareja, kun tiedät opiskelijoiden toiveet.

Tee luokka <em>Tanssiaiset</em>, jossa on seuraavat metodit:

<pre>public void lisaaToive(String a, String b)
public int laskeParit()</pre>

Metodi <em>lisaaToive</em> ilmaisee, että Kumpulan opiskelija <em>a</em> ja Viikin opiskelija <em>b</em> suostuvat tanssimaan keskenään.
Opiskelijan nimi muodostuu englannin kielen kirjaimista ja siinä on enintään 10 kirjainta. Metodi <em>laskeParit</em> kertoo, mikä on suurin mahdollinen tanssiparien määrä.
Voit olettaa, että sekä Kumpulassa että Viikissä on enintään 100 opiskelijaa ja jokaisella opiskelijalla on eri nimi.
Kun luokkaasi testataan, metodia <em>lisaaToive</em> kutsutaan ensin enintään 1000 kertaa. Tämän jälkeen metodia <em>laskeParit</em> kutsutaan tasan kerran.

Seuraava koodi esittelee luokan käyttämistä:

<pre>Tanssiaiset t = new Tanssiaiset();
t.lisaaToive("Uolevi","Maija");
t.lisaaToive("Uolevi","Justiina");
t.lisaaToive("Uolevi","Elviira");
t.lisaaToive("Kaaleppi","Justiina");
t.lisaaToive("Kotivalo","Justiina");
System.out.println(t.laskeParit()); // 2</pre>

Tässä parit voi muodostaa niin, että Uolevi tanssii Maijan kanssa ja Kotivalo tanssii Justiinan kanssa. Kaaleppi ja Elviira jäävät valitettavasti ilman paria.
