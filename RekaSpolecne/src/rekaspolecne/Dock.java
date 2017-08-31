/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;

/**
 * Třída reprezentuje objekty s atributem typu Ship - tj. jeden dock = 1 ship;
 * bude možné zde buď provést repair nebo upgrade
 * @author DHA
 */
public class Dock {
    Ship shipForDocking;
    // River river;   -zbytečné?
    
     
    public Dock () {
        this.shipForDocking = shipForDocking;
    }
    
    /* metoda načte instanci typu Ship a provede zvýšení shipForRepair.hp o 1 */ 
    public Ship repair (Ship shipForDocking) {
       // plus ověřit podmínkou, jestli hp=maxHp         
    }
    /* metoda načte instanci typu Ship a provede zvýšení shipForRepair.nCannon o 1 */ 
    public Ship cannonUpgrade (Ship shipForDocking) {
                
    }
    /* přidat G&S, u setteru shipForDocking ošetřit výjimkou, pokud někdo chce vložit
    další instanci typu Ship, když už ve shipForDocking už nějaká je */
    
    /* přidat metodu, která vrátí boolean, jestli je dock volný */
    
}
