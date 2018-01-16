/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lode;

/**
 *
 * @author ASUS
 */
public class LODE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
        Ship santa_maria = new Ship("Santa Maria");

        santa_maria.getHp();
        Cruiser kriznik = new Cruiser("Potemkin");
        kriznik.getHp();

        kriznik.dealDamage(santa_maria);
        System.out.println(santa_maria.getHp());

        Cruiser kriznik2 = new Cruiser("Potemkin II");
        kriznik2.getHp();
        kriznik.dealDamage(kriznik2);
        System.out.println(kriznik2.getHp());

        Diplomatico Diplomat = new Diplomatico("Usama bin Ladin");
        Rescueship Zachranar = new Rescueship("Zachranar");
        
        
        
    }

}
