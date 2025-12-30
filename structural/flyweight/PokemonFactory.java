package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PokemonFactory {

    private static final Map<String, Pokemon> pokemonCache = new HashMap<>();

    public static Pokemon spawnPokemon(String name) {
        pokemonCache.computeIfAbsent(name, Pokemon::new);
        return pokemonCache.get(name);
    }
}
