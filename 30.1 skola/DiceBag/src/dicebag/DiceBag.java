/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicebag;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author Milan Zlamal
 */
public class DiceBag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        /*
        * Definujeme scanner input z klavesnice
         */
        System.out.println("Zadej pocet sten");
        Scanner intScanner = new Scanner(System.in);

        /*
        * Klasicky for cyklus pro reseni osetreni vstupu
        */
        

            if (!intScanner.hasNextInt()) {
                throw new InputMismatchException("Zadejte ciselnou hodnotu");
            }
        int choose = intScanner.nextInt();

        int roll = intScanner.nextInt();
        roll = choose;
        System.out.println("Na " + roll + " stenne kostce padlo cislo: " + roll);
        // vytvoření objektů
        Die kostka = new Die(roll);
    }
    private static final Logger LOG = Logger.getLogger(DiceBag.class.getName());

}
