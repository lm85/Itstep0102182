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
        River reka = new River();

        Ship lodA;
        BattleShip lodB;
        Cruiser lodC;
        Cruiser lodD;

        lodA = new Ship("Aljaska", 100, 50, 50, 5);
        lodB = new BattleShip("Nicitel", 50, 100, 100, 10, "valecna lod");
        lodC = new Cruiser("Masakrator", 20, 200, 150, 15);
        lodD = new Cruiser("Masakrator XXL", 10, 300, 200, 30);

        reka.addShip(lodA);
        reka.addShip(lodB);
        reka.addShip(lodC);
        reka.addShip(lodD);

        BattleSimulator sim = new BattleSimulator(reka);

        // System.out.println(reka);
        sim.battle();

        // System.out.println(reka.getSize());
    }

}
