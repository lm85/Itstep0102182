 /*
 string " C++ je %d KRÁT lepší! " zmenit na "Java je 3 krát lepší!"
 pouzit co nejvice retezcovych(stringovych) funkci
 */
package pracesestringy;

/**
 *
 * @author Milan Z
 */
public class PraceSeStringy {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        /*
         string " C++ je %d KRÁT lepší! " zmenit na "Java je 3 krát lepší!"
         pouzit co nejvice retezcovych(stringovych) funkci
         */

        // definice stringu
        String s = " C++ je %d KRÁT lepší! ";

        // string neobsahuje mezery na zacatku ci konci
        s = s.trim();
        System.out.println("string je po trimu: " + s);

        // prevedeme cely string na mala pismena
        s = s.toLowerCase();
        System.out.println("string je po lovercase: " + s);

        // ve stringu nemuze byt "krát" jinak hodi vyjimku
        if (s.contains("KRÁT")) {
            throw new Exception("neobsahuje KRÁT");
        }

        // ve stringu nahradime "c++" za "Java"
        s = s.replace("c++", "Java");
        System.out.println("string je po nahrazeni c++ za Java: " + s);

        // string nema obsahovat "krát" jinak hodi vyjimku
        if (!s.contains("krát")) {
            throw new Exception("neobsahuje c++");
        }

        // nahradim "%d" 3nasobkem poctu delky stringu
        s = s.replace("%d", String.valueOf(3 * (s.length())));
        
        
        // vypisi vysledek
        System.out.println("Vysledek je: " + s);

    }

}
