/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;

/**
 * Třída reprezentuje lodi, které budou schopné z river přesouvat do dock na upgrade
   nebo z graveyard do dock na repair
 * @author DHA - > Vilda?
 */
public class RescueShip extends Ship {
    private boolean workMode = false;

    public RescueShip (String name, int hp, int nCannon, int team, boolean workMode) {   // objekt RescueShip
        super (name, hp, nCannon, team); // dědíme z ship
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
        return "Jmeno lodi: " + this.name + "Pocet zivotu: " + this.hp
                + ";" + "\n" + "Pocet kanonu: " + this.nCannon + ";" + "\n" + "WorkMode: " + this.workMode;
    }
}