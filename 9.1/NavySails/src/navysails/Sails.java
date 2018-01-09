/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navysails;

/**
 *
 * @author Milan Zlamal
 */
public class Sails {

    protected String name;
    protected int crews;
    protected int nHarpoon;
    protected int faction;

    public Sails(String name, int crews, int nHarpoon, int faction) {
        this.name = name;
        this.crews = crews;
        this.nHarpoon = nHarpoon;
        this.faction = faction;
    }

    @Override
    public String toString() {
        return "Jmeno lodi: " + this.name + "Posadka: " + this.crews
                + ";" + "\n" + "Pocet harpun/haku/strelcu: " + this.nHarpoon + ";" + "\n";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCrews(int crews) {
        this.crews = crews;
    }

    public void setnHarpoon(int nHarpoon) {
        this.nHarpoon = nHarpoon;
    }

    public void setFaction(int faction) {
        this.faction = faction;
    }

    public String getName() {
        return name;
    }

    public int getCrews() {
        return crews;
    }

    public int getnHarpoon() {
        return nHarpoon;
    }

    public int getFaction() {
        return faction;
    }

}
