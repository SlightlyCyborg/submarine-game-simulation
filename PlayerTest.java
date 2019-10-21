package holon.simulation.game.submarine;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    @Test public void testToString() {
    AirTank tank = new AirTank();
        Player p = new Player("Collin", tank);
        p.gainRuin(4);
        p.storeRuins();
        p.gainRuin(3);
        p.gainRuin(2);
        p.storeRuins();
        p.gainRuin(3);
        p.gainRuin(2);

        String expected = "";
        expected += "Collin:\n";
        expected += "   InventoryRuins: 2 3\n";
        expected += "   StashedRuins:   2 3 4\n";

        assertEquals(expected, p.toString());
    }

    @Test public void numRuinsOnPerson() {
        AirTank tank = new AirTank();
        Player p = new Player("Collin", tank);

        int zero = p.numRuinsOnPerson();
        p.gainRuin(1);
        int one = p.numRuinsOnPerson();
        p.gainRuin(1);
        int two = p.numRuinsOnPerson();

        assertEquals(0, zero);
        assertEquals(1, one);
        assertEquals(2, two);
    }

    @Test public void breathReducesTankByRunesInInventory() {
        AirTank tank = new AirTank();
        Player p = new Player("Collin", tank);

        gainRuinThenBreathAndCheckGague(p, tank);
        gainRuinThenBreathAndCheckGague(p, tank);
    }

    public void gainRuinThenBreathAndCheckGague(Player p, AirTank tank) {
        int air = tank.readGague();
        p.gainRuin(1);
        p.breath();
        assertEquals(air-p.numRuinsOnPerson(), tank.readGague());
    }
}
