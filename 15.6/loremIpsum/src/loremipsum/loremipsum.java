/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loremipsum;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class loremipsum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
         A = 65 ** Z = 90
         */
        int i = 0;
        int delka;
        int hodnotaAscii = 0;
        int buffer;
        int j;
        // posun se o cislo zadane scannerem - userem
        //String text = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Vivamus luctus egestas leo. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Mauris suscipit, ligula sit amet pharetra semper, nibh ante cursus purus, vel sagittis velit mauris vel metus. Nunc tincidunt ante vitae massa. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nulla non lectus sed nisl molestie malesuada. Etiam dictum tincidunt diam. Nam quis nulla. Integer vulputate sem a nibh rutrum consequat. Etiam dictum tincidunt diam. Duis viverra diam non justo. Etiam posuere lacus quis dolor. Proin mattis lacinia justo. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos hymenaeos. Proin in tellus sit amet nibh dignissim sagittis. Integer rutrum, orci vestibulum ullamcorper ultricies, lacus quam ultricies odio, vitae placerat pede sem sit amet enim. Mauris suscipit, ligula sit amet pharetra semper, nibh ante cursus purus, vel sagittis velit mauris vel metus. Aenean vel massa quis mauris vehicula lacinia. Etiam dictum tincidunt diam. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. In enim a arcu imperdiet malesuada. Etiam dui sem, fermentum vitae, sagittis id, malesuada in, quam. Pellentesque ipsum. Donec ipsum massa, ullamcorper in, auctor et, scelerisque sed, est. Aliquam id dolor. In convallis. Etiam neque. Integer malesuada. Curabitur sagittis hendrerit ante. Duis sapien nunc, commodo et, interdum suscipit, sollicitudin et, dolor. Donec iaculis gravida nulla. Aliquam id dolor. Fusce tellus odio, dapibus id fermentum quis, suscipit id erat. Nullam rhoncus aliquam metus. Nullam dapibus fermentum ipsum. Etiam bibendum elit eget erat. Maecenas sollicitudin. Nullam rhoncus aliquam metus. Mauris tincidunt sem sed arcu. Duis viverra diam non justo. Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur? Nunc auctor. Duis pulvinar. In dapibus augue non sapien. Fusce tellus odio, dapibus id fermentum quis, suscipit id erat. Mauris metus. Donec iaculis gravida nulla. Fusce tellus odio, dapibus id fermentum quis, suscipit id erat. Proin pede metus, vulputate nec, fermentum fringilla, vehicula vitae, justo. Etiam quis quam. Sed vel lectus. Donec odio tempus molestie, porttitor ut, iaculis quis, sem. Integer rutrum, orci vestibulum ullamcorper ultricies, lacus quam ultricies odio, vitae placerat pede sem sit amet enim. Integer tempor. Duis pulvinar. In dapibus augue non sapien. Fusce aliquam vestibulum ipsum. Nulla est. Maecenas aliquet accumsan leo. Praesent dapibus. Duis pulvinar. Aliquam erat volutpat. Maecenas lorem. Fusce consectetuer risus a nunc. Nunc auctor. Nullam rhoncus aliquam metus. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Mauris suscipit, ligula sit amet pharetra semper, nibh ante cursus purus, vel sagittis velit mauris vel metus. Pellentesque ipsum. Aliquam erat volutpat. Nunc auctor. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Cras elementum. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Fusce aliquam vestibulum ipsum. Nunc dapibus tortor vel mi dapibus sollicitudin. Mauris elementum mauris vitae tortor. Fusce wisi. Cras elementum. Etiam posuere lacus quis dolor. Fusce tellus.";
        //String text = "aabcdefghijklmnopqrstttuvwxyyyzzzz";
        String text = "a Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Vivamus luctus egestas leo. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Mauris suscipit, ligula sit amet pharetra semper, nibh ante cursus purus, vel sagittis velit mauris vel metus. Nunc tincidunt ante vitae massa. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nulla non lectus sed nisl molestie malesuada. Etiam dictum tincidunt diam. Nam quis nulla. Integer vulputate sem a nibh rutrum consequat. Etiam dictum tincidunt diam. Duis viverra diam non justo. Etiam posuere lacus quis dolor. Proin mattis lacinia justo. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos hymenaeos. Proin in tellus sit amet nibh dignissim sagittis. Integer rutrum, orci vestibulum ullamcorper ultricies, lacus quam ultricies odio, vitae placerat pede sem sit amet enim. Mauris suscipit, ligula sit amet pharetra semper, nibh ante cursus purus, vel sagittis velit mauris vel metus.\n"
                + "\n"
                + "Aenean vel massa quis mauris vehicula lacinia. Etiam dictum tincidunt diam. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. In enim a arcu imperdiet malesuada. Etiam dui sem, fermentum vitae, sagittis id, malesuada in, quam. Pellentesque ipsum. Donec ipsum massa, ullamcorper in, auctor et, scelerisque sed, est. Aliquam id dolor. In convallis. Etiam neque. Integer malesuada. Curabitur sagittis hendrerit ante. Duis sapien nunc, commodo et, interdum suscipit, sollicitudin et, dolor. Donec iaculis gravida nulla. Aliquam id dolor. Fusce tellus odio, dapibus id fermentum quis, suscipit id erat. Nullam rhoncus aliquam metus. Nullam dapibus fermentum ipsum. Etiam bibendum elit eget erat. Maecenas sollicitudin.\n"
                + "\n"
                + "Nullam rhoncus aliquam metus. Mauris tincidunt sem sed arcu. Duis viverra diam non justo. Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur? Nunc auctor. Duis pulvinar. In dapibus augue non sapien. Fusce tellus odio, dapibus id fermentum quis, suscipit id erat. Mauris metus. Donec iaculis gravida nulla. Fusce tellus odio, dapibus id fermentum quis, suscipit id erat. Proin pede metus, vulputate nec, fermentum fringilla, vehicula vitae, justo. Etiam quis quam.\n"
                + "\n"
                + "Sed vel lectus. Donec odio tempus molestie, porttitor ut, iaculis quis, sem. Integer rutrum, orci vestibulum ullamcorper ultricies, lacus quam ultricies odio, vitae placerat pede sem sit amet enim. Integer tempor. Duis pulvinar. In dapibus augue non sapien. Fusce aliquam vestibulum ipsum. Nulla est. Maecenas aliquet accumsan leo. Praesent dapibus. Duis pulvinar. Aliquam erat volutpat. Maecenas lorem. Fusce consectetuer risus a nunc. Nunc auctor.\n"
                + "\n"
                + "Nullam rhoncus aliquam metus. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Mauris suscipit, ligula sit amet pharetra semper, nibh ante cursus purus, vel sagittis velit mauris vel metus. Pellentesque ipsum. Aliquam erat volutpat. Nunc auctor. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Cras elementum. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Fusce aliquam vestibulum ipsum. Nunc dapibus tortor vel mi dapibus sollicitudin. Mauris elementum mauris vitae tortor. Fusce wisi. Cras elementum. Etiam posuere lacus quis dolor. Fusce tellus.";

        Scanner keyboard = new Scanner(System.in);
        int sifra = keyboard.nextInt();

        if (sifra > 26) {
            sifra = sifra % 26;
        }

