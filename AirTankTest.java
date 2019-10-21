package holon.simulation.game.submarine;

import org.junit.Test;
import static org.junit.Assert.*;

public class AirTankTest {
    @Test public void readGague() {
        AirTank tank = new AirTank();
        assertEquals(25, tank.readGague());
    }

    @Test public void breathFrom() {
        AirTank tank = new AirTank();
        tank.breathFrom(10);
        assertEquals(15, tank.readGague());
    }
}
