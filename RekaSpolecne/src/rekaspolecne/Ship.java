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

    protected String name;
    protected int hp;
    protected int nCannon;

    public Ship(String name, int hp, int nCannon) {
        this.name = name;
        this.hp = hp;
        this.nCannon = nCannon;
    }

    public int getHp() {
        return this.hp;
    }

    public int getNcannon() {
        return this.nCannon;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setNcannon(int nCannon) {
        this.nCannon = nCannon;
    }

    @Override
    public String toString() {
        return "Jmeno lodi: " + this.name + "Pocet zivotu: " + this.hp
                + ";" + "\n" + "Pocet kanonu: " + this.nCannon + ";" + "\n";
    }

}
