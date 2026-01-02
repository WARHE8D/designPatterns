package behavioral.chain;

public class Resins {

    private ResinsType resinsType;

    public ResinsType getResinsType() {
        return resinsType;
    }

    public Resins(ResinsType resinsType) {
        this.resinsType = resinsType;
    }

    public enum ResinsType {
        ORIGINAL, CONDENSED, FRAGILE
    }
}
