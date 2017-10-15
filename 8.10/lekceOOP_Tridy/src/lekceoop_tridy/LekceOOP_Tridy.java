/*
 * toto je na nauceni tvorby tridy a prace s nimi
 */

package lekceoop_tridy;

/**
 *
 * @author Milan Z
 */
public class LekceOOP_Tridy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        //vytvoreni instance - vytvarim noveho cloveka
        Clovek karel = new Clovek();
        karel.jmeno = "Karel";
        karel.pozdrav("Dobrý den");
        karel.pozdrav();
        
        //Tohle nejde! Proč? -- vek je privatni pro tridu Clovek
        //karel.vek = 42;
    
    }
    
}
