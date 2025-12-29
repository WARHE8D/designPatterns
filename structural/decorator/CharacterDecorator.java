package structural.decorator;

public abstract class CharacterDecorator implements Character {
    private final Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }

    @Override
    public void printCharacterDetails() {
        character.printCharacterDetails();
    }
}
