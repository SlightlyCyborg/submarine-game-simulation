package holon.simulation.game.submarine;

import org.junit.Test;
import static org.junit.Assert.*;

public class RuinTest {
    @Test public void getLevel() {
        Ruin r = new Ruin(2, 13);
        assertEquals(2, r.getLevel());
    }

    @Test public void getValue() {
        Ruin r = new Ruin(2, 13);
        assertEquals(13, r.getValue());
    }

    @Test public void levelMustBeGreaterThan0() {
        try {
            Ruin r = new Ruin(0, 13);
            fail("Should throw an exception");
        } catch (Exception e) {}
    }

    @Test public void levelMustBeLessThan5() {
        try {
            Ruin r = new Ruin(5, 13);
            fail("Should throw an exception");
        } catch (Exception e) {}
    }

    @Test public void valueMustBePositive() {
        try {
            Ruin r = new Ruin(2, -1);
            fail("Should throw an exception");
        } catch (Exception e) {}
    }

    @Test public void levelMustBeLessThan16() {
        try {
            Ruin r = new Ruin(2, 17);
            fail("Should throw an exception");
        } catch (Exception e) {}
    }
}
