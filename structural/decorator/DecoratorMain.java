package structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        var goldCharacter = new GoldCharacter();
        goldCharacter.printCharacterDetails();//only 5* character

        System.out.println("----------");

        var weapon = new WeaponRefinement(goldCharacter);
        weapon.getRefinement5();//5* character with r5 weapon
        //can use many combinations from 4* char with r0 weapon
        // to 5* char with r5 weapon

        var purpleCharacter = new PurpleCharacter();
        purpleCharacter.printCharacterDetails();
        System.out.println("----------");
        var weapon2 = new WeaponRefinement(purpleCharacter);
        weapon2.getRefinement0();
    }
}
