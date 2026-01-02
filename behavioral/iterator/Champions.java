package behavioral.iterator;

public class Champions {
    private final String name;
    private final ChampType type;

    public Champions(String name, ChampType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public ChampType getType() {
        return type;
    }

    public enum ChampType {
        ASSASSIN, MARKSMAN, BRUISER, MAGE
    }
}


