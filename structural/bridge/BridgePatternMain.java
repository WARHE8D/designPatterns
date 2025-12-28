package structural.bridge;

public class BridgePatternMain {
    public static void main(String[] args) {
        System.out.println("Bridge Pattern");
        var sword = new Sword();
        sword.getWeaponType();
        var pyro = new Pyro();
        pyro.getElementType();
        //ths was simple but how do we link them?
        //if i create a class called PyroSword i link up both and get weapon type as well aas the element type
        // but when we have more types itd exponentially increase new classes.
        // A simpler way is that we add element type in the weapon interface, so each weapon has its own element type
        System.out.println("Weapon Generated using Bridge Pattern");
        var BridgeBow = new Bow(new Pyro());
        BridgeBow.getWeaponType();
        BridgeBow.getElementType().getElementType();

    }
}
