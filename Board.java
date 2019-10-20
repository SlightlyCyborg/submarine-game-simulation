package holon.simulation.game.submarine;

import java.util.Vector;

public class Board {
    int air;
    Vector<Integer> ruins;
    Vector<Integer> players;

    public Board(int numPlayers) {
        air = 25;
        initRuins();
        initPlayers(numPlayers);
    }

    private void initPlayers(int num) {
        players = new Vector<>();
        for(int i = 0; i < num; i++) {
            players.add(i);
        }
    }

    private void initRuins() {
        ruins = new Vector<>();
        for(int i = 1; i <= 4; i++) {
            for(int j = 0; j < 8; j++) {
                ruins.add(i);
            }
        }
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("%d:", air));
        for(int ruin: ruins) {
            sb.append(String.format(" %d", ruin));
        }
        sb.append("\n");
        for(Integer player: players) {
            sb.append(String.format(" %d\n", player));
        }
        return sb.toString();
    }
}