// pole na počítání
        int[] pole = new int[text.length()];
        for (int k = 0; k < text.length(); k++) {
            //de nacitani pole
            pole[k] = text.charAt(k);
        }

        int ascii = (int) 'a';
        
        
        while (i < text.length() - 1) {

            if (text.charAt(i) > 64 && text.charAt(i) < 91) {
                hodnotaAscii = text.charAt(i);
                // - velke pismena ok
                ascii = hodnotaAscii;
                ascii = ascii + sifra;

                if (ascii > 90) {
                    ascii = ascii % 90 + 64;
                    pole[i] = ascii;
                } else {
                    pole[i] = ascii;
                }

            } else if (text.charAt(i) >= 97 && text.charAt(i) <= 122) {

                hodnotaAscii = text.charAt(i);
                
                // - male pismena ok
                ascii = (int) hodnotaAscii;
                ascii = ascii + sifra;
                if (ascii > 122) {
                    ascii = ascii % 122 + 97;
                    pole[i] = ascii;
                } else {
                    pole[i] = ascii;
                }
            }

            i++;
        }

        System.out.println("Kontrolni bod");
        for (j = 0; j < text.length() - 1; j++) {
            // hodnoty pole pro kontrolu
            //System.out.print(pole[j] + " ");
            System.out.print((char) pole[j]);
        }
        
        
        // desifrovani
        while (i < text.length() - 1) {

            if (text.charAt(i) > 64 && text.charAt(i) < 91) {
                hodnotaAscii = text.charAt(i);
                // - velke pismena ok
                ascii = hodnotaAscii;
                ascii = ascii - sifra;

                if (ascii < 65) {
                    ascii = ascii - 64 + 90;    
                    
                    pole[i] = ascii;
                } else {
                    pole[i] = ascii;
                }

            } else if (text.charAt(i) >= 97 && text.charAt(i) <= 122) {

                hodnotaAscii = text.charAt(i);
                
                // - male pismena ok
                ascii = (int) hodnotaAscii;
                ascii = ascii - sifra;
                if (ascii < 97) {
                    ascii = ascii - 96 + 122;
                    pole[i] = ascii;
                } else {
                    pole[i] = ascii;
                }
            }

            i++;
        }        
                System.out.println("Kontrolni bod");
        for (j = 0; j < text.length() - 1; j++) {
            // hodnoty pole pro kontrolu
            //System.out.print(pole[j] + " ");
            System.out.print((char) pole[j]);
        }
                
    }

}
