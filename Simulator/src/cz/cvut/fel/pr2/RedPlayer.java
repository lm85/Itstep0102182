package cz.cvut.fel.pr2;


public class RedPlayer extends Player {

    public RedPlayer() {
        super("Red");
    }

    @Override
    public Bet doStep(World world) {
        return new Bet("5", 1); //always bet 1 gold 
    }
}


