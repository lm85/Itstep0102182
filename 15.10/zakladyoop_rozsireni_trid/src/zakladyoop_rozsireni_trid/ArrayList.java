/*
 * https://www.itnetwork.cz/java/oop/java-tutorial-list-pridavani-mazani-polozek
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakladyoop_rozsireni_trid;

/**
 *
 * @author Milan Zlamal
 */
public class ArrayList {
/*
* ArrayList
* ArrayList je tzv. generická kolekce. 
* Pojem genericita si plně vysvětlíme až u kolekcí, nyní nám bude stačit vědět, 
* že při deklaraci ArrayListu specifikujeme datový typ objektů, které v něm budou uloženy. 
* Začněme jednoduše a udělejme si ArrayList čísel, která budeme náhodně losovat.
* Losování
* Program se nás vždy zeptá, zda chceme losovat další číslo a to se přidá do ArrayListu. 
* Pokud již nebudeme chtít losovat, program vypíše losovaná čísla, seřazená od nejmenšího po největší. 
* Založme si nový projekt Losovani a vytvořme si třídu Losovac. 
* Třída bude obsahovat ArrayList typu Integer, kde budou čísla uložena.
* Narážíme na třídu Integer, která slouží k uložení celých čísel a v podstatě obaluje typ int. 
* Do ArrayListu se totiž dají vkládat pouze objekty, tedy proměnné referenčního typu. 
* Pro tyto účely existuje typ Integer. Ke každému primitivnímu typu v Javě existuje jeho referenční "obal", brzy si je uvedeme. 
* ArrayList bude privátní a bude sloužit pouze jako interní úložiště dané třídy, aby se na něj zvenku nedalo přistupovat.
* 
* ArrayList deklarujeme takto:
*
ArrayList<Integer> cisla;
*
* Datový typ píšeme u generických kolekcí do špičatých závorek. 
* ArrayList je samozřejmě objekt, jako každý jiný. 
* Stejně jako u pole a jiných objektů, i zde proměnnou před použitím inicializujeme:
*
ArrayList<Integer> cisla = new ArrayList<Integer>();
*
* Všimněte si závorek, které značí konstruktor. 
* Takovýto list tedy umístíme do naší třídy, spolu s náhodným generátorem Random. 
* Pro práci s třídou ArrayList je třeba přidat import java.util.Arra­yList. 
* V konstruktoru atributy inicializujeme:
*
import java.util.ArrayList;
import java.util.Random;

public class Losovac {
        private ArrayList<Integer> cisla;
        private Random random;

        public Losovac() {
                random = new Random();
                cisla = new ArrayList<Integer>();
        }

}
* Dále přidáme metody losuj() a vypis(), kde losuj() přidá do ArrayListu nové náhodné číslo 
* a také ho vrátí jako návratovou hodnotu. vypis() vrátí textový řetězec pro vypsání. 
* Ten bude obsahovat čísla z cisla, seřazená a oddělená mezerou.
* Losování náhodného čísla již známe z dílu o hrací kostce, zde budeme vyhazovat čísla od 1 do 100. 
* Číslo do ArrayListu přidáme pomocí metody add():
*
public int losuj() {
        Integer cislo = random.nextInt(100) + 1;
        cisla.add(cislo);
        return cislo;
}
*
* Velmi jednoduché, že? Kolekce ArrayList je interně poměrně složitá a zatím se nebudeme zabývat tím, co se uvnitř děje. 
* To je ostatně účel Javy, nabízet kvalitní a sofistikované komponenty, které se jednoduše používají.
*
* Výpis čísel bude ještě snazší. 
* K setřídění ArrayListu použijeme metodu sort ze třídy Collections, která list setřídí. 
* Bude tedy potřeba import java.util.Collec­tions. 
* Metoda nic nevrací, pouze ArrayList setřídí uvnitř.
*
public String vypis() {
        String s = "";
        Collections.sort(cisla);
        for (int i : cisla) {
                s += i + " ";
        }
        return s;
}
*
* Přesuňme se do main() a pomocí while cyklu umožněme uživateli ovládat objekt. 
* Podobný program byla kalkulačka z prvních lekcích, kde jsme se v cyklu ptali, 
* zda si uživatel přeje opakovat výpočet. 
* Zde budeme postupovat totožně.
*
* Ovládání bude pomocí možností 1, 2, 3 (losuj, vypiš, konec). Budeme je načítat pomocí sc.nextLine() jako String.
*
Scanner sc = new Scanner(System.in, "Windows-1250");
Losovac losovac = new Losovac();
System.out.println("Vítejte v programu losování.");
String volba = "0";
// hlavní cyklus
while (!(volba.equals("3"))) {
    // výpis možností
    System.out.println("1 - Losovat další číslo");
    System.out.println("2 - Vypsat čísla");
    System.out.println("3 - Konec");
    volba = sc.nextLine();
    System.out.println();
    // reakce na volbu
    switch (volba) {
        case "1":
            System.out.printf("Padlo číslo: %s\n", losovac.losuj());
            break;
        case "2":
            System.out.printf("Padla čísla: %s\n", losovac.vypis());
            break;
        case "3":
            System.out.println("Děkuji za použití programu");
            break;
        default:
            System.out.println("Neplatná volba, zadejte prosím znovu.");
            break;
    }
}
* Nezapomeneme na import Scanner. 
* Vlastně můžeme nechat řešení importů na NetBeans, stačí kliknout pravým tlačítkem a zvolit Fix imports, 
* případně použít klávesovou zkratku Ctrl + Shift + I.
*
* Průběh programu je z kódu dobře viditelný, nejprve nastavíme volbu na nějakou výchozí hodnotu, 
* aby cyklus poprvé proběhl. Poté volbu načteme z klávesnice. 
* String zpracujeme pomocí switche a provedeme příslušné akce. 
* Pokud bylo zadáno něco jiného, pokryje to možnost default.    
*
* Vidíme, že můžeme stále přidávat nová a nová čísla. Máme mnohem větší možnosti, než s polem. 
* Zároveň však můžeme s ArrayListem pracovat podobně, jako jsme pracovali s polem.
* K přístupu můžeme využít metody get() a set(), ale pozor, prvek musí existovat. 
* Zkusme si napsat následující kód:
* 
ArrayList<String> l = new ArrayList<String>();
l.add("První");
System.out.println(l.get(0));
l.set(0, "První položka");
System.out.println(l.get(0));
l.set(1, "Druhá položka");  // vyhodí chybu
*
* Vytvoříme si list Stringů. 
* Přidáme položku "První" a poté vypíšeme položku na indexu 0. 
* Vypíše se nám "První". Můžeme na ni samozřejmě i takto zapisovat. 
* S druhou položkou na pozici 1 však již nemůžeme pracovat, protože jsme ji do listu nepřidali. 
* U pole jsme zadali velikost a on všechny "přihrádky" (proměnné pod indexy) založil. 
* Nyní velikost nezadáváme a "přihrádky" si přidáváme sami.
*
* Podívejme se na ArrayList podrobněji a vypišme si metody, které jsou pro nás nyní zajímavé:
* Konstruktory
*
* Kromě prázdného ArrayListu můžeme List vytvořit i jako kopii z jiného listu, pole nebo jiné kolekce. 
* Stačí kolekci předat do konstruktoru:    
*
package onlineapp;
import java.util.ArrayList;
import java.util.Arrays;

public class Program
{
 	public static void main(String[] args) {

String[] poleStringu = {"První", "Druha", "Třetí"};
ArrayList<String> l = new ArrayList<String>(Arrays.asList(poleStringu));
System.out.println(l.get(2));
	}
}
*
* Kód výše vypíše "Třetí". 
* Prvky pole se do nového listu zkopírují. 
* Stejně můžeme předat i jiný ArrayList.
* Metody na ArrayListu
*
*    size() - Funguje jako length na poli, vrací počet prvků v kolekci.
*    add(položka) - Metodu add() jsme si již vyzkoušeli, jako parametr bere položku, kterou vloží do listu.
*    addAll(kolekce) - Přidá do listu více položek, např. z pole.
*    clear() - Vymaže všechny položky v listu.
*    contains(položka) - Vrací true/false podle toho, zda ArrayList obsahuje předanou položku.
*    indexOf(položka) - Vrátí index prvního výskytu položky (jako u pole). Vrací -1 při neúspěchu.
*    lastIndexOf(po­ložka) - Vrací index posledního výskytu položky v Listu. Vrací -1 při neúspěchu.
*    remove(položka) - Vymaže první nalezenou položku.
*    removeAll(index, počet) - Vymaže daný počet prvků od zadaného indexu.
*    toArray() - Zkopíruje položky z ArrayListu do pole a to vrátí.
*
* Další metody
*
* Další metody a pro práci s listem najdeme ve třídě Collections. 
* Jako parametr berou danou kolekci.
*
*    min() - Vrátí nejmenší prvek z kolekce.
*    max() - Vrátí největší prvek z kolekce.
*    reverse() - Obrátí list tak, že je první položka poslední a naopak. 
*               Metoda nic nevrací, změny se provedou v zadaném listu.
*    sort() - Sort již také známe, setřídí položky v listu. Metoda opět nic nevrací.
*
* Vidíme, že kolekce ArrayList toho umí mnohem více, než pole. 
* Největší výhodou je přidávání a mazání prvků. Daň ve výkonu je zanedbatelná. 
* V sekci s kolekcemi zjistíme, že ArrayList má ještě další metody, ale zatím na to nemáme zkušenosti.
*
* Program pro ukládání losovaných čísel byl zajímavý, 
* ale jistě se nám bude v budoucnu hodit ukládat spíše plnohodnotné objekty, než čísla. 
* V příští lekci, Datum a čas v Javě 8 - Vytváření a formátování, si uděláme pomocí ArrayListu databázi, bude to elektronický diář!
* projekt najdu:
* https://www.itnetwork.cz/api/Articles-Article/file/4fe937e65a9ce    
*/
}
