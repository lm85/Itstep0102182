/*
 * Skřítek je jednou hodný a pomáhající, podruhé zase záškodníkem.
 * Nechali jste mu kaši?
 */
package tahovyboj;

/**
 *
 * @author Milan ZLamal
 */
public class Skritek {

    /**
     * Jméno bojovníka
     */
    protected String jmeno;
    /**
     * Život v HP
     */
    protected int zivot;
    /**
     * Maximální zdraví
     */
    protected int maxZivot;
    /**
     * Útok/leceni v HP
     */
    protected int utok;
    /**
     * Obrana v HP
     */
    protected int obrana;
    /**
     * Instance hrací kostky
     */
    protected Kostka kostka;
    /**
     * Poslední zpráva
     */
    protected String zprava;
    /**
     * Náhodný faktor pro rozhodování skřítka
     */
    double rozhodnuti = Math.random();


    /**
     * Vytvoří novou instanci bojovníka
     *
     * @param jmeno Jméno bojovníka
     * @param zivot Život v HP
     * @param utok Útok/léčení v HP
     * @param obrana Obrana v HP
     * @param kostka Instance hrací kostky
     */
    public Skritek(String jmeno, int zivot, int utok, int obrana, Kostka kostka) {
        this.jmeno = jmeno;
        this.zivot = zivot;
        this.maxZivot = zivot;
        this.utok = utok;
        this.obrana = obrana;
        this.kostka = kostka;
    }

    /**
     * Skritek - Provede útok/léčéní na soupeře
     *
     * @param Bojovnik souper - Soupeř bojovník
     * @param Kostka kostka - Instance hrací kostky
     * 
     */
    public void utoc(Bojovnik souper, Kostka kostka) {
        /**
         * zde se rozhoduje co skřítek udělá pokud dostal kašičku, tak vás
         * vyléčí
         */
        int uder = 0;
        if (rozhodnuti==1) {
            /**
             * Probehne utok
             */
            uder = utok + kostka.hod();
            nastavZpravu(String.format(this.jmeno + "útočí s úderem za %s hp", jmeno, uder));
            zprava = String.format("%s utrpěl poškození %s hp", jmeno, uder);
            souper.branSe(uder);
        } else /**
         * Skřítek tě vyléčí
         */
        {
            if (zivot + kostka.hod() <= maxZivot) {
                uder = utok - kostka.hod();
                nastavZpravu(String.format("%s léčí za %s hp", jmeno, uder));
                zprava = String.format("%s si vyléčil poškození %s hp", jmeno, uder);
            } else {
                zivot = maxZivot;
                nastavZpravu(String.format("%s léčí za %s hp", jmeno, uder));
            }
        }
    }

protected void nastavZpravu(String zprava)
    {
        this.zprava = zprava;
    }

    /**
     * Vrátí poslední zprávu o útoku nebo obraně
     * @return Poslední zpráva o útoku nebo obraně
     */
    public String vratPosledniZpravu()
    {
        return zprava;
    }

    /**
     * Vrací textovou reprezentaci bojovníka
     * @return Textová reprezentace bojovníka
     */
    @Override
    public String toString()
    {
        return jmeno;
    }


}
