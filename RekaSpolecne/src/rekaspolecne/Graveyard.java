/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;

import java.util.ArrayList;

/**
 *
 * @author Vilda
 */
public class Graveyard extends River {
    
    ArrayList<Ship> hrbitov = new ArrayList<Ship>();
    
    
    @Override
     public void addShip(Ship lod) {
        hrbitov.add(lod);
    }

    @Override
    public void removeShip(Ship lod) {
        hrbitov.remove(lod);
    }

    @Override
    public int getSize() {
        return hrbitov.size();
    }

    @Override
    public Ship getShip(int shipIndex) {
        return hrbitov.get(shipIndex);
    }

  

    @Override
    public String toString() {
        String dataElements = "";
        for (Ship ship : hrbitov) {
            dataElements += ship.toString() + " " + "\n";
        }
        return "River(" + dataElements + ")";

    }
    
}
