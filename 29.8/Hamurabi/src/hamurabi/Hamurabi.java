/*
 * hamurabi
 * zasadim 1 rostlinu
 * v pristim cyklu mam ji + plod
 * v dalsim cyklu mam ji + dalsi + jejich plody
 * najdi ideal kdy bude 200 lidi nasycenych
 * nakup pozemku a prodej? nakup obili a prodej
 * obtiznosti:
 * 200 15
 * 50000 1
 * 150000 250
 * ??? zkusim humanCount == 2* humanCount
 */
package hamurabi;

import java.util.Scanner;

/**
 *
 * @author Milan Zlamal
 */
public class Hamurabi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int HumanCount;
        int plantCount;
        int plantHarvest;
        int fields;
        
        System.out.println("Vyberte obtiznost [1..3]");
        Scanner difficultyInput = new Scanner(System.in);
        int difficulty = difficultyInput.nextInt();

        switch (difficulty) {
            case 1:
                HumanCount = 200;
                plantCount = 15;
                fields = 5;
                plantHarvest = 0;
                break;
            case 2:
                HumanCount = 5000;
                plantCount = 15;
                fields = 5;
                plantHarvest = 20;
                break;
            case 3:
                HumanCount = 150000;
                plantCount = 250;
                plantHarvest = 200;
                fields = 5;
                break;
            }
        System.out.println("You choosed: " + difficulty);
        }
        
        
    
    }
