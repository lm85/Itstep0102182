/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ceskavrazdirna;

/**
 *
 * @author Milan Zlamal
 */
public class CeskaVrazdirna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // urci kdo prezije, urci kdo je mrtvy
        
        final int n = 20; // staticka promenna final
        final int krok = 5; // staticka promenna final
        final int z = 4; // staticka promenna final
        int i = 0;

        boolean[] vojaci = new boolean[n];
        int pocet_zivych = n;
        int odpocet = krok;
        
        while (pocet_zivych > 1) {
            
            if (!vojaci[i]) {
                odpocet++;
            }
            if (!vojaci[i]) {
                vojaci[i] = true;
                odpocet = 0;
                pocet_zivych--;
            }

            i++;

            if (i == n) // kdyz i==20
            {
                i = 0;
            }
            // System.out.println("pocet zivych: "+ pocet_zivych); kolik mam tech zivych?
        }
        
        
    }
    
}
