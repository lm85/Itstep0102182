/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakladyoop_rozsireni_trid;

/**
 *
 * @author Milan Z
 */
public class Zvire {

    private int vaha; // vaha zvirete
    private int vzacnost; // cim mene tim vzacnejsi

    public String vydejZvuk(){
        return "";
    }

    @Override
    public String toString() {
        return "Zvire{" + "vaha=" + vaha + ", vzacnost=" + vzacnost + '}';
    }
    
    
    
    public void vaha(int vaha) {

        // vypis s formatovanym stringem
        System.out.printf("%s %s, %d,", vaha);
    }

    public void vzacnost(int vzacnost) {

        // vypis s formatovanym stringem
        System.out.printf("%s %s, %d,", vzacnost);
    }


    public void setVzacnost(int vzacnost) {
        this.vzacnost = vzacnost;
    }

    public int getVaha() {
        return vaha;
    }

    public int getVzacnost() {
        return vzacnost;
    }

    public Zvire(int vaha, int vzacnost, boolean leta) {
        this.vaha = vaha;
        this.vzacnost = vzacnost;
    }

    // kolik kilo jidla do nej hodim
    public void nakrm(int kolik) {

    }

    public boolean leta() {
        return vaha <= 9;
    }

}
