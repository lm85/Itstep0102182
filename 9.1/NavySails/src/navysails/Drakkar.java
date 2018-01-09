/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navysails;

/**
 *
 * @author Milan Zlamal
 */
public class Drakkar extends Sails{


        
    public Drakkar (String name, int crews, int nHarpoon, int faction) {
        super(name, crews, nHarpoon, faction);
        this.crews = 30;      // ať se zadá cokoli, hp bude defaultně nastaveno na 30
        this.nHarpoon = 20; // ať se zadá cokoli, nCannon bude defaultně nastaveno na 20
    }
    
    /* gettery, settery, toString - přebírá z předka Ship */
    
    /* nějaké extra metody speciálně pro Drakkara? */
}
