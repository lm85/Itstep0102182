/*
trida Zvire() bude mit vahu a rika ze umi ci neumi letat
pouzit getter setter se zapouzdrenim, vraceni vahy v konstruktoru
dle vahy pokud ma <= 9kg muze letat 
metoda nakrm() prida vahu

postup
Zvire() atribut vaha vzacnost
generovat konstruktor
generovat getter setter
dodejte metodu nakrm(kolik)

zeptat zda umi/neumi letat - po prekrmeni neumi - zapouzdrit

navrh ukolu
osetrit s vyjimkama, dat nejake abstrakty, pak nevraci prazdne stringy
*/

package zviratka;

/**
 *
 * @author Milan Z
 * 
 */
public class Zviratka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Zvire straka = new Zvire(5, 20,true);    
    }
    
}
