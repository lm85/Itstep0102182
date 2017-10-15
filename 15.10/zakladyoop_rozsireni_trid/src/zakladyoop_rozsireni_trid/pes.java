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
public class pes extends Zvire{
    public boolean jeCerny = true;

    public pes(int vaha, int vzacnost, boolean leta, boolean jeCerny) {
        super(vaha, vzacnost, leta);
        this.jeCerny=jeCerny;
    }
    
    public void setJeCerny(boolean jeCerny){
        this.jeCerny = true;
    }

    @Override
    public String vydejZvuk() {
       return "haf";
    }
    
}
