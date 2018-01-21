package zakladyoop_rozsireni_trid.Lekce.folder;

/*
 * https://www.itnetwork.cz/java/oop/datum-a-cas-v-jave-8-vytvareni-a-formatovani
 */


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

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
*    
*/
    
}
