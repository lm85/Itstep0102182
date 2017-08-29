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
public class Ship {

    protected int speed;
    protected int size;
    protected String name;
    protected int attack;
    protected int defense;

    public Ship(String name, int speed, int size, int attack, int defense) {
        this.size = size;
        this.speed = speed;
        this.name = name;
        this.attack = attack;
        this.defense = defense;        
    }

    public int getAttack(){
    return this.attack;
    }
    
    public int getDefense(){
    return this.defense;
    }
    
    
    public int getSpeed() {
        return this.speed;
    }

    public int getSize() {
        return this.size;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public void setSize(int size) {
        this.size = size;
    }

    public void setAttack(int attack) {
    this.attack = attack;
    }
    
    public void setDefense(int defense) {
    this.defense = defense;
    }    
    
    @Override
    public String toString() {
        return "Jmeno lodi: " + this.name + "\nRychlost lodi: " + this.speed + ";" + "\nVelikost lodi: " + this.size + ";" + "\nUtok lodi: " + this.attack + ";" + "\nUtok lodi: " + this.defense + ";";
    }

}
