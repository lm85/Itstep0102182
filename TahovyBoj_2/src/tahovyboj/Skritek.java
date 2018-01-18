/*
 * Skřítek je jednou hodný a pomáhající, podruhé zase záškodníkem.
 * Nechali jste mu kaši?
 */
package tahovyboj;

import java.util.Random;
import java.util.logging.Logger;

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
     * 
     * rozhodnuti je promenna ktera nese hodnotu a pouziji ji v podminkach
     * min a max je minimalni a maximalni rozsah
     */
    int rozhodnuti;
    
    public static int random_int(int Min, int Max) {
        /*
        * Nahodně generuje číslo mezi 1 a 2
        */
        return (int) (Math.random() * (Max - Min - 1)) + Min;
    }

    
    
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
        int uder = 9;
        if (rozhodnuti == 1) {
            /**
             * Proběhne útok - skřítek zaútočí/léčí cíl
             */
            uder = utok + kostka.hod();
            nastavZpravu(String.format("%s útočí úderem za %s hp", jmeno, uder));
            //zprava = String.format("BOJOVNIK " + souper.jmeno + " utrpěl poškození %s hp", jmeno, uder);    // ke kontrole a zkousky
            souper.branSe(uder);
        } else /**
         * Skřítek tě vyléčí
         */
        {
            if (rozhodnuti == 2) {
                if (zivot + kostka.hod() <= souper.maxZivot) {
                    uder = utok - kostka.hod();

                    nastavZpravu(String.format("%s léčí za %s hp", jmeno, uder));
                    //zprava = String.format("BOJOVNIK " + souper.jmeno + " si vyléčil poškození %s hp", jmeno, uder);    // ke kontrole a zkousky
                } else {
                    zivot = maxZivot;
                    nastavZpravu(String.format("%s léčí za %s hp", jmeno, uder));
                    //zprava = String.format("BOJOVNIK " + souper.jmeno + " vyléčil za" + (souper.maxZivot-uder) + " hp", jmeno, uder);    // ke kontrole a zkousky
                }
            }
        }
    }
    /*
    * Nastaví zprávu pro pozdější využití classou Arena
    * ta je pak používana vratPosledniZpravu() nize
    *
    * @param zde je parametrem zpráva zadaná výše
    */
    protected void nastavZpravu(String zprava) {
        this.zprava = zprava;
    }

    /**
     * Vrátí poslední zprávu o útoku nebo obraně
     *
     * @return Poslední zpráva o útoku nebo obraně
     */
    public String vratPosledniZpravu() {
        return zprava;
    }

    /**
     * Vrací textovou reprezentaci bojovníka
     *
     * @return Textová reprezentace bojovníka
     */
    @Override
    public String toString() {
        return jmeno;
    }






}
