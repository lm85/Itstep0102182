package zakladyoop_rozsireni_trid.Lekce.folder;

/*
 * https://www.itnetwork.cz/java/oop/datum-a-cas-v-jave-8-vytvareni-a-formatovani
 * https://www.itnetwork.cz/java/oop/datum-a-cas-v-jave-8-uprava-a-intervaly
 * https://www.itnetwork.cz/java/oop/datum-a-cas-v-jave-8-parsovani-a-porovnavani
 * https://www.itnetwork.cz/java/oop/java-tutorial-diar-arraylist
 * https://www.itnetwork.cz/java/oop/java-tutorial-diar-arraylist-dokonceni
 *
 * diar s databazi jako tato clasa
 */

/*
* pro okomentovane priklady
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
*/

/**
 *
 * @author Milan ZLamal
 */
public class JavaDateTime {    
/* 
 * Jednoduse z mainu    
*/    
/*    
// Datum a čas
LocalDateTime datumCas = LocalDateTime.of(2016, Month.APRIL, 15, 3, 15);
System.out.println(datumCas);
// Pouze datum
LocalDate datum = LocalDate.of(2016, Month.APRIL, 15);
System.out.println(datum);
// Pouze čas
LocalTime cas = LocalTime.of(3, 15, 10);
System.out.println(cas);
*/

/*
 * Aktualni hodnoty datumu
 *
// Aktuální datum a čas
LocalDateTime datumCas = LocalDateTime.now();
System.out.println(datumCas);
// Aktuální datum
LocalDate datum = LocalDate.now();
System.out.println(datum);
// Aktuální čas
LocalTime cas = LocalTime.now();
System.out.println(cas);    
*/

/*    
* Formátování
*
* Jelikož výstup není úplně uživatelsky přívětivý, pojďme si ukázat, jak jej naformátovat. Asi vás nepřekvapí, že k tomu použijeme metodu format(), již normálně na instanci. Samotné formátování zajišťuje třída DateTimeFormatter, nás na ni budou zajímat tyto statické metody:
*
*    ofLocalizedDa­teTime() - Zformátuje na lokální formát data a času. 
*            Zadáváme dva parametry - styl data a styl času. 
*            Máme na výběr plný (full) až krátký (short) formát, což platí u všech formátovacích metod kromě ofPattern().
*    ofLocalizedDate() - Zformátuje na lokální formát data
*    ofLocalizedTime() - Zformátuje na lokální formát času
*    ofPattern() - Oproti metodám výše, které formátovaly dle regionálního nastavení daného uživatele, 
*            zde můžeme specifikovat vlastní formát pomocí textového řetězce a zástupných znaků. 
*            Např. den, měsíc, rok, hodiny, minuty a sekundy (vše čísly) by se předalo jako "d.M.y H:m:ss". 
*            Popis významu všech symbolů by byl zbytečně vyčerpávající a najdete jej v oficiální dokumentaci Javy - https://docs.oracle.com/…rmatter.html
*
* Priklad do mainu    
LocalDateTime dateTime = LocalDateTime.now();
System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.SHORT)));
System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d.M.y H:m:ss")));
* 
* Převody
*
* Na úvod si ukažme, jak můžeme převádět mezi LocalDate, LocalTime a LocalDateTime.
* Převod z LocalDateTime
* Z LocalDateTime převádíme jednoduše pomocí jeho metod toLocalDate() a toLocalTime().
* Převod na LocalDateTime
* LocalDateTime vytvoříme pomocí jedné z of*() metod, kde uvedeme zvlášť datum a čas, např. takto:
*
LocalDate zacatek = LocalDate.of(1939, 9, 1);
LocalDateTime datumCas = LocalDateTime.of(zacatek, LocalTime.of(10, 0));
*
* Pokud chceme nastavit čas na začátek dne, můžeme využít metody atStartOfDay(). 
* Další metodou, kterou můžeme vzít datum a připojit k němu čas, je atTime(). 
* Další varianta příkladu výše by tedy byla:
*
LocalDate zacatek = LocalDate.of(1939, 9, 1);
LocalDateTime datumCas = zacatek.atStartOfDay();
LocalDateTime datumCas2 = zacatek.atTime(0, 0);    
*
Metody, které máme k dispozici, jsou následující:
    minusDays()
    minusHours()
    minusMinutes()
    minusMonths()
    minusNanos()
    minusSeconds()
    minusWeeks()
    minusYears()
    plusDays()
    plusHours()
    plusMinutes()
    plusMonths()
    plusNanos()
    plusSeconds()
    plusWeeks()
    plusYears()
*
* Period a Duration
* Kromě výše zmíněných metod nalezneme i 4 obecné verze metod minus() a plus(), 
* které přijímají interval k přidání/odebrání. 
* Využijeme je zejména v případě, kdy dopředu nevíme, zda budeme přidávat 
* např. dny nebo roky, ušetří nám spoustu podmínkování. Máme k dispozici třídy Duration a Period, 
* na kterých si můžeme nechat vrátit objekt reprezentující takový interval.
*
* Pozn.: Až se dostaneme k rozhraním, můžete se podívat, že obě třídy implementující společné rozhraní TemporalAmount. 
* Zatím si s nimi však nemotejme hlavu.
*
* Upravený kód našeho příkladu by vypadal takto:
* 
LocalDateTime datumCas = LocalDateTime.now();
datumCas = datumCas.plus(Period.ofDays(3));
System.out.println(datumCas.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));    
* 
* ChronoUnit
* Pro snažší práci s různými jednotkami jako jsou dny, hodiny, minuty a podobně je nám k dispozici třída ChronoUnit. 
* Vnitřně používá třídu Duration, jedná se tedy pouze o jiný zápis již předchozích úloh, 
* ale jen pro jistotu, kdybyste jej někdy potkali, ukažme si jej:
*
LocalDateTime datumCas = LocalDateTime.now();
datumCas = datumCas.plus(3, ChronoUnit.DAYS);
System.out.println(datumCas.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));    
*    
* Between()
* Jako poslední stojí za zmínku statická metoda between() na třídě Period, 
* která nám umožňuje získat interval, tedy rozdíl mezi 2 datumy (přesněji objekty s rozhraním Temporal, 
* to je společný typ pro LocalDate, LocalDateTime a LocalTime). 
* Záměrně zde nebudu psát češtinsky správně "mezi dvěma daty", jelikož je to v IT zavádějící slovo.
*
LocalDate zacatek = LocalDate.of(1939, 9, 1);
LocalDate konec = LocalDate.of(1945, 9, 2);
TemporalAmount doba = Period.between(zacatek, konec);
System.out.println("II. světová válka trvala " + doba.get(ChronoUnit.YEARS) + " let a " + doba.get(ChronoUnit.DAYS) + " dní");    
*    
* Nastavení hodnoty
*
* Hodnotu nastavujeme pomocí metod with...*(), mají opět ty samé "přípony" jako metody doposud zmíněné. 
* Jako vždy nezapomeňte, že jako všechny podobné metody vracejí novou instanci.
*
LocalDate zacatek = LocalDate.of(1939, 9, 1);
zacatek = zacatek.withHour(10); // Nastaví hodiny na 10
*
* Řetězení metod
* Vracení nových instancí, které je zejména výsledkem toho, že jsou instance immutable, 
* zároveň poskytuje tzv. fluent interface (česky někdy překládané jako plynulé rozhraní). 
* Jedná se o řetězení metod, anglicky "method chaining". 
* Nehledejte v tom žádnou složitost, jde jen o to, že můžeme většinu metod volat po sobě na jednom řádku.
*
* Zkusme si nastavit kalendář na programátorské vánoce, tedy na Halloween (ano, protože 31 OCT = 25 DEC).
*
LocalDate zacatek = LocalDate.of(1939, 9, 1);
zacatek = zacatek.withMonth(9).withDayOfMonth(31);    
* 
* Čtení hodnoty
* Hodnotu čteme pomocí metod začínajících na get*(), zde nás ani nic nepřekvapí:
*
LocalDate halloween = LocalDate.of(2016, Month.OCTOBER, 31);
System.out.println("Rok: " + halloween.getYear() + ", měsíc: " + halloween.getMonthValue() + ", den: " + halloween.getDayOfMonth());    
*
* Parsování data a času
* Datum a čas budeme samozřejmě často dostávat v textové podobě, např. od uživatele z konzole, ze souboru nebo z databáze. 
* Asi tušíte, že k vytvoření LocalDateTime z takovéto textové hodnoty použijeme metodu parse() přímo na datovém typu, jako to v Javě děláme vždy.
*
* Ta výchozí předpokládá datum ve formátu yyyy-mm-dd, datum a čas ve formátu yyyy-mm-ddThh:mm:ss a čas ve formátu hh:mm:ss. 
* Všechna čísla před sebou musí mít nuly, pokud jsou menší jak 10. T není překlep, ale opravdu oddělení data a času. Zkusme si to:
*
LocalDateTime datumCas = LocalDateTime.parse("2016-12-08T10:20:30");
LocalDate datum = LocalDate.parse("2016-12-08");
LocalTime cas = LocalTime.parse("10:20:30");
*
System.out.println(datumCas.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
System.out.println(datum.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
System.out.println(cas.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
*
* Výsledek:
*
* 8.12.2016 10:20:30
* 8.12.2016
* 10:20:30
*
* Vlastní formát
*
* Mnohem často budeme ale samozřejmě chtít naparsovat datum a čas v českém tvaru nebo v jakémkoli jiném tvaru, výchozí oddělování data a času pomocí písmene "T" není zrovna user-friendly :)
*
LocalDateTime datumCas = LocalDateTime.parse("12/08/2016 10:20:30", DateTimeFormatter.ofPattern("M/d/y HH:mm:ss"));
LocalDate datum = LocalDate.parse("12/8/2016", DateTimeFormatter.ofPattern("M/d/y"));
LocalTime cas = LocalTime.parse("10:20:30", DateTimeFormatter.ofPattern("H:m:ss"));
*
System.out.println(datumCas.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
System.out.println(datum.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
System.out.println(cas.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
*
* Výsledek:
*
* 8.12.2016 10:20:30
* 8.12.2016
* 10:20:30
*
* Porovnávání instancí
* 
* Protože Java nepodporuje přetěžování operátorů, porovnáváme datumy (píší schválně češtinsky nesprávně, 
* daty je v IT zavádějící slovo) pomocí metod k tomu určených. Začínají is*(), vyjmenujme si je:
*
*    isAfter(datum) - Vrací zda je instance za datem/datem a časem předávané instance (zda je hodnota větší).
*    isBefore(datum) - Vrací zda je instance před datem/datem a časem předávané instance (zda je hodnota menší).
*    isEqual(datum) - Vrací, zda je instance nastavena na stejný datum a/nebo čas jako je předávaná instance (zda je hodnota stejná).
*
* To bylo jednoduché, že? Když už jsme u is*() metod, uveďme si i zbývající 2:
*
*    isLeapYear() - Vrací zda je instance nastavena na přestupný rok či nikoli.
*    isSupported(Chro­noUnit) - Vrací zda instance podporuje práci s danou chrono jednotkou (např. LocalDate nebude umět ChronoUnit.HOURS, protože neobsahuje informaci o čase).
*
* Ukažme si příklad:
*
LocalDate halloween = LocalDate.of(2016, 10, 31);
LocalDate vanoce = LocalDate.of(2016, 12, 25);
System.out.println("po: " + halloween.isAfter(vanoce));
System.out.println("před: " + halloween.isBefore(vanoce));
System.out.println("shodný: " + vanoce.isEqual(halloween));
System.out.println("shodný: " + halloween.isEqual(halloween));
System.out.println("přestupný: " + halloween.isLeapYear());
System.out.println("přestupný: " + halloween.withYear(2017).isLeapYear());
System.out.println("podporuje hodiny: " + halloween.isSupported(ChronoUnit.HOURS));
System.out.println("podporuje roky: " + halloween.isSupported(ChronoUnit.YEARS));
*
* Výsledek:
*
* Konzolová aplikace po: false
* před: true
* shodný: false
* shodný: true
* přestupný: true
* přestupný: false
* podporuje hodiny: false
* podporuje roky: true
*
* Další třídy
*
* Kromě LocalDateTime, LocalDate a LocalTime se můžete setkat také s několika dalšími třídami, 
* které využijete spíše u aplikací, které jsou na práci s datem a časem založené. 
* Nelekejte se jich, ve většině případů si vystačíte s LocalDateTime, ale měli byste o nich mít povědomí.
* Instant
*
* Instant je datum a čas, ale ne v pojetí kalendáře a přechodů na letní čas. 
* Je to počet nanosekund od 1.1.1970, tedy jeden bod na časové ose UTC (univerzálního času). 
* Když si kdekoli na Zemi napíšete aplikaci s tímto kódem:
*
Instant ted = Instant.now();
System.out.println(ted);
*
* Vypíše vždy to samé, Instant zná jen univerzální čas a ten se bude lišit od reálného času v dané oblasti.
* OffsetDateTime a ZonedDateTime
*
* Již víme, že Instant je univerzální čas a LocalDateTime má v sobě ten čas, který je na daném území. 
* Ze samotného LocalDateTime nedokážeme získat bod na univerzální časové ose, protože nevíme na jakém je území.
*
* Co nám chybí je tedy kombinace těchto dvou, lokálně korektní čas, 
* který by v sobě zároveň nesl informaci o území (časové zóně) 
* a tím pádem mohl být univerzálně převáděn mezi různými časovými zónami. Právě k tomu slouží třída ZonedDateTime.
*
* V Javě nalezneme také třídu OffsetDateTime, která je takový mezičlánek, 
* který umožňuje zaznamenat časový posun, ale nemá plnou podporu zón.
* ZoneId
*
* Časové zóny jsou v Javě reprezentovány třídou ZoneId. Pojďme si udělat jednoduchou ukázku jak vytvoříme datum s časovou zónou:
*
ZonedDateTime lokalniDatumCas = ZonedDateTime.now(ZoneId.of("America/New_York"));
System.out.println(lokalniDatumCas);
*
* Výstup:
*
* 2017-02-02T06:37:11.026-05:00[America/New_York]
*
* Ano, je to hodně tříd, berte to spíše jako informace, ke kterým se vrátíte až je budete potřebovat. 
* V Javě je tříd vždy více než v ostatních jazycích, zkusme si vypěstovat trpělivost a nějakou odolnost vůči této skutečnosti, 
* zas jsme kvůli tomu lépe placení :) Příště budeme zas chvíli prakticky programovat, abychom si od teorie odpočinuli.
* Epochy
*
* Na úplný závěr si pojďme ještě představit několik posledních metod na LocalDateTime.
*
*    ofEpochSecond() - Statická metoda nám umožňuje vytvořit datum a čas z tzv. Linux timestamp, 
*                      ve kterém se datum a čas často ukládal zejména v minulosti. 
*                      Je to velké číslo označující počet vteřin od 1.1.1970 (začátek linuxové epochy), 
*                      musíme uvést i nanosekundy (většinou 0) a časovou zónu, což je nejčastěji ZoneOffset.UTC. Metoda je dostupná i na LocalDate jako ofEpochDay(), 
*                      kde přijímá počet dní místo sekund.
*    toEpochSecond() a toEpochDay() - Metody opačné ke dvěma předchozím, převádí hodnotu na počet sekund/dní od roku 1970.
*/

