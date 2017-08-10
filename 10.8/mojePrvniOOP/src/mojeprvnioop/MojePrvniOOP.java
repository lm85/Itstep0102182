/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mojeprvnioop;

/**
 *
 * @author Milan Zlamal
 */
public class MojePrvniOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // potrebuji metodu abych k ni pristoupil

        ContactList cl = new ContactList();
        Contact c = null;
        c = new Contact("ICH", "BIN", "65464654", "Bsfsdf");
        cl.data.add(c);
        System.out.println(c);
    }
    
}
