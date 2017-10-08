/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tahovybojja;

import java.util.Random;

/** Třída reprezentuje hrací kostku */
public class Kostka
{
    /** Generátor náhodných čísel */
    private Random random;
    /** Počet stěn kostky */
    private int pocetSten;

    /** Vytvoří novou instanci hrací kostky */
    public Kostka()
    {
        this.pocetSten = 6;
        random = new Random();
    }

    /**
     * Vytvoří novou instanci hrací kostky
     * @param pocetSten Počet stěn hrací kostky
     */ 
    public Kostka(int pocetSten)
    {
        this.pocetSten = pocetSten;
        random = new Random();
    }

    /**
     * Vrátí počet stěn hrací kostky
     * @return počet stěn hrací kostky
     */
    public int vratPocetSten()
    {
        return pocetSten;
    }

    /**
     * Vykoná hod kostkou
     * @return Číslo od 1 do počtu stěn
     */
    public int hod()
    {
        return random.nextInt(pocetSten + 1) + 1;
    }

    /**
     * Vrací textovou reprezentaci kostky
     * @return Textová reprezentace kostky
     */
    @Override
    public String toString()
    {
        return String.format("Kostka s %s stěnami", pocetSten);
    }

}




    

