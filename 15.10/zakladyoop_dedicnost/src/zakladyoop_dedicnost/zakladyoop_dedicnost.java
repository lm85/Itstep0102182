/*
 * tvoreni novych datovych struktur na zaklade novych
 * umoznuje vytvaret hierarchie trid Predek -> potomek
 * umoznuje aby od sebe objekty prejimaly atributy, metody, 
 * pridavaly nove, nebo je upravovaly
 * Java nikdy nededi konstruktory
 * musime je rucne volat pomoci klicoveho slova
 * base (C#), super (Java) nebo parent(PHP)
 * pozor:
 * Ctverec vs. obdelnik - doporuceni je nejdrive n uhelnik 
 * a pak z nej ctverec a obdelnik
 * k tomu pak slouzi tzv. modifikatory pristupu/viditelnosti
 * PROTECTED *
 * protected pristup je omezen pouze na tridu, ktera dany prvek obsahuje, 
 * na tridy, ktere od ni dedi a na tridy ve stejnem balicku i package
 * (default) - bez niceho (vychozi)
 * pristup je omezen na tridu, ktera dany prvek obsahuje a na tridy ve stejnem balicku
 *
 *
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

 Polymorfismus
 tam kde cekam instanci tridy, tak dodam potomka, 
 nemohu ale pouzit to co nema otcovska trida 
 pokud jsem nejakou prepsal, pak bude prepsana
 jako v metode pozdrav()
 
 definice:
 umoznuje definovat ruzne chovani instanci, 
 ale zachazet s nimi pod jednim spolecnym rozhranim
 
 Metody spolecne pro vsechny objekty ci reakce na udalosti:
 instance (konstruktor)
 prevod na text
 porovnani
 volaji se vzdy v urcitou chvili
 dedime je od prapredka Object(maji vychozi implementaci)
 prepisujeme jejich vychozi chovani
 */

package zakladyoop_dedicnost;

/*
 *
 * @author Milan Z
 */
public class zakladyoop_dedicnost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        //vytvoreni instance - vytvarim noveho cloveka
        Clovek karel = new Clovek("Karel", 42);
        karel.pozdrav("Dobrý den");
        karel.pozdrav();
        
        // sout vypise nazev hlavni tridy a nizsi uzite
        //System.out.println(karel);
        
        //Tohle nejde! Proč? -- vek je privatni pro tridu Clovek
        //karel.vek = 42;
    
        /*
        // V tuto chvili se vola konstruktor
        Clovek karel = new Clovek("Karel",42)
        karel.pozdrav("Zdar ")
        karel.pozdrav();
        */
        
        Programator josef = new Programator("Josef", 25, "Java");
        josef.pozdrav("Zdar");
        josef.pozdrav();
        System.out.println(josef.getJazyk());
        
        //pouziti/volani to string z Cloveka
        Clovek karel2 = new Clovek("Karel", 42);
        System.out.println(karel2);
    }
    
}
