/*
 * Trideni pole s nacitanim
 * s hazenim exceptions
 * nacitani dat z txt do pole a ukladani do csv
 */
package tridenipole;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Milan Z
 */
public class TrideniPole {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        String[] pole = new String[20];
        int i = 0;
        String radek = null;

        try (BufferedReader br = new BufferedReader(new FileReader("myNumbers.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                pole[i] = s;
                i++;
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("..\\..\\soubor1.csv"))) {
            int[][] pole1 = new int[10][10];
            for (int a = 0; a < 10; a++) {
                for (int b = 0; b < 10; b++) {
                    if (radek == null) {
                        radek = "0";
                    }
                    if (a == 0 || b == 0) {
                        a = a + 1;
                        b = b + 1;
                        pole1[a][b] = a + b;
                    } else {
                        pole1[a][b] = a * b;
                    }
                    radek += Integer.toString(pole1[a][b]) + ";";
                    System.out.println(": :" + radek);
                }

                bw.write(radek);
                bw.newLine();
                radek = "";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
