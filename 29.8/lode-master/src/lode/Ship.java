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

    public Ship(String name, int speed, int size) {
        this.size = size;
        this.speed = speed;
        this.name = name;
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

    @Override
    public String toString() {
        return "Jmeno lodi: " + this.name + "\nRychlost lodi: " + this.speed + ";" + "\nVelikost lodi: " + this.size + ";" + "\n";
    }

}
