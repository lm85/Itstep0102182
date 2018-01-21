/*
 *	       __          __                __            
 *	  ____/ /__ _   __/ /_  ____  ____  / /__ _________
 *	 / __  / _ \ | / / __ \/ __ \/ __ \/ //_// ___/_  /
 *	/ /_/ /  __/ |/ / /_/ / /_/ / /_/ / ,< _/ /__  / /_
 *	\__,_/\___/|___/_.___/\____/\____/_/|_(_)___/ /___/
 *                                                   
 *                                                           
 *      TUTORIÁLY  <>  DISKUZE  <>  KOMUNITA  <>  SOFTWARE
 * 
 *	Tento zdrojový kód je součástí tutoriálů na programátorské 
 *	sociální síti WWW.DEVBOOK.CZ	
 *	
 *	Kód můžete upravovat jak chcete, jen zmiňte odkaz 
 *	na www.devbook.cz :-) 
 */ 
	 
package tahovyboj;

/** Třída reprezentuje mága */
public class Mag extends Bojovnik {
    /** Mana */
    private int mana;
    /** Maximální mana, tedy hodnota, kdy je mana plná a lze ji použít */
    private int maxMana;
    /** Magický útok v HP */
    private int magickyUtok;

    /**
     * Vytvoří novou instanci mága
     * @param jmeno Jméno bojovníka
     * @param zivot Život v HP
     * @param utok Útok v HP
     * @param obrana Obrana v HP
     * @param kostka Instance hrací kostky
     * @param mana Mana
     * @param magickyUtok Magický útok v HP
     */
    public Mag(String jmeno, int zivot, int utok, int obrana, Kostka kostka, int mana, int magickyUtok)
    {
        super(jmeno, zivot, utok, obrana, kostka);
        this.mana = mana;
        this.maxMana = mana;
        this.magickyUtok = magickyUtok;
    }

    /**
     * Provede útok na soupeře
     * @param souper Soupeř bojovník
     */
    @Override
    public void utoc(Bojovnik souper)
    {
        // Mana není naplněna
        if (mana < maxMana)
        {
            mana += 10;
            if (mana > maxMana)
                mana = maxMana;
            super.utoc(souper);
        }
        else // Magický útok
        {
            int uder = magickyUtok + kostka.hod();
            nastavZpravu(String.format("%s použil magii za %s hp", jmeno, uder));
            souper.branSe(uder);
            mana = 0;
        }
    }

    /**
     * Vrátí grafickou reprezentaci many
     * @return Řetězec s grafickou reprezentací many
     */
    public String grafickaMana()
    {
        return grafickyUkazatel(mana, maxMana);
    }
}
