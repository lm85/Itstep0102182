package lekceoop_Tridy;

/*
je ok, jen jsem revertoval soubor... nechtene jsem dal klavesovou zkratku 
a refaktoroval name hlavni tridy, pak uz jen se snazil zachranit data
zpraveno po zmene - zapsani tohoto komentare ;))
 */

/**
 *
 * @author Milan Z
 */
public class Clovek {
    private String jmeno;
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
    
    // konstruktor
    public Clovek(String jmeno, int vek){
     //this pouzijeme pro rozliseni atributu a parametru metody
    this.jmeno = jmeno;
    this.vek= vek;
    }
    
    
    // Metody pro pozdrav ponechame
    
    /*
    setter generujeme alt+insert - nastavime hodnotu 
        pro ziskani hodnoty z private promennych (atributu)
        - prepise se puvodni pokud nejaka je
    */
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    
    /*
    setter generujeme alt+insert - nastavime hodnotu 
        pro ziskani hodnoty z private promennych (atributu)
        - prepise se puvodni pokud nejaka je
    */
    public void setVek(int vek) {
        this.vek = vek;
    }

    /*
    getter generujeme alt+insert - vememe si hodnotu 
        pro ziskani hodnoty z private promennych (atributu)
        - vememe prepsanou hodnotu promenne - atributu settrem
    */
    public String getJmeno() {
        return jmeno;
    }

    public int getVek() {
        return vek;
    }
    
}
