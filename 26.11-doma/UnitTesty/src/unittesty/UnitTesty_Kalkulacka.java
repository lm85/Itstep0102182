/*
 * jUNITY tutorial
 * prvni cast:
 * https://www.itnetwork.cz/java/testovani/testovani-v-jave-prvni-unit-test-v-junit
 * druha cast:
 * https://www.itnetwork.cz/java/testovani/testovani-v-jave-hamcrest-junit-testrule-a-best-practices
 * V minulé lekci online kurzu o testování software v Javě 
 * jsme si uvedli úplné základy JUnit a napsali první unit test. 
 * V dnešní lekci unit testy dokončíme, uvedeme si knihovnu Hamcrest, 
 * která je nově podporována JUnit a zásadně mění způsob, jakým píšeme asserce. 
 * Dále se budeme věnovat pravidlům (TestRules) a na závěr zmíníme 
 * best practices pro psaní jednotkových testů.
 */
package unittesty;

/**
 *
 * @author david
 */
public class UnitTesty_Kalkulacka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    /*
    * Metody setUp() a tearDown(), přesněji metody s anotacemi 
    @Before a @After, 
    se zavolají před, resp. po každém testu v této třídě. 
    To je pro nás velmi důležité, jelikož podle best practices chceme, 
    aby byly testy nezávislé. Obvykle tedy před každým testem 
    připravujeme znovu to samé prostředí, aby se vzájemně vůbec neovlivňovaly. 
    O dobrých praktikách se zmímíne detailněji v příští lekci. 
    Do třídy si přidejme atribut kalkulacka a v metodě setUp() 
    v něm vždy vytvořme čerstvě novou kalkulačku pro každý test. 
    Pokud by ji bylo ještě třeba dále nastavovat 
    nebo bylo třeba vytvořit další závislosti, byly by také v této metodě
    */        
    
        
        
    }
    
}
