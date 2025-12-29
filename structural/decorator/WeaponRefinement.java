package structural.decorator;

public class WeaponRefinement extends CharacterDecorator {

    public WeaponRefinement(Character character) {
        super(character);
    }

    @Override
    public void printCharacterDetails() {
        super.printCharacterDetails();
    }

    public void getRefinement5() {
        super.printCharacterDetails();
        System.out.println("R5 Amos bow");
    }

    public void getRefinement0() {
        super.printCharacterDetails();
        System.out.println("R0 Amos bow");
    }
}
