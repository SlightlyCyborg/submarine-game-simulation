package holon.simulation.game.submarine;

class Ruin {
    int level, value;

    public Ruin(int level, int value) {
        if(level < 1) throw new IllegalArgumentException();
        if(level > 4) throw new IllegalArgumentException();
        this.level = level;
        this.value = value;
    }

    public int getLevel() {
        return level;
    }

    public int getValue() {
        return value;
    }
}
