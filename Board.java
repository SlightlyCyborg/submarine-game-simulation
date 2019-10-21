package holon.simulation.game.submarine;

import java.util.Vector;
import java.util.Map;
import java.util.HashMap;

public class Board {
    AirTank tank;
    Vector<Ruin> ruins;
    Vector<Player> players;
    Map<Player, Integer> positions;

    public Board(Vector<Player> players) {
        tank = new AirTank();
        initRuins();
        this.players = players;
        initPositions();
    }

    private void initPositions() {
        positions = new HashMap<>();
        for(Player player: players) {
            positions.put(player, 0);
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

    protected void changePlayerPosition(Player p, int increment) {
        int pos = getPosition(p) + increment;
        positions.put(p, pos);
    }

    public int getPosition(Player p) {
        return positions.get(p);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("%d:", tank.readGague()));
        for(Ruin ruin: ruins) {
            sb.append(String.format(" %d", ruin.getLevel()));
        }
        sb.append("\n");
        for(Player player: players) {
            for(int i = 0; i < getPosition(player); i++) {
                sb.append(" ");
            }
            sb.append(String.format(" ^%s\n", player.getName()));
        }
        return sb.toString();
    }
}
