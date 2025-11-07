package Module06;

public class Creature {
    private String name;

    public Creature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Creature creature) {
            return (name == null ? creature.name == null : name.equals(creature.name));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 0;

        hash = hash * 31 + (name == null ? 0 : name.hashCode());

        return hash;
    }
}
