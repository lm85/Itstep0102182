package cz.cvut.fel.pr2;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Random;

public class Simulator {

    World world;
    ArrayList participants;
    final int MAX_PLAYERS = 5;
    int round;
    int winNumber;

    Simulator(World world) {
        this.world = world;
        participants = new ArrayList();
        round = 0;
    }

    public void join(Participant player) {
        if (participants.size() >= MAX_PLAYERS) {
            throw new RuntimeException("Too many players in the game");
        }
        if (player != null && participants.indexOf(player) == -1) {
            participants.add(player);
        }
    }

    public void nextRound() throws Exception {
        winNumber = winNumber(world);
        System.out.println("---- Vyherni cislo je: " + winNumber);
       
        try {
        for (int i = 0; i < participants.size(); ++i) {
            Participant player = (Participant) participants.get(i);
            Bet bet = player.doStep(world);

            if (checkBet(bet)) {
                throw new Exception("Špatně zadaná sázka hráčem: " + player);
            } else {

                if (isWinner(bet, winNumber)) {
                    System.out.println("VYHRAL: " + "Round " + round + " player #" + i + "(" + player + ") bet: " + bet);
                } else {
                    System.out.println("Round " + round + " player #" + i + "(" + player + ") bet: " + bet);
                }
            }

        } }catch (Exception e) {System.err.println(e);}
        round++;
    }

    public boolean checkBet(Bet bet) throws Exception {
        if (bet.getBet().matches("[0-9]+")) {
            return parseInt(bet.getBet()) < world.getMinNumber() || parseInt(bet.getBet()) > world.getMaxNumber();
        } else {
            return false;
        }
    }

    public int winNumber(World world) {
        Random rnd = new Random();
        int number = rnd.nextInt(world.getMaxNumber()) + world.getMinNumber();
        return number;
    }

    public boolean isWinner(Bet bet, int number) {
        if (parseInt(bet.getBet()) == number) {
            return true;
        } else {
            return false;
        }
    }
}
