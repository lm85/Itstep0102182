/*
 * toto je na nauceni tvorby tridy a prace s nimi

vytvorime si cloveka - trida
clovek ma hnede oci - dedicnost
polymorfismem mohu menit vlastnosti dedicne
mohu pouzivat metody jinych objektu, ridit program - delegovani
nemusim vedet jak to uvnitr funguje - jako treba pouziji Math.Pow, 
nechci vedet jak, ale jen ze mi to vrati toto - abstrakce
vlastnosti obektu (promenne) co ma v sobe - atributy
jsou to funkce co ten objekt dokaze - metody
zapouzdreni - modifikatory pristupu, napr public a private - zapouzdreni
instance - parafrazuji konkretni objekty s kterymi pracuji, 
lisi se atributama - hodnotama atributu ci datama
pretizene metody viz trida Clovek a nepovinne parametry 
Konstruktor - this pouzijeme pro rozliseni atributu a parametru metody
jinak se vola v mainu
getter a setter - metoda ktera nam pomaha brat hodnotu z privite atributu
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
        Clovek karel = new Clovek("Karel", 42);
        karel.pozdrav("Dobrý den");
        karel.pozdrav();
        
        //Tohle nejde! Proč? -- vek je privatni pro tridu Clovek
        //karel.vek = 42;
    
        /*
        // V tuto chvili se vola konstruktor
        Clovek karel = new Clovek("Karel",42)
        karel.pozdrav("Zdar ")
        karel.pozdrav();
        */
        
    }
    
}
