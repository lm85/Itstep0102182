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
    
    String nCannon;
    
    public Cruiser (String name, int speed, int size, String nCannon) {
    super(name, speed,size);
    this.nCannon = nCannon;
    }
    
    @Override
    public String toString() {
    return "Jmeno lodi: " + this.name + "\nRychlost lodi: " + this.speed + ";" + "\nVelikost lodi: " + this.size + ";" + "\nPocet del: " + this.nCannon + ";" + "\n";
    }
    
    
}
