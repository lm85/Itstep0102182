/*
 dotaznik bitove a zapisovat do jednoho bajtu
 00000000
 x nic
 0x stav - svobodny
 00xxxx - mesic
 000000x - prijem boolean
 0000000x - boolean - muz1 zena2
 posun o 2 je x<<2
 zeptat se a zapsat do bajtu
 a pak pres serializaci ulozit - nejlepe po kazdem naplneni

 */
package dotaznik_bitoveoperatory;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Dotaznik_BitoveOperatory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Jste svobodny? - ano 1 ne 0");
        Scanner sc1 = new Scanner(System.in);
        byte volny = sc1.nextByte();

        if (volny != 1 && volny != 0) {
            System.out.println("Jste svobodny? - ano 1 ne 0");
            Scanner sc2 = new Scanner(System.in);
            byte volny2 = sc2.nextByte();
            volny = volny2;
        }
        
        System.out.println("Mesic narozeni? - zadejte cislo");
        Scanner sc2 = new Scanner(System.in);
        Integer mesic = sc2.nextInt();
        

        System.out.println(mesic);
        Scanner sc4 = new Scanner(System.in);
        System.out.println("mas prijem? - ano 1 ne 0");
        //byte mesic = (byte) sc4.nextByte();

        System.out.println(mesic);
        
        volny=0x40;  // 0x40 je hexadecimal 1 na 6. miste bytu - koukni na progr. kalk, lze i 0<<7 
    }
        public static byte volny (byte volny){
        return (byte) volny;
        } 
   
        public static byte mesic (byte mesic){
            // tady switch  case 1: return (byte) 0x1; atd. bitova hodnota
            
            return (byte) mesic;
        } 

}
