/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dama;

import java.util.Random;

/**
 *
 * @author Milan Zlamal
 */
public class Dama {

    public static int[][] poziceDamy(int[][] pole) {
        int poleA[][] = new int[pole.length][pole[0].length];
        Random r = new Random();
        int b = r.nextInt(64);
        System.out.println(b);
        int c = b / 8;
        b = b % 8;
        poleA[b][c] = 1;

        
        if (b == 1 && c == 1 || b == 1 && c == 3 || b == 1 && c == 5 || b == 1 && c == 7) {
            c += b;
        }

        if (b == 2 && c == 2 || b == 2 && c == 4 || b == 2 && c == 6 || b == 2 && c == 8) {
            c -= c;
        } 

        if (b == 7 && c == 1 || b == 7 && c == 3 || b == 7 && c == 5 || b == 7 && c == 7) {
            c += b;
        } 

        if (b == 8 && c == 2 || b == 8 && c == 4 || b == 8 && c == 6 || b == 8 && c == 8) {
            c -= c;
        } 
        b =b+1; c=b+1;
        System.out.println("Dama je: \n " + " x" + c + " y" + b);

        poleA = pole;
        return pole;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] pole = {
            {0, 1, 0, 1, 0, 1, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 1, 0, 1, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 0}
        };
        poziceDamy(pole);
    }

}
