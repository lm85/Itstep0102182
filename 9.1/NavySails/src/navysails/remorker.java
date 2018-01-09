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
public class remorker extends Sails{
    private boolean workMode = false;

    public remorker (String name, int crews, int nHarpoon, int faction, boolean workMode) {   // objekt remorker - pirati co sbiraji vraky,  a prodavaji zpet
        super (name, crews, nHarpoon, faction); // dědíme z ship
        this.workMode = workMode; // nový atribut
    }

// zjistění WorkMode T/F
    public boolean getWorkMode() {
        return this.workMode;
    }
// nastavení WorkMode T/F
    public void setWorkMode(boolean workMode) {
        this.workMode = workMode;
    }
    
        @Override
    public String toString() {
        return "Jmeno lodi: " + this.name + "Posadka: " + this.crews
                + ";" + "\n" + "Pocet harpun/haku/strelcu: " + this.nHarpoon + ";" + "\n";
    }
    
}
