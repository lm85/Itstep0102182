/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ASUS
 */
public class MorseovkaNGTest {
    
    public MorseovkaNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
