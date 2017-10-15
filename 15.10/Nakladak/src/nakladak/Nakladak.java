/*
Nakladak 
auto s metodamy naloz() a vyloz(), ktere meni velikost nakladu, naklad je reprezentovan vnitrnim atributem
* navic muzeme zavezt kontrolu nosnosti a dostatku nakladu pro vylozeni
metoda vypis() vypise stav automobilu zkuste nalozit a vylozit matros
 */

package nakladak;

/**
 *
 * @author Milan Z
 */
public class Nakladak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Auto tatra = new Auto();
        tatra.naloz(30);
        tatra.vyloz(10);
        tatra.vypis();
        
    }
    
}
