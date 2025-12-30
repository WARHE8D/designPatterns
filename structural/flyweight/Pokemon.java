package structural.flyweight;

public class Pokemon {
    private final String name;

    public Pokemon(String name) {
        this.name = name;
    }

    public void renderPosition(int x, int y) {
        System.out.printf("A wild %s appeared at %d, %d%n", name, x, y);
    }
}
