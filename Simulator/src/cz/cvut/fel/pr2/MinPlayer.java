package cz.cvut.fel.pr2;


public class MinPlayer extends Player {

    public MinPlayer() {
        super("Min");
    }

    @Override
    public Bet doStep(World world) {
        Integer bet = world.getMinNumber();
        return new Bet(bet.toString(), 1); //always bet 1 gold
    }
}
