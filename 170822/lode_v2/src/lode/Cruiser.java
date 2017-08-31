/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lode;

/**
 *
 * @author Student
 */
public class Cruiser extends Ship {

    public Cruiser(String name, int speed, int size, int hp, int nCannon) {
        super(name, speed, size, hp, nCannon);
        this.nCannon = nCannon;
    }

    
    
    
    @Override
    public String toString() {
        return "Jmeno lodi: " + this.name + "\nRychlost lodi: " + this.speed + ";" + "\nVelikost lodi: " + this.size + ";" + "\n" + "Pocet zivotu: " + this.hp
                + ";" + "\n" + "Pocet kanonu: " + this.nCannon + ";" + "\n";
    }

}
