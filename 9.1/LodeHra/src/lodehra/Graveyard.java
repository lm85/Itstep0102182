/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lodehra;

import java.util.ArrayList;

/**
 *
 * @author Vilda
 */
public class Graveyard extends River {
    
    ArrayList<Ship> graveyard = new ArrayList<>();
    
    
    // pridani lodi do graveyardu - umre jde do graveyardu
    @Override
     public void addShip(Ship lod) {
        graveyard.add(lod);
    }
    //odebrani lodi z graveyardu > jde do docku
    @Override
    public void removeShip(Ship lod) {
        graveyard.remove(lod);
    }
    // vrati velikost graveyardu
    @Override
    public int getSize() {
        return graveyard.size();
    }

    // vrati lod na danem indexu
    @Override
    public Ship getShip(int shipIndex) {
        return graveyard.get(shipIndex);
    }

  

    @Override
    public String toString() {
        String dataElements = "";
        dataElements = graveyard.stream().map((ship) -> ship.toString() + " " + "\n").reduce(dataElements, String::concat);
        return "River(" + dataElements + ")";

    }
    
}