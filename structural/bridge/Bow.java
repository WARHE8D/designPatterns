package structural.bridge;

public class Bow implements WeaponType {
    private final ElementType elementType;

    public Bow(ElementType elementType) {
        this.elementType = elementType;
    }

    @Override
    public void getWeaponType() {
        System.out.println("Bow");
    }

    @Override
    public ElementType getElementType() {
        return elementType;
    }
}
