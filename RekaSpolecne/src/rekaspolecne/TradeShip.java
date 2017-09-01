/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;


 /**
 *
 * @author DHA
 */
public class TradeShip extends Ship {
    private boolean rescue;

    public TradeShip (String name, int speed, int size, int hp, int nCannon, boolean rescue) {
        super (name, speed, size, hp, nCannon);
        this.rescue = rescue;
    }

    /**
     * @return the rescue
     */
    public boolean getRescue() {
        return rescue;
    }

    /**
     * @param rescue the rescue to set
     */
    public void setRescue(boolean Rescue) {
        this.rescue = rescue;
    }
    
    @Override
    public String toString() {
        return ("Loď " + name);
    }
}
