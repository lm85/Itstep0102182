/*
 * Sortni epizody serialu pocinaje od 1x01 do 2x22
 */
package sort;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Milan Zlamal
 */
public class Sort {

    public static void main(String[] args) {
        // sortni csv

        // nacti csv
        String[][] pole = new String[2] [22];
        String[] radek2;
        int i = 0;
        int j;
        
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\git_skola\\JavaProgramovani\\soubor2.csv"))) {
            String s;
            while ((s = br.readLine()) != null) {
                radek2 = s.split(";");
                for (j = 0; j < 10; j++) {
                    pole[i][j] = radek2[j];
                }
                i++;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        for (i = 0; i < pole.length - 1; i++) {
            j = i + 1;
            String tmp = pole[i][j];
            while (j > 0 && tmp.length() > pole[i][j-1].length()) {
                pole[i][j] = pole[i][j-1];
                j--;
        }
            pole[i][j] = tmp;
        }
        
    }

}
