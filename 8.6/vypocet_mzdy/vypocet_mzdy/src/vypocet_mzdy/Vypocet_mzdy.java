/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vypocet_mzdy;

import java.util.Scanner;

/**
 *
 * @author Milan Z
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
        float mujPlat = keyboard.nextFloat();
        
        float progresivniDan = 0;
               
        float dostanete = 0;
        //druhy napad
        
        if (mujPlat < 0 && !(mujPlat <= 1000)) {
            Scanner keyboard1 = new Scanner(System.in);
            System.out.println("Zadej vysi tve hrube mzdy");
            mujPlat = keyboard.nextFloat();
        }
        
        if (mujPlat <= 10000) {
            progresivniDan = mujPlat/10; 
        }
        
        if (mujPlat <= 20000 && mujPlat > 10000) {
           progresivniDan = (float) (1000 + (mujPlat * 0.2));
           dostanete = mujPlat - progresivniDan;
        }
        
        if (mujPlat <= 30000 && mujPlat > 20000) {
            progresivniDan = (float) (3000 + (mujPlat * 0.3));
            dostanete = mujPlat - progresivniDan;
        }
        if (mujPlat <= 40000 && mujPlat > 30000) {
            progresivniDan = (float) (6000 + (mujPlat * 0.4));
            dostanete = mujPlat - progresivniDan;
        }
        dostanete = mujPlat - progresivniDan;
        System.out.println("Progresivni dan je: " + progresivniDan + "\n" + "dostanete :" + dostanete);
    }
    
}
