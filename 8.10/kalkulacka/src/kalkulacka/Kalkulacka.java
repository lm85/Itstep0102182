/*
 Kalkulacka jednoducha - s parsovanim a try catchem
 */
package kalkulacka;

import java.util.Scanner;

/**
 *
 * @author Milan Z
 */
public class Kalkulacka {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        // zapnuti cteni hodnot z klavesnice
        Scanner zadani = new Scanner(System.in);

        // vypise na obrazovku okec co zadat
        System.out.println("Zadejte prvni cislo: ");
        // trida nacteni stringu vstup1 z definovaneho vstupu z klavesnice
        String vstup1 = zadani.nextLine();
        
        // vypise na obrazovku okec co zadat        
        System.out.println("Zadejte druhe cislo: ");
        // trida nacteni stringu vstup2 z definovaneho vstupu z klavesnice
        String vstup2 = zadani.nextLine();
        
        
        /*
        try/catch osetruje ze jsme zadali ciselnou hodnotu
            pokud zadam string, vypise mi exceptionu - vyjimku
            vypocitam postupne: 
            nasobeni
            deleni
            scitani
            odcitani
        */
        try {
            int a = Integer.parseInt(vstup1);
            int b = Integer.parseInt(vstup2);

            int nasobeni, deleni, soucet, odcitani;

            nasobeni = a * b;
            System.out.println("Vysledne nasobeni je: " + nasobeni);
            deleni = a / b;
            System.out.println("Vysledny podil je: " + deleni);
            soucet = a + b;
            System.out.println("Vysledny soucet je: " + soucet);
            odcitani = a - b;
            System.out.println("Vysledny podil je: " + odcitani);
        }   //  NumberFormatException se nalezne z parseInt klikem ctrl+click na nej 
        catch (NumberFormatException e) {
            System.out.println("Tohle nebyla cisla!");
        }
    }

}
