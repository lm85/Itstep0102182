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
/**
 * Vytvorit flotilu co ma urcite lode array list zadama pocet na zacatku a ono
 * se to rozhazi
 */
public class Flotila {
    protected int shipindex;
    
    protected ArrayList<Ship> mare = new ArrayList<>();        //diamantovy styl - nemusi byt Ship uveden

    public Flotila(Ship ship) {
          for (int i = 1; i <= 10; i++)
        {
                mare.add(ship);
        }
    }



    public void addShip(Ship ship) {    //lod vypluje na more
        mare.add(ship);
    }

    public int getSize() {
        return mare.size();
    }

    public Ship getShip(int shipIndex) {
        return mare.get(shipIndex);
    }
    
    

}
