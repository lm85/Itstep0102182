/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navysails;

import java.util.ArrayList;

/**
 *
 * @author Milan Zlamal
 */
public class Mare {
        protected ArrayList<Sails> mare = new ArrayList<>();        //diamantovy styl - nemusi byt sails uveden
    
        public void addSails(Sails lod) {    //lod vypluje na more
        mare.add(lod);
    }

    public void removeSails(Sails lod) {    //lod vpluje do pristavu
        mare.add(lod);
    } 
    
    public int getSize() {
    return mare.size();
    }

    public Sails getShip(int shipIndex) {
        return mare.get(shipIndex);
    }
 

    @Override           // ma tam byt override ???
    public String toString() {
        String dataElements = "";
        dataElements = mare.stream().map((lod) -> lod.toString() + " " + "\n").reduce(dataElements, String::concat);
        return "River(" + dataElements + ")";

    }
        
}
