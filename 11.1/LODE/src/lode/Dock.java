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
public class Dock {

    private Ship ship;

    public void receiveShip(Ship ship) {
        this.ship = ship;
    }

    public void releaseShip(Ship ship) {
        this.ship = null;
    }

    public void repairShip(Ship ship) {
        if (ship != null) {
            ship.increaseHp(this);

        }

    }

    public Ship getShip() {
        return this.ship;
    }


}
