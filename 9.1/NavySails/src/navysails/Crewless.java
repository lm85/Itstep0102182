/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navysails;

import java.util.ArrayList;

/**
 *
 * @author Milan ZLamal
 */
public class Crewless extends Mare{

    
    // dle rady netbeanu??? je potreba?
    private static Sails get(int shipIndex) {
        throw new UnsupportedOperationException("get shipIndex Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int size() {
        throw new UnsupportedOperationException("size Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void remove(Sails lod) {
        throw new UnsupportedOperationException("remove lod Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void add(Sails lod) {
        throw new UnsupportedOperationException("addlod Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Object stream() {
        throw new UnsupportedOperationException("Object stream Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // dle rady netbeanu??? je potreba?
    
    
    ArrayList<Sails> crewless = new ArrayList<>();
    
    
    // pridani lodi do Crewless - umre jde do Crewlessu
    @Override
     public void addSails(Sails lod) {
        Crewless.add(lod);
    }
    //odebrani lodi z Crewlessu > jde do docku
    @Override
    public void removeSails(Sails lod) {
        Crewless.remove(lod);
    }
    // vrati velikost Crewlessu
    @Override
    public int getSize() {
        return Crewless.size();
    }

    // vrati lod na danem indexu
    public Sails getSails(int shipIndex) {
        return Crewless.get(shipIndex);
    }

    @Override
    public String toString() {
        String dataElements = "";
        dataElements = crewless.stream().map((lod) -> lod.toString() + " " + "\n").reduce(dataElements, String::concat);
        return "River(" + dataElements + ")";
    }
    
    
    
}
