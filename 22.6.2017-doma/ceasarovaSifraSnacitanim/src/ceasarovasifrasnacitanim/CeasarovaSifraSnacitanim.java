/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ceasarovasifrasnacitanim;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Milan Z.
 */
public class CeasarovaSifraSnacitanim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] pole = new int [10][10];
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
            'w', 'x', 'y', 'z',' '};
        String[] text1= new String[100];
        String text;
        try (BufferedReader br = new BufferedReader(new FileReader("..\\..\\input1.txt"))) {
            String s;
            int i=0; 
            int j=0;
            while ((s = br.readLine()) != null) {
                // dodelat
                text1[i] = s + s.split(";");
                for (j = 0; j < 10; j++) {
                    pole[i][j] = Integer.parseInt(text1[j]);
                }
                i++;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        //puvodni forma -  
            //String text = "abcdefghijklmnopqrstuvwxyz";
            //char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
            //'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
            //'w', 'x', 'y', 'z',' '};
            int sifra=1;
            int volba =0;
        
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Zadejte text který chcete zpracovat");
        text = in.next();
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
