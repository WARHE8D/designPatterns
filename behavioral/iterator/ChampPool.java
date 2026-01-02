package behavioral.iterator;

import java.util.Iterator;

public class ChampPool implements Iterable<Champions> {

    private final Champions[] champions;

    public ChampPool(Champions... champions) {//... is either a single champ of multiple csv or List or array
        this.champions = champions;
    }

    @Override
    public Iterator<Champions> iterator() {
        return new ChampIter(this);
    }

    public Champions[] getChampions() {
        return champions;
    }
}
