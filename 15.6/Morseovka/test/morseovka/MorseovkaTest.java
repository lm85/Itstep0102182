/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package morseovka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MorseovkaTest {
    
    public MorseovkaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Morseovka.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Morseovka.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toMorse method, of class Morseovka.
     */
    @Test
    public void testToMorse() {
        System.out.println("toMorse");
        char[] translates = null;
        String[] dottie = null;
        String expResult = "";
        String result = Morseovka.toMorse(translates, dottie);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toEnglish method, of class Morseovka.
     */
    @Test
    public void testToEnglish() {
        System.out.println("toEnglish");
        String[] translates = null;
        String[] alpha = null;
        String expResult = "";
        String result = Morseovka.toEnglish(translates, alpha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
