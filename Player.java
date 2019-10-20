package holon.simulation.game.submarine;

import java.util.Vector;
import java.util.Collections;

public class Player {

    String name;
    Vector<Integer> inventory;
    Vector<Integer> stash;

    public Player(String name) {
        this.name = name;
        inventory = new Vector<>();
        stash = new Vector<>();
    }

    public void gainRuin(int level) {
        inventory.add(level);
        Collections.sort(inventory);
    }

    public void storeRuins() {
        for(Integer item: inventory) {
            stash.add(item);
        }
        Collections.sort(stash);
        inventory.clear();
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("%s:\n", name));
        sb.append("   InventoryRuins:");
        for (Integer ruin: inventory) {
            sb.append(String.format(" %d", ruin));
        }
        sb.append("\n");
        sb.append("   StashedRuins:  ");
        for (Integer ruin: stash) {
            sb.append(String.format(" %d", ruin));
        }
        sb.append("\n");
        return sb.toString();
    }
}
