/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navysails;

/**
 *
 * @author Milan ZLamal
 */
public class Galera extends Sails{
    
        public Galera (String name, int crews, int nHarpoon, int faction) {
        super(name, crews, nHarpoon, faction);
        this.crews = 150;        // ať se zadá cokoli, hp bude defaultně nastaveno na 150
        this.nHarpoon = 5;     // ať se zadá cokoli, nCannon bude defaultně nastaveno na 5
    }
    
}
