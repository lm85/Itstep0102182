package lekceoop_tridy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Clovek {
    public String jmeno;
    private int vek = 42;

    // bez static je metoda dane tridy se static je obecna funkce
    // public = je videt z venku
    // void nic nevraci
    // atribut pozdrav musi byt zadan
    public void pozdrav (String pozdrav){
        
        // vypis s formatovanym stringem
        System.out.printf("%s %s, %d,", pozdrav, jmeno, vek);
    }
    
    public void pozdrav (){
        
        // vypis s formatovanym stringem
        System.out.printf("Ahoj %s, %d,", jmeno, vek);
    }
    /* potrebuji zaokrouhlovani - double a float
    udelam obe 2 a pak si s ni pohraji
    pretizena metoda - pokud mam metodu stejne jmenujici se je pretizena
    proste si ji definuji nekolikrat s parametrama a pak si ji zavolam 
    na potrebne fungovani
    
    pretezovani:
    ***
    bez atributu
        public void pozdrav (){
        
    // lepe delegovat - proste napsat s volanim 
        // vypis s formatovanym stringem
        System.out.printf("Ahoj %s, %d,", pozdrav, jmeno, vek);
    }
    
    bez atributu
        public void pozdrav (String pozdrav){
        
    // lepe delegovat - proste napsat s volanim 
        // vypis s formatovanym stringem
        System.out.printf("Ahoj %s, %d,", pozdrav, jmeno, vek);
    }
    ***
    */
    
}
