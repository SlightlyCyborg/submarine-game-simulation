package holon.simulation.game.submarine;

import java.util.Vector;

public class Board {
    AirTank tank;
    Vector<Ruin> ruins;
    Vector<Integer> players;

    public Board(int numPlayers) {
        tank = new AirTank();
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
        int value, level;
        for(int levelInd = 0; levelInd < 4; levelInd++) {
            for(int valueInd = 0; valueInd < 4; valueInd++) {
                for(int duplicate = 0; duplicate < 2; duplicate++) {
                    value = levelInd * 4 + valueInd;
                    level = levelInd + 1;
                    ruins.add(new Ruin(level, value));
                }
            }
        }
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("%d:", tank.readGague()));
        for(Ruin ruin: ruins) {
            sb.append(String.format(" %d", ruin.getLevel()));
        }
        sb.append("\n");
        for(Integer player: players) {
            sb.append(String.format(" %d\n", player));
        }
        return sb.toString();
    }
}
