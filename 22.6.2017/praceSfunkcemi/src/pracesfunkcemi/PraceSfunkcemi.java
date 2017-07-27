/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pracesfunkcemi;

import java.util.Random;

/**
 *
 * @author ASUS
 */
public class PraceSfunkcemi {
    /**
     * @param args the command line arguments
     */
    
    public static int[][] soucet(int[][] poleA, int[][] poleB, int i) {
        int[][] soucet = new int[10][10];         
        
        
        for (int j = 9; j > 0; j--) { //pruchod samotnym polem (radkem)
                Random rnd = new Random();
                //System.out.print(poleA[i][j] + " "); //bez odradkovani
                //System.out.print(poleB[i][j] + " "); //bez odradkovani
                soucet[i][j] = poleA[i][j] + poleB[i][j];
                System.out.print(" " + soucet[i][j]);

            }
        return soucet;
        
    }
    
    public static void main(String[] args) {
        // vem 2d pole, napln a secti hodnoty
        int[][] poleA = new int[10][10];
        int[][] poleB = new int[10][10];
        Random rnd = new Random();
        int tady=0;
        
        for (int i = 0; i < poleA.length; i++) { //pruchod pres pole poli
                
                poleA[i][tady] = rnd.nextInt(99) + 1;
                poleB[i][tady] = rnd.nextInt(99) + 1;
                soucet(poleA, poleB, i);

            System.out.println(""); //odradkovani

        }
        
        System.out.println(""); //odradkovani

        // System.out.println("DE pole");

    }
    
}
