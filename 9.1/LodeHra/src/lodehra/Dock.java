/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lodehra;

/**
 * Tato třída importuje instanci typu Ship a může na ní provést repair (zvýšení
 * atributu hp) nebo upgrade (zvýšení atributu nCannon)
 * pozor! Getter i setter hází nahoru výjimky
 * @author DHA
 */
public class Dock {

    /* jediný atribut: objekt/instance třídy Ship */
    private Ship shipForDocking = null;

    public Dock() {
        this.shipForDocking = null; // jen založí instanci typu Dock - prázdnou (bez Shipu)
        /* chceš-li instanci Dock naplnit lodí, použij metodu setShipForDocking */
    }

    /* metoda na objektu tř. Ship zvedne atr. hp */
    public void repair() {
        if (shipForDocking.getHp() <= 2) { //max. opraví hp na hodnotu 3
            shipForDocking.setHp(shipForDocking.getHp() + 1);
            System.out.println(shipForDocking.toString() + " byla opravena za 1HP");
        } else {
            System.out.println(shipForDocking.toString() + " je na maximu HP");
        }
    }

    /* metoda na objektu tř. Ship zvedne atr. nCannon */
    public void cannUpgrade() {
        if (shipForDocking.getNcannon() <= 1) { //max. vylepší nCannon na hodnotu 2
            shipForDocking.setNcannon(shipForDocking.getNcannon() + 1);
            System.out.println(shipForDocking.toString()
                    + " byla vylepšena o 1 úroveň děl");
        } else {
            System.out.println(shipForDocking.toString() + " je na maximu děl");
        }
    }

    /* metoda zkontroluje a vrátí hodnotu true, pokud je instance typu Dock 
       prázdná (tj. null) */
    public boolean isEmpty () {
        return this.shipForDocking ==null;    
    }
    

    /**
     * getter 
     * pozor! tento getter vyjímá objekt Ship z doku - tj. dock je pak volný (null)
     * @return the shipForDocking
     * @throws java.lang.CloneNotSupportedException
     */
    
    public Ship getShipForDocking() throws CloneNotSupportedException {
        Ship pom = (Ship)shipForDocking.clone();
        this.shipForDocking = null;
        return pom;
    }
    
    /**
     * setter
     * @param shipForDocking the shipForDocking to set
     * @throws java.lang.Exception
     */
    public void setShipForDocking(Ship shipForDocking) throws Exception {
        if (this.isEmpty()) {
            this.shipForDocking = shipForDocking;
        } else { 
            throw new Exception (
            this.toString() + " je už plný");
        }
    }
}
