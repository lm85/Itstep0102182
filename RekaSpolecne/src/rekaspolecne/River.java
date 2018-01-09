/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;

import java.util.ArrayList;


/**
 *
 * @author Milan Zlamal
 */
public class River {

  
  
    protected ArrayList<Ship> reka = new ArrayList<>();

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
        dataElements = reka.stream().map((ship) -> ship.toString() + " " + "\n").reduce(dataElements, String::concat);
        return "River(" + dataElements + ")";

    }

}
