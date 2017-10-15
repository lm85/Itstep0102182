/*
 * Dedicnost *
 * extends vylepsuje cloveka
 * metoda Programator si bere jmeno, vek, jazyk
 * super 
 */

package zakladyoop_dedicnost;

/**
 *
 * @author Milan Z
 */
class Programator extends Clovek{
    
    private String jazyk;
    
    /* super je pro volani superclass construktoru, musi byt prvni radek
    * vola rodicovsky constructor with no arguments
    * super() vola nejblizsiho rodice
    * super() muze byt pouzito s cleny instanci, promennymi instanci, metody instanci
    * super() muze byt pouzit uvnitr construktoru k volani constructoru rodicovske tridy
    */
    public Programator(String jmeno, int vek, String jazyk){
    super(jmeno,vek);
    this.jazyk = jazyk;
    }
   
    // polymorfismus
    // anotace - @Override
    @Override
    public void pozdrav(){
        System.out.println("Hello world!");
    }

    public String getJazyk() {
        return jazyk;
    }
       
}
