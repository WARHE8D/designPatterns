package structural.bridge;

public class Sword implements WeaponType {
    private ElementType elementType;

    public Sword(ElementType elementType) {
        this.elementType = elementType;
    }

    //this just to keep the initial example
    public Sword() {
    }

    @Override
    public void getWeaponType() {
        System.out.println("Sword");
    }

    @Override
    public ElementType getElementType() {
        return elementType;
    }
}
