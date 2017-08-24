package cz.cvut.fel.pr2;


public abstract class Player implements Participant {

    private final String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
