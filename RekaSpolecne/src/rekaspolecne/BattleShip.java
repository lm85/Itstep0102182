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
public class BattleShip extends Ship {
    /* atributy jen z předka Ship */
    
    public BattleShip (String name, int hp, int nCannon, int team) {
        super(name, hp, nCannon, team);
        this.hp = 3;      // ať se zadá cokoli, hp bude defaultně nastaveno na 3
        this.nCannon = 2; // ať se zadá cokoli, nCannon bude defaultně nastaveno na 2
    }
    
    /* gettery, settery, toString - přebírá z předka Ship */
    
    /* nějaké extra metody speciálně pro BattleShip? */
        
}
