package holon.simulation.game.submarine;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Vector;

public class RoundTest {
    @Test public void eachRoundHasRequiredRuins() {
        int[] valuesArr = {0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,13,14,14,15,15};
        int[] levelsArr = {1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4};
        Vector<Integer> values = new Vector<>();
        Vector<Integer> levels = new Vector<>();

        for(int value: valuesArr) {
            values.add(value);
        }
        for(int level: levelsArr) {
            levels.add(level);
        }

        Round round = new Round();
        List<Ruin> ruins = round.getRuins();

        boolean levelExists, valueExists;
        for(Ruin ruin: ruins) {
            levelExists = levels.remove((Integer)ruin.getLevel());
            valueExists = values.remove((Integer)ruin.getValue());
            assertTrue(levelExists);
            assertTrue(valueExists);
        }

        assertEquals(0, values.size());
        assertEquals(0, levels.size());
    }
}
