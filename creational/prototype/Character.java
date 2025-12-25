package creational.prototype;

public class Character implements GenshinCharacter {

    private String name;
    private CharacterElement characterElement;
    private long baseAtk;

    public Character(String name, CharacterElement characterElement, long baseAtk) {
        this.name = name;
        this.characterElement = characterElement;
        this.baseAtk = baseAtk;
    }

    public long getBaseAtk() {
        return baseAtk;
    }

    public void setBaseAtk(long baseAtk) {
        this.baseAtk = baseAtk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterElement getCharacterElement() {
        return characterElement;
    }

    public void setCharacterElement(CharacterElement characterElement) {
        this.characterElement = characterElement;
    }

    @Override
    public Character clone() {
        return new Character(this.getName(), this.getCharacterElement(), this.getBaseAtk());
    }

    @Override
    public void display() {
        System.out.println("Character{" +
                "name='" + name + '\'' +
                ", characterElement=" +
                characterElement +
                ", baseAtk=" + baseAtk + '}');
    }
}
