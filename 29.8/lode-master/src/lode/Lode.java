/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lode;

/**
 *
 * @author Student
 */
public class Lode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        //lode pluji po rece
        //trida pro lod, trida nebude staticka instance seznam vsech lodi
        Ship lodA;
        BattleShip lodB;
        Cruiser lodC;
        River reka = new River();

        lodA = new Ship("Kamikadze", 100, 50, 500, 10);
        lodB = new BattleShip("Nicitel",50, 100, 100, 5000);
        lodC = new Cruiser("Masakrator", 20, 200, 50, 5000);

      reka.addShip(lodA);
      reka.addShip(lodB);
      reka.addShip(lodC);

      System.out.println(reka);
      
    }

}
