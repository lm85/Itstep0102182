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
public class Kocka extends Zvire {
    public boolean skace = true;
    public Kocka(int vaha, int vzacnost, boolean leta, boolean skace) {
        super(vaha, vzacnost, leta);
        this.skace=skace;
    }
    
    @Override
    public String vydejZvuk() {
       return "mnau";
    }    
    
}
