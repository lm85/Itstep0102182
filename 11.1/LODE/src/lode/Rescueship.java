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
public class Rescueship extends Ship {

    private Ship ship;
    private Dock dock;

    public Rescueship(String name) {
        super("Rescueship" + name);
    }

    public void loadShip(Ship ship, Dock dock) {
        if (ship.hp > 0) {
            this.ship = ship;
        }

    }

    public void takeShipToDock(Dock dock) {
        dock.receiveShip(this.ship);
        this.ship=null;
        
        /** dame do docku + pridat parametr Dock dock
        if (ship != null) {
            if (ship.hp <= 0) {
                dock.receiveShip(this);
            }
        }
        */
        

    }

    public void takeShipFromDock(Dock dock){
    dock.releaseShip(this.ship);
    
    }
}