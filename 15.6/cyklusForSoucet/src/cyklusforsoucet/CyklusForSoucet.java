/*
 * jednoduchy cyklus - soucet jednoho cisla
 */
package cyklusforsoucet;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CyklusForSoucet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // jednoduchy cyklus - soucet jednoho cisla
        System.out.println("soucet, nasobeni na Ntou, odmocnina (0/1/2)? ");
        Scanner scan3 = new Scanner(System.in);
        int jak = (int) scan3.nextInt();
        int vysledek = 1;

        System.out.println("Zadej cele cislo: ");
        Scanner scan = new Scanner(System.in);
        int co = (int) scan.nextInt();
        int kolik = co;

        System.out.println("Zadej cele cislo se kterym se budou hodnoty pocitat: ");
        Scanner scan2 = new Scanner(System.in);
        int pom = (int) scan2.nextInt();

        for (int i = 0; i < pom; i++) {
            // rozhoduje zda secita hodnotu s cislem kolikrat pricist, nebo nasobi
            switch (jak) {
                case 0:
                    kolik += kolik; //jiny zapis co = co + kolik
                    break;
                case 1:
                    co *= kolik;   //jiny zapis co = co * kolik
                    break;
                case 2:
                    if (i > 1) {
                        vysledek = (int) Math.pow(co, 1.0 / pom); // odmocnina diky 1/x - potrebuji aby jedno z toho bylo double
                        break;  
                    }
            }

            System.out.println("kolikrat se secetlo " + i + " vysledek je: " + co);
            System.out.println("kolik je xta odmocnina " + i + " vysledek je: " + vysledek);
        }

    }

}
