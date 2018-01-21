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

public class TahovyBoj {

    public static void main(String[] args) {
        // vytvoření objektů
        Kostka kostka = new Kostka(10);
        Bojovnik zalgoren = new Bojovnik("Zalgoren", 100, 20, 10, kostka);
        Mag gandalf = new Mag("Gandalf", 60, 15, 12, kostka, 30, 45);
        Arena arena = new Arena(zalgoren, gandalf, kostka);
        // zápas
        arena.zapas();
    }
}
