package holon.simulation.game.submarine;

import org.junit.Test;
import static org.junit.Assert.*;

public class AirTank {
    private int airLevel = 25;
    public AirTank() {}

    int readGague() {
        return airLevel;
    }

    void breathFrom(int amount) {
        airLevel -= amount;
        if(airLevel < 0) airLevel = 0;
    }

}
