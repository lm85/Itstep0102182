/*
 * vytvoreni contact listu
 * vytvoreni me exceptiony
 */

package mojeprvnioop;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

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
        c = new Contact("ICH", "BIN", "65464654", "Bsfsdf ihikj 995");
        cl.data.add(c);
        System.out.println(cl);
        
        try {
            FileOutputStream fileOut = new FileOutputStream("list.serializaed");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(cl);
            out.close();
            fileOut.close();
            System.out.println("DONE");
            
        } catch (IOException i) {
            i.printStackTrace();  // Stack je od konce FIFO u heapu je to obracene 
        }
    }
    
}
