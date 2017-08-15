/*
 * tvorba vlastni exceptiony
 */

package mojeprvnioop;

/**
 *
 * @author Milan Zlamal
 */
public class InvalidPhoneNumberException extends Exception {
    private int myErrorNumber;
    
    public InvalidPhoneNumberException(int myErrorNumber, String message){
        super(message);
        this.myErrorNumber = myErrorNumber;
    
    }
    
    public int getMyErrorNumber(){
    return myErrorNumber;
    }
    
}
