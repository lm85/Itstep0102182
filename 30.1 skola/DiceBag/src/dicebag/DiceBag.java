/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicebag;

import java.util.Scanner;

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
        
        // zde throw exception - pozdeji dodelam
        
        
        
              
        int roll = intScanner.nextInt();
        
        // vytvoření objektů
        Die kostka = new Die(roll);
        System.out.println("Na " + roll +" stenne kostce padlo cislo: " + roll);
        
        
    }

}
