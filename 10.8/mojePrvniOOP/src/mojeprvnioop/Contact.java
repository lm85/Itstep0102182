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
public class Contact {

    
    private String name, surename, phone, adress;
    
    public Contact(String name, String surename, String phone, String adress) throws Exception {
    this.setName(name);
    setSurename(surename);
    setPhone(phone);
    setAdress(adress);
    
    }
    public void setSurename(String surename) throws Exception{
    if (!surename.matches("[a-zA-Z]+")) {
                throw new Exception("Chyba v zadani prijmeni");
            }
            this.surename = surename;
    
    }
    
    public void setName(String name) throws Exception{
    if (!name.matches("[a-zA-Z]+")) {
                throw new Exception("Chyba v zadani jmeno");
            }
            this.name = name;
    
    }
    
    public void setPhone(String phone) throws Exception{
    if (!phone.matches("[0-9]+")) {
                throw new Exception("Chyba v zadani phone");
            }
            this.phone = phone;
    
    }
    
    public void setAdress(String adress) throws Exception{
    if (!adress.matches("[a-zA-Z]* [a-zA-Z]* *[0-9]*")) {
                throw new Exception("Chyba v zadani adresy");
            }
            this.adress = adress;
    
    }
    
    public String getSurename(String surename) throws Exception{
    
            return this.surename;
    
    }
    
    public String getName(String name) throws Exception{
   
            return this.name;
    
    }
    
    public String getPhone(String phone) throws Exception{
    
            return this.phone;
    
    }
    
    public String getAdress(String adress) throws Exception{

           return this.adress;
    
    }
    @Override
    // prepisuji metodu toString - ta je prapredek proste prepisuji definici stringu - pak se mi vola z teto definice
    public String toString() {
    return "Contact(" + "jmeno=" + name + ", prijmeni=" + surename + ", telefon=" + phone + ", adresa=" + adress + ")";
    }
}
