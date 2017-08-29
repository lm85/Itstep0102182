/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lode;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class River {

    protected ArrayList<Ship> reka = new ArrayList<Ship>();

    public void addShip(Ship lod) {
        reka.add(lod);
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
