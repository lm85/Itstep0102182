/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vypocet_mzdy;

import java.util.Scanner;

/**
 *
 * @author Necra
 */
public class Vypocet_mzdy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*vstup pres klavku
        vypocet ciste mzdy progresivnim zpusobem
        pres switch
        report printem
        */
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Zadej vysi tve hrube mzdy");
        int mujPlat = keyboard.nextInt();
        
        float progresivniDan = 0;
               
        float dostanete = 0;
        //druhy napad
        /*
        if (mujPlat < 0) {
            Scanner keyboard1 = new Scanner(System.in);
            System.out.println("Zadej vysi tve hrube mzdy");
            mujPlat = keyboard.nextInt();   
        }
        
        if (mujPlat <= 10000) {
            mujPlat = mujPlat - 1000; 
        }
        
        if (mujPlat <= 20000 && mujPlat > 10000) {
           progresivniDan = (float) (mujPlat - 1000 + mujPlat * 0.2);
        }
        
        if (mujPlat < 30000 && mujPlat > 20000) {
            progresivniDan = (float) (mujPlat - 3000 + mujPlat * 0.3);
        }
        if (mujPlat < 40000 && mujPlat > 30000) {
            progresivniDan = (float) (mujPlat - 6000 + mujPlat * 0.4);
        }
        dostanete = mujPlat - progresivniDan;
        System.out.println("Progresivni dan je: " + progresivniDan + "\n" + "dostanete :" + dostanete);
        */
        
        /*
        //prvni napad slozite
        int sandwich = mujPlat/10000;
        System.out.println(sandwich);
        switch(sandwich){
            case 0: System.out.println("Lesser than 10.000");
            // pro sichr    
            if (mujPlat < 0) {
            Scanner keyboard1 = new Scanner(System.in);
            System.out.println("Zadej vysi tve hrube mzdy");
            mujPlat = keyboard.nextInt();}; 
            progresivniDan = (float) (mujPlat * 0.1);
            
            break;
            case 1:
                progresivniDan = (float) (mujPlat * 0.1); break;
            case 2:
                progresivniDan = (float) (1000 + mujPlat * 0.2); break;
            case 3:
                progresivniDan = (float) (3000 + mujPlat * 0.3); break;
            case 4:
                progresivniDan = (float) (6000 + mujPlat * 0.4); break;
            //atd
        }
        dostanete = mujPlat - progresivniDan;
        System.out.println("Progresivni dan je: " + progresivniDan + "\n" + "dostanete :" + dostanete);                    
        */
    }
    
}
