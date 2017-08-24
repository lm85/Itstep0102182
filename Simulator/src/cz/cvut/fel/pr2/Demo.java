package cz.cvut.fel.pr2;


public class Demo {

    public static void main(String[] args) throws Exception {
        Simulator sim = new Simulator(new World());
        //Simulator sim = new Simulator(new WorldZero());
        sim.join(new RandomPlayer());
        sim.join(new RedPlayer());
        sim.join(new MinPlayer());

        
        
        for (int i = 0; i < 3; ++i) {
            System.out.println("Round number: " + i);
            sim.nextRound();
        } 
        
        
        
    }
}
