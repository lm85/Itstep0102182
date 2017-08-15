/*
 * vytvoreni contact listu
 * vytvoreni me exceptiony za pomoci dedicnosti
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
        
        Contact c;
        ContactList cl = null;
        
        try {
        c = new Contact("ICH", "BIN", "65464654", "Bsfsdf ihikj 995");
        cl = new ContactList();
        cl.data.add(c);        
        
        System.out.println(cl);
        
        } catch (InvalidPhoneNumberException e) {
            //e.printStackTrace();  // Stack je od konce FIFO u heapu je to obracene 
            System.out.println(e.getMyErrorNumber() + " Wrong phone number" + e.getMessage());
        }
        
         catch (Exception e) {
            //e.printStackTrace();  // Stack je od konce FIFO u heapu je to obracene 
            System.out.println(" Wrong contact" + e.getMessage());
        }
        
        
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
