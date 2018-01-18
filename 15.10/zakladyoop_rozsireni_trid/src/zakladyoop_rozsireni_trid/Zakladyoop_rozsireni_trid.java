/*
 * Upravte tridu Zvire() pro potreby dedeni
 * pridejte metodu vydejZvuk() pro vydani zvuku zvirete
 *  - metoda nemusi delat nic (vraci textovy retezec)
 * ve tride definujte metodu toString pro jeji prevod na text
 * Vytvorte nekolik trid konkretnich zvirat (kachna, pes, kocka)
 *  - kazda trida pridava jeden atribut, ktery se inicializuje pres konstruktor
 *  - kazde zvire upravuje metodu vydejZvuk() dle sveho
 * Vytvorte pole typu Zvire a ulozit do nej nekolik instanci ruznych trid reprezentujicich zvirata
 * Po te vypiste zvukyjednotlivych zvirat ulozenych v poli pomoci metody vydejZvuk()
 * Nakonec vypiste instance zvirat v poli primo do textoveho vystupu
 *
 * 2* for each cyklus
 *
 * rozhrani predepisuje metody co musime doimplementovat ve tride ktera je pouziva, 
 * jedna trida muze vicero
 *
 * Abstraktni trida
 * je to trida a muzeme do ni napsat metody co ma a co maji obsahovat potomci
 * nemusime vsechny metody implementovat
 * nutno pak vse overridovat
 * NELZE V NI UDELAT INSTANCI
 * Abstract Methods and Classes
 * An abstract class is a class that is declared abstract—it may
 * or may not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed.
 * An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon), like this:
 * abstract void moveTo(double deltaX, double deltaY);
 * If a class includes abstract methods, then the class itself must be declared abstract, as in:
 * pokud dedim od predka, tak vzdy k nim mam pristup pokud bude protected, ma pristup
 * odvozene tridy vyzaduji pristup na polozky co nejsou public
 *
 * public abstract class GraphicObject {
 *  // declare fields
 *  // declare nonabstract methods
 *  abstract void draw();
 * }
 * When an abstract class is subclassed, 
 * the subclass usually provides implementations for all of the abstract methods 
 * in its parent class. However, if it does not, then the subclass must also be declared abstract.
 * Note: Methods in an interface (see the Interfaces section) 
 * that are not declared as default or static are implicitly abstract, 
 * so the abstract modifier is not used with interface methods. (It can be used, but it is unnecessary.)   
 *
 * Rozhrani
 * chovani bude implementovano v jinych, nesouvisejicich tridach
 * chceme specifikovat chovani konkretniho datoveho typu (dane jmenem rozhrani)
 * bez ohledu na konkretni implementaci chovani
 * chceme vyuzit vicenasobnou dedicnost
 * 
 * vyjimky
 * nezcykli se kdyz pri podmnince
 * throw jednoduche vyhozeni - pr u podminky
 * lepe takto
 * odchytavani pres try catch finally
 * pricemz try nemuze byt samostatne
 * muzu mit try catch
 * muzu mit try finally
 * catch chytne vyjimku
 * finally - vzdy se provede
 *
 * vyctove typy muze nabizet nejake podminky a pod
 *
 * static
 * vsechny Math.neco 
 * k simulovani klasickych funkci
 * zname-li roli tridy pri instanci objektu
 * muzeme definovat promenne, metody i na samotne tride
 * patri tride, ale ne instanci - nemusim ji vytvaret
 * u tridy znamena ze muze obsahovat staticke funkce
 * Spravne pouziti:
 * Utility tridy Math a tridy, u kterych nedava instance smysl (Console)
 * navrhove vzory (napr Factory method)
 * constanty a dalsi
 * Spatne
 * sdileni dat napric celym programem a tvorba "bozskych objektu"
 * narozdil od VB6 
 * 
 * const - konstanty
 * nemenne hodnoty vyclenime do konstant na 1 misto pro snadnejsi spravu dat
 * s novou verzi programu se zmeni konstanta
 * ve tride:
 * public static final in PLNOLETOST=15;
 * final slouzi k zabraneni dalsiho prepisu nebo dedicnosti 
 * nelze override
 * lze tridu - final class nemohu pa dedit
 * 
 * PAMET
 * Hodnotove datove typy
 * pevna velikost
 * ma se s nimi pracovat co nejrychleji
 * zabiraji malo mista
 * v programovani se jich vyskytuje velmi malo
 * 
 * HEAP
 * vytvorim instanci tridy clovek a ulozim ji do promenne
 * Objekt se ulozi do pameti zvane halda (heap)
 *  - je prakticky neomezena
 *  - pristup je ale slozitejsi a pomalejsi
 * Ovsem reference na nej v podobe one promenne se ulozi na zasobnik
 * 
 * Referencni datove typy
 * novej objekt vytvorim jen new
 * mohu ukazovat z nekolika promennych naraz
 * 
 * Dynamicka sprava pameti
 * nici object garbage collector (GC)
 *   - program bezici paralelne s nasim programem
 *   - pokud je malo mista, alokuje vic
 *   - kouka zda nejsou v pameti nezadouci reference
 *   - spousti destruktor
 *
 * Prazdna reference (null)
 * prazdna objektova reference - neukazuje do pameti 
 * pokud mam 2 reference, smazou se az po zruseni obou Garbage collectorem
 * 
 * Predani reference v parametrech
 * krom datovych typu predava referenci
 * 
 * 
 * Porovnani objektu
 * equals
 * == porovnej adresy na stacku - u hodnot
 * je svazana s hashCode
 * muzeme ji prekryt: 
 * a.equals(b); porovna objekty
 *  - porovna jestli dve reference ukazuji na stejny objekt 
 *  - nemuzeme ho prekryt
 * 
 * Klonovani
 * hluboka reference musime klonovat i podobjekty
 *
 * Melka kopie pouze k referencim - proste prvni vrstva
 *
 * Kolekce
 * struktury pro ukladani vice prvku
 * Pole
 * 
 * Proč používat anotaci @Override  
 * Jednou z nejužitečnějších anotací, kterou představila Jave 1.5, 
 * je bezesporu anotace @Override. Tuto anotaci je důležité použít pokaždé, 
 * když překrýváte metodu, kterou deklaruje předek vaší třídy. 
 * Díky tomu budete kompilátorem upozorněni, 
 * a to ne varováním jak si mnozí mylně domývají, 
 * ale rovnou kompilační chybou, ve chvíli kdy kompilátor 
 * nenajde metodu stejné signatury v předkovi. 
 * Díky použití této anotace chráníte vlastní kód před těžko detekovatelnými chybami.
 * !!! bereme Metodu uz prepsanou tzn. aktualni !!!
 * pak v metode nepouzivame add ale super() - kdyz ji pouzijeme, musime overridovat 
 * pokud pouziji final, tak beru neoverridovou metodu
 * 
 * Seznamy
 * musi byt objektovy int
 * List<Integer> cisla = new arrayList<>();
 * lide.add(karel);
 * System.outprintln(lide.get(0));
 * 
 * Jednosmerny spojovy seznam (SinglyLinkedList)
 *   - bere lifo
 * 
 * Obousmerny (DoubleLinkedList)
 *   - bere fifo
 * 
 * 
 * Slovniky/Mapy MAP
 * ukladani pomoci hashovaci funkce 
 * pokud pristupujeme k prvku napr. pod jmenem nebo kodem
 * mohu cimkoliv indexovat cokoliv
 * pokud casto pristupuji k prvku
 * 
 * Mnoziny
 * vychazi z matematickeho pojmu
 * SET
 * kazdy prvek tam muze byt jen jednou
 * 
 * pro hromadne prace s datama funkcionalne programovat 
 *  - nutno ukladat funkce do promennych
 *  - pri praci s kolekcema
 * 
 * Generika
 * mohu si udelat generickou tridu a pracuji s ni jako s existujicim typem
 * po dosazeni cloveka se mi pak dosadi vsude
 * 
 * 
 * Funkcionalni programovani
 * zaklad:
 * do promenne dam funkci a pak ji provolat jako funkci
 * mohu predavat jako parametr
 * mam kolekci lidi a chci je filtrovat lidi se jmenem s 5 znaky
 * 
 * pretypovani priklad (napriklad mam sklad a mohu vec predavat do jineho mista - pobocky)
 * Participants player = (Participants)participants.get(i)
 * 
 * Udalost 
 * ceka az se neco stane - pr. klikne na neco
 * 
 */

package zakladyoop_rozsireni_trid;

/**
 *
 * @author Milan Z
 */
public class Zakladyoop_rozsireni_trid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

    }
    
}
