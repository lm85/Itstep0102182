/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lode;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Student
 */
public class River {

  
  
    protected ArrayList<Ship> reka = new ArrayList<Ship>();

    public void addShip(Ship lod) {
        reka.add(lod);
    }

    public void removeShip(Ship lod) {
        reka.remove(lod);
    }

    public int getSize() {
        return reka.size();
    }

    public Ship getShip(int shipIndex) {
        return reka.get(shipIndex);
    }

  

    @Override
    public String toString() {
        String dataElements = "";
        for (Ship ship : reka) {
            dataElements += ship.toString() + " " + "\n";
        }
        return "River(" + dataElements + ")";

    }

}
