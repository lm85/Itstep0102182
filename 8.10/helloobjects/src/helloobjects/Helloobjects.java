/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloobjects;

/**
 *
 * @author Milan Z
 */
public class Helloobjects {


    public static void main(String[] args) {

        Zdravic zdravic = new Zdravic();
        zdravic.text = "Ahoj uživateli";
        zdravic.pozdrav("Karel");
        zdravic.pozdrav("Petr");
        zdravic.text = "Vítám tě tu programátore";
        zdravic.pozdrav("Tester");

    }

}
