/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lode;

/**
 *
 * @author ASUS
 */
public class Cruiser extends Ship{
    protected int damage=1;
            
    /** konstruktor Cruisera 
     * @param String name - gives value to name from Ship
     * @param int hp - gives value to name from Ship
     */
    public Cruiser(String name) {
        super(name);
        super.hp=2;
    }

    public void dealDamage(Ship ship) {
        if (ship==this) return;
        ship.decreaseHp(this.damage);
        
        
    }

    

    
}
