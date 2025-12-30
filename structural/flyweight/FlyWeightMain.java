package structural.flyweight;

public class FlyWeightMain {
    public static void main(String[] args) {
        var pikachu = new Pokemon("Pikachu");
        pikachu.renderPosition(12, 32);
        System.out.println(pikachu);
        var pikachu1 = new Pokemon("Pikachu");
        pikachu.renderPosition(43, 12);
        System.out.println(pikachu1);//u see theres a different object created for the same pokemon

        // Reusing the same object and just updating its position:
        pikachu.renderPosition(-11, 20);
        System.out.println(pikachu);
        // ⚠️ This works ONLY if you need ONE Pikachu at a time.
        // The previous position is overwritten, so you cannot show
        // multiple Pikachus simultaneously.

        //now by using the flyweight patter we create a factory class that checks if the pokemon is already created
        //if so we can reuse that same object
        var charizard = PokemonFactory.spawnPokemon("Charizard");
        charizard.renderPosition(41, 52);
        System.out.println(charizard);

        var charizard1 = PokemonFactory.spawnPokemon("Charizard");
        charizard.renderPosition(-91, -23);
        System.out.println(charizard1);
        // the idea:
        // - Share ONE Pokémon object per name (e.g., "Charizard")
        // - Do NOT store position inside the object
        // - Pass position as extrinsic data when rendering
        // - Use a factory with computeIfAbsent to reuse existing Pokémon objects
        //
        // Result:
        // You can render many Charizard at different positions
        // without creating duplicate objects or overwriting state.

    }
}
