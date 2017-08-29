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
public class BattleShip extends Ship {
    
    String type;
    
    public BattleShip(String name, int speed, int size, String type) {
        super(name, speed, size);
        this.type = type;
    }
    
  
    @Override
    public String toString() {
    return "Jmeno lodi: " + this.name + "\nRychlost lodi: " + this.speed + ";" + "\nVelikost lodi: " + this.size + ";" + "\nTyp lode: " + this.type + ";" + "\n";
    }
    
    
}
