/*
 * 


 */
package parkoviste;

import jdk.internal.dynalink.DefaultBootstrapper;

/**
 *
 * @author Milan Zlamal
 */
public class Parkoviste {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        byte parkoviste=0x10;
        System.out.println(Integer.toBinaryString (parkoviste));
        byte a= 0; 
        
        
        parkoviste = setOne(a, parkoviste);
        System.out.println(Integer.toBinaryString (parkoviste));
        
        parkoviste = setZero(a, parkoviste);
        System.out.println(Integer.toBinaryString (parkoviste));
    }
    
    public static byte setOne (byte a, byte parkoviste){
        return (byte)(parkoviste |= a);
    
    }
        
    public static byte setZero (byte a, byte parkoviste) {
        return (byte) (a & parkoviste);
    }
    

}
