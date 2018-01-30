/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicebag;


import java.util.Random;


/**
 * Třída reprezentuje hrací kostku
 * @author Milan ZLamal
 */
public class Die {
    private Random random;
    protected int faces;
    protected int withFaces;

    
    /**
     * Vytvoří novou instanci hrací kostky
     * uzivatel definuje pocet sten
     * potom mu ukaze co zvolil
     * @param pocetSten Počet stěn hrací kostky
     */ 
    public Die(int faces, Random random, int roll)
    {
        this.faces = faces;
        this.random = new Random();
    }    
    
     /**
     * Vytvoří novou instanci hrací kostky
     * @param pocetSten Počet stěn hrací kostky
     */ 
    public Die(int faces)
    {
        this.faces = faces;
        random = new Random();
    }

    
     /**
     * Vrátí počet stěn hrací kostky
     * @return počet stěn hrací kostky
     */
    public int vratPocetSten()
    {

        return faces;
    }
    
    
     /**
     *  Provede inicializaci kostky
     * @param faces
     * 
     */
    public int Inicialization(int faces)
    {
        
        return random.nextInt(faces + 1) + 1;
        
    }
    
    
     /**
     * Vrací textovou reprezentaci kostky
     * @return Textová reprezentace kostky
     */
    @Override
    public String toString()
    {
        return String.format("Kostka s %s stěnami", faces);
    }
    
}
