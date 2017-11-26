/*
 *  _____ _______         _                      _
 * |_   _|__   __|       | |                    | |
 *   | |    | |_ __   ___| |___      _____  _ __| | __  ___ ____
 *   | |    | | '_ \ / _ \ __\ \ /\ / / _ \| '__| |/ / / __|_  /
 *  _| |_   | | | | |  __/ |_ \ V  V / (_) | |  |   < | (__ / /
 * |_____|  |_|_| |_|\___|\__| \_/\_/ \___/|_|  |_|\_(_)___/___|
 *                   ___
 *                  |  _|___ ___ ___
 *                  |  _|  _| -_| -_|  LICENCE
 *                  |_| |_| |___|___|
 *
 * IT ZPRAVODAJSTVÍ  <>  PROGRAMOVÁNÍ  <>  HW A SW  <>  KOMUNITA
 *
 * Tento zdrojový kód pochází z IT sociální sítě WWW.ITNETWORK.CZ
 *
 * Můžete ho upravovat a používat jak chcete, musíte však zmínit
 * odkaz na http://www.itnetwork.cz
 */
package unittesty;

/**
 * Reprezentuje jednoduchou kalkulačku
 */
public class Kalkulacka {
   
    /**
     * Sečte 2 čísla
     * @param a První číslo
     * @param b Druhé číslo
     * @return Součet 2 čísel
     */
    public double secti(double a, double b) {
        return a + b;
    }
    
    /**
     * Odečte 2 čísla
     * @param a První číslo
     * @param b Druhé číslo
     * @return Rozdíl 2 čísel
     */
    public double odecti(double a, double b) {
        return a - b;
    }
    
    /**
     * Vynásobí 2 čísla
     * @param a První číslo
     * @param b Druhé číslo
     * @return Součin 2 čísel
     */
    public double vynasob(double a, double b) {
        if (a * b > 2147483647)
            throw new IllegalArgumentException("Zadali jste prilis vysoke cislo k nasobeni");
        
        return a * b;

    }
    
    /**
     * Vydělí 2 čísla
     * @param a První číslo
     * @param b Druhé číslo
     * @return Podíl 2 čísel
     */
    public double vydel(double a, double b) {
        if (b == 0)
            throw new IllegalArgumentException("Nelze dělit nulou!");
        if (a/b <= -3.4e38 )
            throw new IllegalArgumentException("Zadali jste prilis vysoke cislo k deleni");
        return a / b;
    }
    
}
