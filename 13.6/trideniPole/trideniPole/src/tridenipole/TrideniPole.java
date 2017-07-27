/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tridenipole;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Milan Z
 */
public class TrideniPole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        try (BufferedReader br = new BufferedReader(new FileReader("myNumbers.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println("Chyba pri cteni ze souboru.");
        }
/*
        Arrays.sort(simpsonovi);
        for (String s : simpsonovi) {
            System.out.print(s + " ");
        }
*/
    }

}
