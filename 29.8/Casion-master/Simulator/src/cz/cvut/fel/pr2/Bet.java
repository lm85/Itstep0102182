package cz.cvut.fel.pr2;


public class Bet {

    private final String bet;
    private final int amount;

    public Bet(String bet, int amount) {
        this.bet = bet;
        this.amount = amount;
    }

    public String getBet() {
        return bet;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "(" + bet + "," + amount + ")";
    }

    boolean isNan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
