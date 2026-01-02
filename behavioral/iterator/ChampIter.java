package behavioral.iterator;

import java.util.Iterator;

public class ChampIter implements Iterator<Champions> {

    private ChampPool champPool;
    private int index;

    public ChampIter(ChampPool champPool) {
        this.champPool = champPool;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        var champs = champPool.getChampions();

        return index < champs.length;
    }

    @Override
    public Champions next() {
        var champs = champPool.getChampions();
        while (index < champs.length) {
            Champions c = champs[index++];
            if (c.getType() == Champions.ChampType.MARKSMAN || c.getType() == Champions.ChampType.MAGE)
                return c;
        }
        return null;
    }

}
