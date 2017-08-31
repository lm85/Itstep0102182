/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;

/**
 *
 * @author Student
 */
public class Ship {

    protected int speed;
    protected int size;
    protected String name;
    protected int hp;
    protected int nCannon;
    protected boolean rescue;
    
    public Ship(String name, int speed, int size, int hp, int nCannon, int rescue) {
        this.size = size;
        this.speed = speed;
        this.name = name;
        this.hp = hp;
        this.nCannon = nCannon;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getSize() {
        return this.size;
    }

    public int getHp() {
        return this.hp;
    }

    public int getNcannon() {
        return this.nCannon;
    }

    public boolean getRescue() {
        return this.rescue;
    }
    
    public void setRescue(boolean rescue) {
        this.rescue = rescue;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setNcannon(int nCannon) {
        this.nCannon = nCannon;
    }

    @Override
    public String toString() {
        return "Jmeno lodi: " + this.name + "\nRychlost lodi: " + this.speed + ";" + "\nVelikost lodi: " + this.size + ";" + "\n" + "Pocet zivotu: " + this.hp
                + ";" + "\n" + "Pocet kanonu: " + this.nCannon + ";" + "\n";
    }

}
