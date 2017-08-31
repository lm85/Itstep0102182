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
    private int nosnost;

    public TradeShip (String jmeno, int odolnost, int nosnost) {
        super (jmeno, odolnost);
        this.nosnost = nosnost;
    }

    /**
     * @return the nosnost
     */
    public int getNosnost() {
        return nosnost;
    }

    /**
     * @param nosnost the nosnost to set
     */
    public void setNosnost(int nosnost) {
        this.nosnost = nosnost;
    }
   
}
