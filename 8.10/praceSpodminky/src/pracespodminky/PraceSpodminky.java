/*
 * vstup 2 cisla a vypis
 * zda jsou rovny, je mensi/prvni prvni ci druhe
 * retezec je zadan velkymi pismeny
 */
package pracespodminky;

/**
 *
 * @author Milan Z
 */
public class PraceSpodminky {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception { // *** zde nutno dodat exceptionu abych to fungovalo
        // vstup normal int 2 a 5 a string
        int jedna = 2, dva = 5;
        String text = "TOTOJEMUJUPPERCASE";

        if (jedna >= dva) System.out.println("Prvni cislo je vetsi nez druhe.");
        
        if (jedna <= dva) {
            System.out.println("Prvni cislo je mensi nez druhe.");
            
        }else System.out.println("Prvni i druhe cisla jsou stejne, nebo nejsou cisly.");
    
        if (text.equals("TOTOJEMUJUPPERCASE")) {
            System.out.println("Text je velkymi pismeny.");
                
            }else {
        throw new UpperCaseException("toto neni UpperCase"); // bacha musim zadat do classy ze ma hazet exceptionu viz / ***
        }
    }

    private static class UpperCaseException extends Exception {

        public UpperCaseException(String toto_neni_UpperCase) {
        }
    }

}
