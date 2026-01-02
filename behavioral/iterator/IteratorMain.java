package behavioral.iterator;

public class IteratorMain {
    public static void main(String[] args) {
        Champions.ChampType marksman = Champions.ChampType.MARKSMAN;
        Champions.ChampType mage = Champions.ChampType.MAGE;
        Champions.ChampType bruiser = Champions.ChampType.BRUISER;

        Champions twitch = new Champions("Twitch", marksman);
        Champions caitlyn = new Champions("Caytyn", marksman);
        Champions lux = new Champions("Lux", mage);
        Champions fiora = new Champions("fiora", bruiser);
        Champions jayce = new Champions("Jayce", bruiser);
        Champions jax = new Champions("Jax", bruiser);

        ChampPool myPool = new ChampPool(twitch, caitlyn, fiora, lux,
                jayce, jax, twitch);

        for (Champions champion : myPool) {
            System.out.printf("%s %s%n", champion.getName(), champion.getType());
        }

    }
}
