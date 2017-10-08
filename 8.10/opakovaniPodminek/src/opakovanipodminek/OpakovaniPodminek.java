/*
 * Ozvena: cyklem 3* vetu
 * odpocitejte od10 do 1
 * vykreslete sachovnici za pomoci _ a +
 */
package opakovanipodminek;

/**
 *
 * @author ASUS
 */
public class OpakovaniPodminek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // nejdrive 3* vetu
        for (int i = 11; i > 0; i--) {
            int cislo = 10;
            cislo = cislo - i; // nebo cislo-- nebo cislo -= 
        }
        
        for (int i =1; i < 4; i++) {
            String veta = "Toto je moje veta";
            System.out.println(veta + " " + "po " + i + ".");
        }

        for (int a = 1; a < 9; a++) {
            
            
            for (int b = 1; b < 9; b++) {
            
               
                if ((a+b)%2 == 1) {
                System.out.print("+");  // bez odradkovani
                
            }else {System.out.print("_");}  // bez odradkovani
            }
            System.out.println();  // odradkovani jen takto
        }
        
        
        
    }

}
