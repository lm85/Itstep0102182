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

    /*
    UPRAVENO 1.9. SHIP ma pouze atributy ktere maji vschny ostatni lode, na ostatni pouzijte dedicnost!
     */
    protected String name;
    protected int hp;
    protected int nCannon;
    protected int team;

    public Ship(String name, int hp, int nCannon, int team) {
        this.name = name;
        this.hp = hp;
        this.nCannon = nCannon;
        this.team = team;
    }
// vrati HP
    public int getHp() {
        return this.hp;
    }
// vrati pocet kanonu
    public int getNcannon() {
        return this.nCannon;
    }
// nastavi HP
    public void setHp(int hp) {
        this.hp = hp;
    }
// nastavi kanony
    public void setNcannon(int nCannon) {
        this.nCannon = nCannon;
    }
// nastavi team
    public void setTeam(int team) {
        this.team = team;
    }
// vrati team
    public int getTeam() {
        return this.team;
    }

    @Override
    public String toString() {
        return "Jmeno lodi: " + this.name + "Pocet zivotu: " + this.hp
                + ";" + "\n" + "Pocet kanonu: " + this.nCannon + ";" + "\n";
    }

}
