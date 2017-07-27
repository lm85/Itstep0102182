/*
 * Zadani:
 * 1 vytvor si pole o velikosti 20                                              # nastavim na 21, protoze budu potrebovat implementovat nakonec prumer dle ktereho budu vyhledavat 
 * 2 do nej nacti random ciselna data                                           # prvnich naplnim 20 bunek 21 prazdna
 * 3 secti hodnoty a vypocitej prumer vsech hodnot                              # vypocitam ze vseho prumer a dosadim do i[21]
 * 4 zjisti nejblizsi cisla k prumeru v poli a kolik jich je                    # porovnam za pomoci if zda nejblizsi bunka je stejna jako ta vedle
 * and open the template in the editor.
 */
package prumerciselvpoli;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Milan Necra Zlamal
 */
public class PrumerCiselVPoli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] pole = new int[20][20];
        Random rnd = new Random();
        int prumer = 0;
        int nejblizsiTva = 0;
        int nejblizsiMa = 0;
        
        // rozdil mezi delta= hodnota pole[0] <= bunka pole porovnavajici || delta = hodnota pole[0] >= bunka pole porovnavajici
        // dvourozmerne pole
        // pole je 20 * 20 - tzn. 400 bunek prumer musim vydelit 400
        for (int i = 0; i < pole.length; i++) { //pruchod pres pole poli

            for (int j = 19; j > 0; j--) { //pruchod samotnym polem (radkem)
                pole[i][j] = rnd.nextInt(99) + 1;
                System.out.print(pole[i][j] + " "); //bez odradkovani
                prumer += pole[i][j];
            }
            System.out.println(""); //odradkovani
        }

        System.out.println(""); //odradkovani

        prumer /= 400;
        
        nejblizsiTva = Math.abs(prumer - pole[1][1]);
        
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < 19; j++) { //pruchod samotnym polem (radkem)
                // nejblizsi = pole[i][j] - prumer;
                
                if (nejblizsiTva < Math.abs(prumer - pole[i][j])) {
                    nejblizsiTva = Math.abs(prumer - pole[i][j]);     
                
                }
                    
        }
                
                
            }

    
        System.out.println("prumer je: " + prumer);
        System.out.println("nejblizsiTva je: " + nejblizsiTva);
        // System.out.println("DE pole");

       
    /* dvourozmerne
     for (int i = 0; i < pole.length - 1; i++) {
     pole[i][j] = rnd.nextInt(99) + 1;
     System.out.println("toto je rnd: " + pole[i][j]);
     prumer += pole[i][j];
            
     if (i == pole.length - 2) {
     prumer = prumer / pole.length - 1;
     System.out.println("prumer: " + prumer);
     Arrays.sort(pole);
                
     }
            
     if (j==0 && i == 20){
                
     }
            
     j--;
             
     }
     */
    }    
}


