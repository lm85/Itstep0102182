package cz.cvut.fel.pr2;


import java.util.Random;

public class RandomPlayer extends Player {

    Random rand;

    public RandomPlayer() {
        super("Random");
        rand = new Random();
    }

    @Override
    public Bet doStep(World world) {
        Integer bet = rand.nextInt(36) + 1;
        return new Bet(bet.toString(), 1); //always bet 1 gold

    }
}
