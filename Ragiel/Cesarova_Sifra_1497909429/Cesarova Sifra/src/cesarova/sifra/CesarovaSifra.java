/*
 * 
 */
package cesarova.sifra;

import java.util.Scanner;

/**
 *
 * @author Pavel Holub
 */
public class CesarovaSifra {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String text = "abcdefghijklmnopqrstuvwxyz";
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
            'w', 'x', 'y', 'z',' '};
        int sifra=1;
        
        int volba =0;
        
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Zadejte text který chcete zpracovat");
        text = in.nextLine();
        text = text.replaceAll("[^A-Za-z ]","");
        text = text.toLowerCase();
        char[] code=new char [text.length()];
        System.out.println("Zadejte kterou volbu chcete zvolit \n 0-šifrovaní \n 1-dešifrování");
        volba = in.nextInt();
        System.out.println("Zadejte posun šifry");
        sifra = in.nextInt();
        if (sifra>26){sifra=sifra%26;}
        if (sifra==26){System.out.println("zadali jste takový posun který je 0, byla přidána šifra 1");sifra=1;}
        switch(volba){
        
            case 0:    
        for ( int i = 0 ; i < text.length() ; i++ )//sifrovani
         {
            for ( int j = 0 ; j < letters.length ; j++ )
            {
                if (text.charAt(i)==letters[j]){if (j==26){code[i]=letters[j];}
                else if (j+sifra>letters.length-2){code[i]=letters[(j+sifra)-letters.length+1];}
                else{
                    
                code[i]=letters[j+sifra];
                }
                }
            }      
         }break;
            case 1:
        for ( int i = 0 ; i < text.length() ; i++ )//desifrovani
         {
            for ( int j = 0 ; j < letters.length ; j++ )
            {
                if (text.charAt(i)==letters[j]){if (j==26){code[i]=letters[j];}
                else if (j-sifra<0){code[i]=letters[(j-sifra)+(letters.length-1)];}
                else{
                code[i]=letters[j-sifra];
                }
                }
            }      
         }
        break;}
        for ( int j = 0 ; j < code.length ; j++ ){ //vypis
               System.out.print(code[j]);            
            }
        
    }
    
}
