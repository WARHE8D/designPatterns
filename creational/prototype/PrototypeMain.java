package creational.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        System.out.println("Running Prototype Pattern code");
        CharacterElement anemo = CharacterElement.ANEMO;
        Character jahoda = new Character("Jahoda", anemo, 100);
        Character jahodaLev90 = jahoda.clone();
        jahodaLev90.setBaseAtk(432);
        Character jahodaEvil = jahoda.clone();
        jahodaEvil.setBaseAtk(888);
        jahodaEvil.setCharacterElement(CharacterElement.ABYSSAL_ENERGY);
        jahoda.display();
        jahodaLev90.display();
        jahodaEvil.display();
    }

}