/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navysails;

import java.util.Random;

/**
 *
 * @author Milan ZLamal
 */
public class Battlefield {
    
    Mare mare;
    Random rand = new Random();

    int shipIndex;
    Sails shipA;
    Sails shipB;
    int hp;
    int x = 0;

    int tempIndex;
    private int crews;

    public Battlefield(Mare mare) {
        this.mare = mare;

    }

    public int getShipIndex() {
        mare.getSize();
        return rand.nextInt(mare.getSize());
        
    }

    public void battle() {

        while ((mare.getSize() > 1)) { //

            
            
            shipA = mare.getShip(this.getShipIndex());
            
            shipB = mare.getShip(this.getShipIndex());
            if (shipA.equals(shipB)) {
                battle();
            }

            crews = shipB.getCrews()- (shipA.getnHarpoon()* 5);
            System.out.println("Utok lodi A: " + shipA.getnHarpoon()* 5);
            System.out.println("Zivoty lodi B: " + shipB.getCrews());
            shipB.setCrews(hp);
            System.out.println("Zivoty lodi B po utoku: " + shipB.getCrews());
            
            if (shipB.getCrews() < 1) {
            mare.removeSails(shipB);
            }
            
            
            x++;

        }

    }

    
    
    
}
