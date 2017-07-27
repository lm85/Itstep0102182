/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Milan Zlamal
 * palindrom detekce
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palindrom = "a n na";
        palindrom = palindrom.replaceAll("\\W", "");
        char[] warray = palindrom.toCharArray();
        System.out.println(isPalindrom(warray));
    }

    public static boolean isPalindrom(char[] palindrom) {
        int i1 = 0;
        int i2 = palindrom.length - 1;

        while (i2 > i1) {
            if (palindrom[i1] != palindrom[i2]){
        return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }

}
