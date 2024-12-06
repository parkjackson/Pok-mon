
package src;
import java.util.ArrayList;

public class recursion {
    
    public static ArrayList<Pokemon> remove(ArrayList<Pokemon> pokemonList, Pokemon targetPokemon, int i) {
        // Base case: if index is out of bounds, return the list
        if (i < 0) { 
            return pokemonList;
        }

        // Check if the current Pokémon matches the target Pokémon
        if (pokemonList.get(i).name.equalsIgnoreCase(targetPokemon.name)) {
            pokemonList.remove(i); // Remove the Pokémon at the current index
        }

        // Recursive call with the next index
        return remove(pokemonList, targetPokemon, i - 1);
    }
}
