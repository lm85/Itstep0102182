/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mojeprvnioop;

import java.util.ArrayList;

/**
 *
 * @author Milan Zlamal
 */
public class ContactList implements java.io.Serializable {

    ArrayList<Contact> data = new ArrayList<Contact>();
    
    @Override
    public String toString() {
    String dataElements = "";
        for (Contact contact : data) {
            dataElements += contact.toString() + " ";
            
        }
        return "ContactList(" + dataElements + ")";
    }
    
}
