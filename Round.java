package holon.simulation.game.submarine;

import java.util.Vector;
import java.util.List;

class Round {
    Vector<Ruin> ruins;

    public Round() {
        ruins = new Vector<>();
        initRuins();
    }

    private void initRuins() {
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

    public List<Ruin> getRuins() {
        return ruins;
    }
}
