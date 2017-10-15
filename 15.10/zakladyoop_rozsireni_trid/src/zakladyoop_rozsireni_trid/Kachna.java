/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zakladyoop_rozsireni_trid;

/*
 *
 * @author Milan Z
 */
public class Kachna extends Zvire {
    public boolean vodni = true;

    public Kachna(int vaha, int vzacnost, boolean leta, boolean vodni) {
        super(vaha, vzacnost, leta);
        this.vodni=vodni;
    }
       
    
    public void setVodni(boolean vodni){
        this.vodni = true;
    }

    @Override
    public String vydejZvuk() {
       return "kvaak";
    }
    
}
