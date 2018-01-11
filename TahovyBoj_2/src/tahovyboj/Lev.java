/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tahovyboj;

/**
 *
 * @author Milan Zlamal
 */

/** Třída reprezentuje Lva VYMYSLET CO MA DELAT */
public class Lev extends Bojovnik{
    
    
    
    public Lev(String jmeno, int zivot, int utok, int obrana, Kostka kostka){
    super(jmeno, zivot, utok, obrana, kostka);
    
    }

     /**
     * Provede útok na soupeře
     * @param souper Soupeř bojovník
     */
    @Override
    public void utoc(Bojovnik souper)
    {
        /*
        if (Bojovnik ) {
            
        }
        super.utoc(souper);
        
        else // Magický útok
        {
            int uder = magickyUtok + kostka.hod();
            nastavZpravu(String.format("%s použil magii za %s hp", jmeno, uder));
            souper.branSe(uder);
            mana = 0;
        }
        */
    }
    
    
    
    
}
