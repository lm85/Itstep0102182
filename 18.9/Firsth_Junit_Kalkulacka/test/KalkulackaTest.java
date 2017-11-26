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

import firsth_junit_kalkulacka.Firsth_Junit_Kalkulacka;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Milan Z
 */
public class KalkulackaTest {

    private Firsth_Junit_Kalkulacka Firsth_Junit_Kalkulacka;

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
    
    // metoda
    @BeforeClass
    public static void setUpClass() {
    }
    
    //metoda
    @AfterClass
    public static void tearDownClass() {
    }

    //metoda
    @Before
    public void setUp() {
        // Nová kalkulačka je vytvořena před každým testem pro garantování jejich nezávislosti
        Firsth_Junit_Kalkulacka = new Firsth_Junit_Kalkulacka();
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    // test metoda
    @Test
    public void scitani() {
        assertEquals(2, Firsth_Junit_Kalkulacka.secti(1, 1), 0);
        assertEquals(1.42, Firsth_Junit_Kalkulacka.secti(3.14, -1.72), 0.001);
        assertEquals(2.0 / 3, Firsth_Junit_Kalkulacka.secti(1.0 / 3, 1.0 / 3), 0.001);
    }

    // test metoda    
    @Test
    public void odcitani() {
        assertEquals(0, Firsth_Junit_Kalkulacka.odecti(1, 1), 0);
        assertEquals(4.86, Firsth_Junit_Kalkulacka.odecti(3.14, -1.72), 0.001);
        assertEquals(2.0 / 3, Firsth_Junit_Kalkulacka.odecti(1.0 / 3, -1.0 / 3), 0.001);
    }

    // test metoda    
    @Test
    public void nasobeni() {
        assertEquals(2, Firsth_Junit_Kalkulacka.vynasob(1, 2), 0);
        assertEquals(-5.4008, Firsth_Junit_Kalkulacka.vynasob(3.14, -1.72), 0.001);
        assertEquals(0.111, Firsth_Junit_Kalkulacka.vynasob(1.0 / 3, 1.0 / 3), 0.001);
    }

    // test metoda    
    @Test
    public void deleni() {
        assertEquals(2, Firsth_Junit_Kalkulacka.vydel(4, 2), 0);
        assertEquals(-1.826, Firsth_Junit_Kalkulacka.vydel(3.14, -1.72), 0.001);
        assertEquals(1, Firsth_Junit_Kalkulacka.vydel(1.0 / 3, 1.0 / 3), 0);
    }

    // test metoda    
    @Test(expected = IllegalArgumentException.class)
    public void deleniVyjimka() {
        Firsth_Junit_Kalkulacka.vydel(2, 0);
    }
    
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
