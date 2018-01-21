/*
 Definuji auto
 */
package nakladak;

/**
 *
 * @author Milan Z
 */
public class Auto {

    public int naloz;           // nakladam v tunach
    public int vyloz;           // nakladam v tunach
    private int nalozeno;       // kolik mam nalozeno 
    
    
    public void vyloz(int vyloz) {
        nalozeno-=vyloz;
        // maximalni nalozeni je 30 tun
        if (nalozeno <=0){
            System.out.println("Chcete vylozit nenalozene" + nalozeno);
            // protoze nejde vykladat do minusu, pridame paletu
            nalozeno=0;
        }
    }

    
    public void naloz(int naloz) {
        nalozeno+=naloz;
        // maximalni nalozeni je 30 tun
        if (nalozeno >30){
            System.out.println("Nalozily jste nad nosnost," + nalozeno + "proto jsme vylozily vse.");
            nalozeno=30;
        }
                
    }
    
    public void vypis(){
    
    System.out.println("Nyni je nalozeno: " + nalozeno);
    }

}
