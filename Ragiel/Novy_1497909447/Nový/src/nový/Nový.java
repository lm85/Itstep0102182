/*
 * Napište program, který vynásobí libovolně velké matice naplněné náhodně vygenerovnými čísly. Rozměry zadá uživatel.
 */
package nový;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pavel Holub
 */
public class Nový {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int columA=0;
    int columB=0;
    int rowA=0;
    int rowB=0;
    int sum=0;
    
    Random rnd = new Random();
    Scanner in = new Scanner(System.in);
      
    System.out.println("Zadejte počet sloupců a řádků.");
      columA = in.nextInt();
      rowA= in.nextInt();
 
      int [][] matrixA=new int [columA][rowA];
      for (int j = 0; j < matrixA[0].length; j++)
      {     
        for (int i = 0; i < matrixA.length; i++)
        { 
            matrixA[i][j] = rnd.nextInt(1)+1;
        }
      }
    System.out.println("Zadejte počet sloupců a řádků druhé matice.");
      columB = in.nextInt();
      rowB = in.nextInt();
 
      if ( rowA != columB )
         System.out.println("Matice nelze spolu vynásobit");
      else
      {
         int [][] matrixB = new int [columB][rowB];
         int [][] multiply = new int [columA][rowB];
         for (int j = 0; j < matrixB[0].length; j++)
        {     
            for (int i = 0; i < matrixB.length; i++)
            { 
                matrixB[i][j] = rnd.nextInt(1)+1;
            }
        }
        for ( int i = 0 ; i < columA ; i++ )
         {
            for ( int j = 0 ; j < rowB ; j++ )
            {   
               for ( int l = 0 ; l < columB ; l++ )
               {
                  sum = sum + matrixA[i][l]* matrixB[l][j];
               }
 
               multiply[i][j] = sum;
               sum = 0;
            }
         }
 
         System.out.println("Výsledek násobení matice: ");
 
         for ( int i = 0 ; i < columA ; i++ )
         {
            for ( int j = 0 ; j < rowB ; j++ ){
               System.out.print(multiply[i][j]+"|");
            System.out.print("\n");
            }
         }
         
      }
    
    
    
    
    }
    
}
