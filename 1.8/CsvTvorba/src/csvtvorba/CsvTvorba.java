/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvtvorba;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Milan Zlamal
 */
public class CsvTvorba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] pole = new int[10][10];
        String radek = null;
        int i = 0, j;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("..\\..\\soubor1.csv"))) {
            for (i = 0; i < 10; i++) {
                for (j = 0; j < 10; j++) {
                    if (radek == null) {
                        radek = "0";
                    }
                    if (i == 0 || j == 0) {
                        i = i + 1;
                        j = j + 1;
                        pole[i][j] = i + j;
                    } else {
                        pole[i][j] = i * j;
                    }
                    radek += Integer.toString(pole[i][j]) + ";";
                    System.out.println(": :" + radek);
                }

                bw.write(radek);
                bw.newLine();
                radek = "";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String[] radek2;
        try (BufferedReader br = new BufferedReader(new FileReader("..\\..\\soubor1.csv"))) {
            String s;
            while ((s = br.readLine()) != null) {
                radek2 = s.split(";");
                for (j = 0; j < 10; j++) {
                    pole[i][j] = Integer.parseInt(radek2[j]);
                }
                i++;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
