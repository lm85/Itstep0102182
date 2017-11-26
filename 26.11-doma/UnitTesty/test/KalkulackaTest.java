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

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import unittesty.Kalkulacka;

/**
 * Testuje jednoduchou kalkulačku
 */
public class KalkulackaTest {

    @Rule
    public ExpectedException vyjimka = ExpectedException.none();

    /**
     * Instance kalkulačky
     */
    private Kalkulacka kalkulacka;

    public KalkulackaTest() {
    }
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

    // test metoda    
    @BeforeClass
    public static void setUpClass() {
    }

    // test metoda    
    @AfterClass
    public static void tearDownClass() {
    }

    // test metoda    
    @Before
    public void setUp() {
        // Nová kalkulačka je vytvořena před každým testem pro garantování jejich nezávislosti
        kalkulacka = new Kalkulacka();
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    // test metoda    
    @After
    public void tearDown() {
    }

    // test metoda        
    @Test
    public void scitani() {
        assertEquals(2, kalkulacka.secti(1, 1), 0);
        assertEquals(1.42, kalkulacka.secti(3.14, -1.72), 0.001);
        assertEquals(2.0 / 3, kalkulacka.secti(1.0 / 3, 1.0 / 3), 0.001);
    }

    // test metoda        
    @Test
    public void odcitani() {
        assertEquals(0, kalkulacka.odecti(1, 1), 0);
        assertEquals(4.86, kalkulacka.odecti(3.14, -1.72), 0.001);
        assertEquals(2.0 / 3, kalkulacka.odecti(1.0 / 3, -1.0 / 3), 0.001);
    }

    // test metoda        
    @Test
    public void nasobeni() {
        assertEquals(2, kalkulacka.vynasob(1, 2), 0);
        assertEquals(-5.4008, kalkulacka.vynasob(3.14, -1.72), 0.001);
        assertEquals(0.111, kalkulacka.vynasob(1.0 / 3, 1.0 / 3), 0.001);
    }

    // test metoda        
    @Test
    public void deleni() {
        assertEquals(2, kalkulacka.vydel(4, 2), 0);
        assertEquals(-1.826, kalkulacka.vydel(3.14, -1.72), 0.001);
        assertEquals(1, kalkulacka.vydel(1.0 / 3, 1.0 / 3), 0);
        assertThat(kalkulacka.vydel(4, 6546), is(notNullValue()));
    }

    // test metoda        
    @Test(expected = IllegalArgumentException.class)
    public void deleniVyjimka() {
        kalkulacka.vydel(2, 0);
    }

    // test metoda
    @Test(expected = IllegalArgumentException.class)
    public void nasobeniBufferVyjimka() {
        kalkulacka.vynasob(654654654, 65465465);
    }


    /*
     As answered before, there are many ways of dealing with exceptions in JUnit. 
     But with Java 8 there is another one: using Lambda Expressions. 
     With Lambda Expressions we can achieve a syntax like this:
     
    v jUnity 5
    
    @Test
    public void verifiesTypeAndMessage() {
        assertThrown(new Kalkulacka()::vynasob)
                .isInstanceOf(RuntimeException.class)
                .hasMessage("Runtime exception occurred")
                .hasMessageStartingWith("Runtime")
                .hasMessageEndingWith("occurred")
                .hasMessageContaining("exception")
                .hasNoCause();
    }
    */
    
    /*
     * K porovnávání výstupu metody s očekávanou hodnotou používáme 
     metody assert*, staticky naimportované z balíčku org.junit.Assert. 
     Nejčastěji asi použijete assertEquals(), 
     která přijímá jako první parametr očekávanou hodnotu a jako druhý parametr 
     hodnotu aktuální. Toto pořadí je dobré dodržovat, 
     jinak budete mít hodnoty ve výsledcích testů opačně. 
     Jak asi víte, desetinná čísla jsou v paměti počítače reprezentována binárně 
     (jak jinak :) ) a to způsobí určitou ztrátu jejich přesnosti 
     a také určité obtíže při jejich porovnávání. 
     Proto musíme v tomto případě zadat i třetí parametr a to je delta, 
     tedy kladná tolerance, o kolik se může očekávaná a aktuální hodnota lišit, 
     aby test stále prošel. Všimněte si, že zkoušíme různé vstupy. 
     Sčítání netestujeme jen jako 1 + 1 = 2, ale zkusíme celočíselné, 
     desetinné i negativní vstupy, odděleně, a ověříme výsledky. 
     V některých případech by nás mohla zajímat 
     také maximální hodnota datových typů a podobně.
     Poslední test ověřuje, zda metoda vydel() opravdu vyvolá výjimku 
     při nulovém děliteli. 
     Jak vidíte, nemusíme se zatěžovat s try-catch bloky, 
     do anotace stačí pouze přidat parametr expected a uvést zde třídu výjimky, 
     která se očekává. Pokud výjimka nenastane, test selže. 
     Pro testování více případů vyvolání výjimky tímto způsobem 
     by bylo třeba přidat více metod.
    
     Dostupné assert metody

     Kromě metody assertEquals() můžeme použít ještě několik dalších, 
     určitě se snažte použít tu nejvíce vyhovující metodu, 
     zpřehledňuje to hlášky při selhání testů a samozřejmě i následnou opravu.

     assertArrayEquals() - Zkontroluje, zda 2 pole obsahují ty samé prvky.
     assertEquals() - Zkontroluje, zda jsou 2 hodnoty stejné (porovnává pomocí equals()).
     assertFalse() - Zkontroluje, zda je hodnota false.
     assertNotEquals() - Zkontroluje, zda 2 hodnoty nejsou stejné.
     assertNotNull() - Zkontroluje, zda hodnota není null.
     assertNotSame() - Zkontroluje, zda 2 reference neukazují na stejný objekt.
     assertSame() - Zkontroluje, zda 2 reference ukazují na stejný objekt (porovnává pomocí ==).
     assertTrue() - Zkontroluje, zda je hodnota true.
     assertThat() umožňuje novější přístup k psaní assercí, 
    
    
    
    
    
    
     Spuštění testů

     Testy spustíme kliknutím pravým tlačítkem na projekt 
     a vybráním položky "Test" z kontextového menu.
    
    
    
     */
}
