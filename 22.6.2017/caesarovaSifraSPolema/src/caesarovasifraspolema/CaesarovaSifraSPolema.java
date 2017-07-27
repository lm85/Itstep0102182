/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarovasifraspolema;

import java.util.Random;

/**
 *
 * @author Milan ZLamal
 */
public class CaesarovaSifraSPolema {

    public static char[] poleChar(char[] pole) {

        Random r = new Random();

        for (int j = 0; j < pole.length; j++) {
            char c = (char) (r.nextInt(26) + 'a');
            pole[j] = c;
        }
        System.out.println(pole);
        return pole;

    }

    public static char[] zmen(char[] pole) {
        poleChar(pole);
        char uschovna1 = ' ';
        uschovna1 = pole [0];
        char[] uschovna = new char[24];

        for (int j = 0; j < pole.length - 1; j++) {
            int pozice = j + 1;
            uschovna[j] = pole[j];
            //System.out.println(uschovna[j]);
            pole[j] = pole[pozice];
            System.out.println(pole[j] + " ");
        }

        return pole;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] pole = new char[24];
        zmen(pole);
        System.out.print(pole);
    }

}
