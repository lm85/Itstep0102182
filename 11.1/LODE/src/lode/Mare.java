/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lode;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Mare {
    
    protected ArrayList<Ship> mare = new ArrayList<>();

    public void addShip(Ship lod) {
        mare.add(lod);
    }

    public void removeShip(Ship lod) {
        mare.remove(lod);
    }

    public int getSize() {
        return mare.size();
    }

    public Ship getShip(int shipIndex) {
        return mare.get(shipIndex);
    }

    @Override
    public String toString() {
        String dataElements = "";
        dataElements = mare.stream().map((ship) -> ship.toString() + " " + "\n").reduce(dataElements, String::concat);
        return "Mare(" + dataElements + ")";

    }

    
    
    
}
