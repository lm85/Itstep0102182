/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lode;

import java.util.Random;

/**
 *
 * @author Student
 */
public class BattleSimulator {

    River reka;
    Random rand = new Random();

    int shipIndex;
    Ship shipA;
    Ship shipB;
    int hp;
    int x = 0;

    int tempIndex;

    public BattleSimulator(River reka) {
        this.reka = reka;

    }

    public int getShipIndex() {
        reka.getSize();
        return rand.nextInt(reka.getSize());
        
    }

    public void battle() {

        while ((reka.getSize() > 1)) { //

            
            
            shipA = reka.getShip(this.getShipIndex());
            
            shipB = reka.getShip(this.getShipIndex());
            if (shipA.equals(shipB)) {
                battle();
            }

            hp = shipB.getHp() - (shipA.getNcannon() * 5);
            System.out.println("Utok lodi A: " + shipA.getNcannon() * 5);
            System.out.println("Zivoty lodi B: " + shipB.getHp());
            shipB.setHp(hp);
            System.out.println("Zivoty lodi B po utoku: " + shipB.getHp());
            
            if (shipB.getHp() < 1) {
            reka.removeShip(shipB);
            }
            
            
            x++;

        }

    }

}
