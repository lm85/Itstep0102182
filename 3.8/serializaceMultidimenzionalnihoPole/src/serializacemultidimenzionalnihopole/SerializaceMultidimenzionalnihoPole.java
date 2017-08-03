/*
 * serializace multidimenzionalniho pole
 */

package serializacemultidimenzionalnihopole;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ASUS
 */
public class SerializaceMultidimenzionalnihoPole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    int[][] twoD = new int[][] { new int[] { 1, 2, 5,6 },
            new int[] { 3, 4 } };

    int[][] newTwoD = null; // will deserialize to this

    System.out.println("Before serialization");
    for (int[] arr : twoD) {
        for (int val : arr) {
            System.out.println(val);
        }
    }

    try {
        FileOutputStream fos = new FileOutputStream("test.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(twoD);

        FileInputStream fis = new FileInputStream("test.dat");
        ObjectInputStream iis = new ObjectInputStream(fis);
        newTwoD = (int[][]) iis.readObject();

    } catch (Exception e) {

    }

    System.out.println("After serialization");
    for (int[] arr : newTwoD) {
        for (int val : arr) {
            System.out.println(val);
        }
    }
    }
    
}
