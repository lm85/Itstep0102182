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

    public BattleShip(String name, int speed, int size, int hp, int nCannon, String type) {
        super(name, speed, size, hp, nCannon);
        this.type = type;
        this.nCannon = nCannon;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "Jmeno lodi: " + this.name + "\nRychlost lodi: " + this.speed + ";" + "\nVelikost lodi: " + this.size + ";" + "\n" + "Pocet zivotu: " + this.hp
                + ";" + "\n" + "Pocet kanonu: " + this.nCannon + ";" + "\n" + "Typ lodi: " + this.type + ";" + "\n";
    }

}
