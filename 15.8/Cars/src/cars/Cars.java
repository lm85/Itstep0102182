/* 
 * sesit:
 * Dedicnost
 * lze rozsirovat datove polozky trid nebo je take modifikovat
 * rozsirovat nebo modifikovat metody trid
 * vytvaret hierarchie
 * predavat datove polozky a metody k rozsireni a uprave
 * 
 * polymorfismus
 * napriklad - nevolam kvuli kvadru 3 hodnoty v osach, ale jen jednu a mam krychli
 * pak dam public getter
 * pak dam @override param
 * co je public s volanim predka a returnem
 * super. dostanu se na vsechny metody co nejsou private k dispozici
 * muzu si napsat v predchozim objektu - predkovi metodu v pripade ze neni private
 * private - nema nikdo sahat a ma na nej sehat constructor a destruktor, nechci aby meli ostatni pristup 
 * vse vo plati pro predka, musi platit pro potomka
 */
package cars;

/**
 *
 * @author Milan Zlamal
 */
public class Cars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car a = null;

        a = new Car("VW", "Beringo", 2017, 250, "diesel");

    }

}
