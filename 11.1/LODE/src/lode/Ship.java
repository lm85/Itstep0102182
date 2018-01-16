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
public class Ship {

    protected String name;
    protected int hp = 1;
    protected int shipIndex;
    
    public Ship(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void decreaseHp(int damage) {
        this.hp -= damage;
    }

    public void increaseHp(Dock dock) {
        if (dock.getShip() == this) {
            this.hp++;
        }

    }

}
