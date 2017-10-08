/*
# Vytvoří novou instanci bojovníka
#
#
#
- bacha na ukoncovani slozenou zavorkou ... 

 */

package tahovybojja;

/**
 *
 * @author Milan Z
 */
public class TahovyBojJA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kostka kostka = new Kostka(10);
        Bojovnik bojovnik = new Bojovnik("Zalgoren", 100, 20, 10, kostka);

        System.out.printf("Život: %s\n", bojovnik.grafickyZivot()); // test GrafickyZivot(); 

        // útok na našeho bojovníka
        Bojovnik souper = new Bojovnik("Shadow", 60, 18, 15, kostka);
        souper.utoc(bojovnik);
        System.out.println(souper.vratPosledniZpravu());
        System.out.println(bojovnik.vratPosledniZpravu());

        System.out.printf("Život: %s\n", bojovnik.grafickyZivot()); // test GrafickyZivot();
    }
    
}
