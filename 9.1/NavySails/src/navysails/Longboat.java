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
public class Longboat extends Sails{
        public Longboat (String name, int crews, int nHarpoon, int faction) {
        super(name, crews, nHarpoon, faction);
        this.crews = 60;        // ať se zadá cokoli, hp bude defaultně nastaveno na 60
        this.nHarpoon = 10;     // ať se zadá cokoli, nCannon bude defaultně nastaveno na 10
    }
    
    /* gettery, settery, toString - přebírá z předka Ship */
    
    /* nějaké extra metody speciálně pro Longboat? */
}