    private JavaDateTime datumCas;
    private String text;

    public JavaDateTime(JavaDateTime datumCas, String text) {
        this.datumCas = datumCas;
        this.text = text;
    }

    public JavaDateTime getDatumCas() {
        return datumCas;
    }

    public void setDatumCas(JavaDateTime datumCas) {
        this.datumCas = datumCas;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return datumCas + " " + text;
    }

    /* 
    * pridat "databazi" class
    *
    import java.util.ArrayList;

public class Databaze {

    private ArrayList<Zaznam> zaznamy;

    public Databaze() {
        zaznamy = new ArrayList<>();
    }

} 
    *
    * Dodejme třídě metody pro přidání, vymazání a vyhledání záznamu.
    * vyhledání záznamu.
    * 
    public void pridejZaznam(Calendar datumCas, String text) {
        zaznamy.add(new Zaznam(datumCas, text));
}
    * 
    public ArrayList<Zaznam> najdiZaznamy(Calendar datum, boolean dleCasu) {
        ArrayList<Zaznam> nalezene = new ArrayList<>();
        for (Zaznam z : zaznamy) {
                if (((dleCasu) && (z.getDatumCas().equals(datum))) // dle času a data
                        ||
                ((!dleCasu) && // pouze dle data
                        (z.getDatumCas().get(Calendar.DAY_OF_MONTH) == datum.get(Calendar.DAY_OF_MONTH)) &&
                        (z.getDatumCas().get(Calendar.MONTH) == datum.get(Calendar.MONTH))) &&
                        (z.getDatumCas().get(Calendar.YEAR) == datum.get(Calendar.YEAR))
                )
                   nalezene.add(z);
        }
        return nalezene;
}
    * Nakonec přidáme vymazání záznamů v určitou dobu. To provedeme pomocí metody najdiZaznamy() 
    * a nalezené záznamy jednoduše proiterujeme a z ArrayListu odstraníme. 
    * Budeme mazat podle přesného data i času, 2. parametr u metody najdiZaznamy() bude tedy true:
    * 
public void vymazZaznamy(Calendar datum) {
        ArrayList<Zaznam> nalezeno = najdiZaznamy(datum, true);
        for (Zaznam z : nalezeno) {
                zaznamy.remove(z);
        }
}
    * 
    import java.util.Scanner;

public class Diar {

        private Databaze databaze;
        private Scanner sc = new Scanner(System.in, "Windows-1250");

        public Diar() {
                databaze = new Databaze();
        }

}
    * atd. viz projekt 
    */
    
    
    
}
