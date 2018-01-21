/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakladyoop_rozsireni_trid.Lekce.folder;

import java.util.Collections;

/**
 * @author Milan Zlamal
 * 
 * Kolekce je kontejner podobných objektů. Preferujte kolekce před poli. S kolekcemi se pracuje jednodušeji než s poli.
 * Obecné metody pro kolekce: size(), isEmpty(), contains(), add(), remove(), iterator()... v Java 8: stream(), parallelStream()
 * Definice prázdných kolekcí: Collections.EM­PTY_LIST, Collections.EM­PTY_MAP, Collections.EM­PTY_SET
 * 
 * Nejběžněji používané implementace collection:
 * INTERFACE 	IMPLEMENTACE
 *  SET 	HashSet
 *  LIST 	ArrayList
 *  MAP 	HashMap
 *  QUEUE 	LinkedList
 *  DEQUE 	ArrayDeque
 * 
 * Řazení kolekce
 * popsano nize
 * 
 */
public class Kolekce {
 /*   
  * Řazení kolekce
  * Pro řazení je důležité určit algoritmus, kterým se budou jednotlivé prvky kolekce porovnávat. 
  * Existují pro to dvě rozhraní.
  * Rozhraní Comparable, které implementuje prvek v kolekci. 
  * Dalo by se říct, že se jedná o defaultní řazení objektu. 
  * Použitím říkáte, že se daný objekt má vždy řadit podle daných vlastností.
 */   
    
    // Defaultní objekt řazení
public interface Comparable<T> {
        //výsledek: 0 rovnají se, + lexicograficky větší, - lexicograficky menší
        public int compareTo(T o);
}

/*
 * Rozhraní Comparator se liší v tom, že se používá nad celou kolekcí. 
 * Dalo by říct, že se jedná o konkrétní řazení v dané situaci. 
 * Porovnávají se dva objekty mezi sebou.
*/
// Řazení podle pravidel
public interface Comparator<T> {
        //výsledek: 0 rovnají se, + lexicograficky větší, - lexicograficky menší
        int compare(T o1, T o2);
}
/* 
* 
* Poté stačí použít Collections.sort. 
* Collections.sort využívá k řazení řadící algoritmus merge sort (n log(n)).
* Příklad z praxe:
* JAVA 7
*
public class Car implements Comparable<Car> {
// nejaky kod
    @Override
    public int compareTo(Car o) {
        return getId().compareTo(o.getId());
    }
        private Object getId() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
Collections.sort(initCars);
*
* JAVA 8
*
Collections.sort(personList, (Person p1, Person p2) -> p1.firstName.compareTo(p2.firstName));
Collections.sort(personList, (p1, p2) -> p1.firstName.compareTo(p2.firstName));
personList.sort((p1, p2) -> p1.firstName.compareTo(p2.firstName));
*
* Vyhledání
* Pro vyhledávání se v defaultních případech používá metoda contains() nebo get(). 
* Tyto metody volají metodu equals() nad daným objektem v kolekci. 
* Pokud nemůžeme metodu equals() přepsat a její porovnání nám nevyhovuje, použíjeme Predicate.
* Predicate vykoná test na podmínku a vybere prvky, které této podmínce vyhovují.
* Metody z CollectionUtils, u kterých lze použít: subtract, find, filter, filterInverse, countMatches, exists, matchesAll, select, atd.
*
public interface Predicate<T> {
        // true prvek vyhovuje podmínce; false nevyhovuje
        boolean evaluate(T object);
}
*
* Příklad z praxe:
*
* JAVA 7:
*
public class CarOwnerPredicate implements Predicate<Car> {
        @Override
        public boolean evaluate(Car car) {
                return car.getOwner().equals(expected.getOwner());
        }
// dalsi kod
boolean result = CollectionUtils.exists(initCars, new CarOwnerPredicate(pepaCar));
// s využitím anonymní třídy
Car currentPepaCar = CollectionUtils.find(initCars, new Predicate<Car>() {
        @Override
        public boolean evaluate(Car car) { return car.getOwner().equals(owner); }
});
*
* JAVA 8:
*
boolean exists = initCars.stream().anyMatch(car -> car.getOwner().equals(owner));
Car currentIgorCar = initCars.stream()
        .filter(car -> car.getOwner().equals(owner))
        .limit(1)
        .findFirst()
        .get();
*
* Transformace Transformer
* Existují dva druhy transformace. 
* První změní vnitřní vlastnosti objektu, druhá jej transformuje na jiný objekt.
* Transformer je odpovědný za transformaci dat z jednoho objektu do jiného.
* Dalo by se říci, že je to takový mapper mezi dvěmi typy. 
* Metody z CollectionUtils, u kterých lze použít: transform, collect, transformingCo­llection
*
public interface Transformer<I, O> {
   O transform(I input);
}
*
* Příklad z praxe:
*
* JAVA 7:
*
public class Car2TaxiTransformer implements Transformer<Car, Taxi> {
    @Override
    public Taxi transform(Car car) {
        Taxi dst = new Taxi();

        dst.setColor(car.getColor());
        //dalsi kod

List<Taxi> taxis = new ArrayList<>(CollectionUtils.collect(initCars, new Car2TaxiTransformer()));
*
JAVA 8:
*
List<Taxi> taxis = initCars.stream()
       .map(it -> { Taxi t = new Taxi();
           t.setColor(it.getColor());
           t.setCompany(GOVERNMENT);
           return t;
       }).collect(Collectors.toList());
*
* Transformace Closure
* Closure slouží pro změnu vlastností každého objektu v kolekci
* Metody z CollectionUtils, u kterých lze použít: forAllDo, forAllButLastDo
*
public interface Closure<T> {
   void execute(T input);
}
*
* Příklad z praxe:
*
* JAVA 7
*
public class CarColorClosure implements Closure<Car> {
    @Override
    public void execute(Car car) {
        if ("yellow".equals(car.getColor())) {
            car.setColor("black");
        }
    }
// dalsi kod

CollectionUtils.forAllDo(initCars, new CarColorClosure());
*
* JAVA 8
*
initCars.stream().forEach(car -> car.setColor("black"));

* Dané příklady naleznete také v přiloženém maven projektu. 
* Vyzkoušení si čehokoli pomocí main() se mi zdá neprogramátorské. 
* V přiloženém projektu proto naleznete příklady, které si můžete ověřit pomocí testů.
* www.itnetwork.cz/navrhove-vzory/strategy-strategie-navrhovy-vzor
* priklad u mne na gitu v adresari Kolekce - jsou tam i testy
* 
* Otázka na závěr: Jaký návrhový vzor byl ve většině příkladů použit? (př. CollectionUtil­s.forAllDo(init­Cars, new CarColorClosu­re());)
* https://www.itnetwork.cz/navrh/navrhove-vzory/gof/gof-vzory-chovani/strategy-strategie-navrhovy-vzor/
*/
}
