/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloobjects;

/**
 * @author Milan Z 
 */
public class Zdravic {

    public String text;

    /**
     * Pozdraví uživatele textem pozdravu a jeho jménem
     * @param jmeno Jméno uživatele
     * @return Text s pozdravem
     */
    public void pozdrav(String jmeno) {
        System.out.printf("%s %s\n", text, jmeno);

    }
}
