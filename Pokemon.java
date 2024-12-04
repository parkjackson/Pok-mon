package src;
import java.util.List;
import java.util.ArrayList;

public class Pokedex {
    // Inner class representing a Pokémon
    static class Pokemon {
        String name;
        String color;
        int height; // in cm
        int evolutionStage; // 1 for first evolution, 2 for second, etc.
        

        public Pokemon(String name, String color, int height, int evolutionStage) {
            this.name = name;
            this.color = color;
            this.height = height;
            this.evolutionStage = evolutionStage;
        }
    }

static class ListOfPokemon {
    public java.util.List<Pokemon> pokemonList; // Use List interface for flexibility
    public ListOfPokemon() {
        pokemonList = new ArrayList<>();
        initializePokedex(); // Populate the Pokedex
    }
    public List<Pokemon> getPokedex() {
        return pokemonList;
    }
    public int size(){
        return pokemonList.size();
    }
        //initializing pokedex with pokemon
    public void initializePokedex() {
        pokemonList.add(new Pokemon("Bulbasaur", "Green", 70, 1));
        pokemonList.add(new Pokemon("Ivysaur", "Green", 100, 2));
        pokemonList.add(new Pokemon("Venusaur", "Green", 200, 3));
        pokemonList.add(new Pokemon("Charmander", "Red", 60, 1));
        pokemonList.add(new Pokemon("Charmeleon", "Red", 110, 2));
        pokemonList.add(new Pokemon("Charizard", "Red", 170, 3));
        pokemonList.add(new Pokemon("Squirtle", "Blue", 50, 1));
        pokemonList.add(new Pokemon("Wartortle", "Blue", 100, 2));
        pokemonList.add(new Pokemon("Blastoise", "Blue", 160, 3));
        pokemonList.add(new Pokemon("Caterpie", "Green", 30,1));
        pokemonList.add(new Pokemon("Metapod",  "Green", 70,2));
        pokemonList.add(new Pokemon("Butterfree", "Purple", 110,3));
        pokemonList.add(new Pokemon("Weedle",  "Yellow", 30,1));
        pokemonList.add(new Pokemon("Kakuna",  "Yellow", 60,2));
        pokemonList.add(new Pokemon("Beedrill",  "Yellow", 100,3));
        pokemonList.add(new Pokemon("Pidgey",  "Brown", 30,1));
        pokemonList.add(new Pokemon("Pidgeotto",  "Brown", 110,2));
        pokemonList.add(new Pokemon("Pidgeot", "Brown", 150,3));
        pokemonList.add(new Pokemon("Rattata", "Purple", 30,1));
        pokemonList.add(new Pokemon("Raticate", "Brown", 70,2));
        pokemonList.add(new Pokemon("Spearow","Brown", 30,1));
        pokemonList.add(new Pokemon("Fearow", "Brown", 120,2));
        pokemonList.add(new Pokemon("Ekans", "Purple", 200,1));
        pokemonList.add(new Pokemon("Arbok",  "Purple", 350,2));
        pokemonList.add(new Pokemon("Pikachu","Yellow", 40,1));
        pokemonList.add(new Pokemon("Raichu",  "Orange", 80,2));
        pokemonList.add(new Pokemon("Sandshrew","Yellow", 60,1));
        pokemonList.add(new Pokemon("Sandslash","Yellow", 100,2));
        pokemonList.add(new Pokemon("Nidoran F", "Blue", 40,1));
        pokemonList.add(new Pokemon("Nidorina","Blue", 80,2));
        pokemonList.add(new Pokemon("Nidoqueen", "Blue", 130,3));
        pokemonList.add(new Pokemon("Nidoran M","Purple", 50,1));
        pokemonList.add(new Pokemon("Nidorino",  "Purple", 90,2));
        pokemonList.add(new Pokemon("Nidoking", "Purple", 140,3));
        pokemonList.add(new Pokemon("Clefairy",  "Pink", 60,1));
        pokemonList.add(new Pokemon("Clefable", "Pink", 130,2));
        pokemonList.add(new Pokemon("Vulpix", "Brown", 60,1));
        pokemonList.add(new Pokemon("Ninetales","Yellow", 110,2));
        pokemonList.add(new Pokemon("Jigglypuff", "Pink", 50,1));
        pokemonList.add(new Pokemon("Wigglytuff", "Pink", 100,2));
        pokemonList.add(new Pokemon("Zubat", "Purple", 80,1));
        pokemonList.add(new Pokemon("Golbat","Purple", 160,2));
        pokemonList.add(new Pokemon("Oddish","Blue", 50,1));
        pokemonList.add(new Pokemon("Gloom", "Blue", 80,2));
        pokemonList.add(new Pokemon("Vileplume", "Red", 120,3));
        pokemonList.add(new Pokemon("Paras", "Orange", 30,1));
        pokemonList.add(new Pokemon("Parasect","Orange", 100,2));
        pokemonList.add(new Pokemon("Venonat", "Purple", 100,1));
        pokemonList.add(new Pokemon("Venomoth",  "Purple", 150,2));
        pokemonList.add(new Pokemon("Diglett", "Brown", 20,1));
        pokemonList.add(new Pokemon("Dugtrio", "Brown", 70,2));
        pokemonList.add(new Pokemon("Meowth", "Yellow", 40,1));
        pokemonList.add(new Pokemon("Persian", "Yellow", 100,2));
        pokemonList.add(new Pokemon("Psyduck", "Yellow", 80,1));
        pokemonList.add(new Pokemon("Golduck","Blue", 170,2));
        pokemonList.add(new Pokemon("Mankey", "Brown", 50,1));
        pokemonList.add(new Pokemon("Primeape",  "Brown", 100,2));
        pokemonList.add(new Pokemon("Growlithe",  "Orange", 70,1));
        pokemonList.add(new Pokemon("Arcanine","Orange", 190,2));
        pokemonList.add(new Pokemon("Poliwag", "Blue", 60,1));
        pokemonList.add(new Pokemon("Poliwhirl", "Blue", 100,2));
        pokemonList.add(new Pokemon("Poliwrath",  "Blue", 130,3));
        pokemonList.add(new Pokemon("Abra", "Yellow", 90,1));
        pokemonList.add(new Pokemon("Kadabra",  "Yellow", 130,2));
        pokemonList.add(new Pokemon("Alakazam", "Yellow", 150,0));
        pokemonList.add(new Pokemon("Machop",  "Gray", 80,1));
        pokemonList.add(new Pokemon("Machoke",  "Gray", 150,2));
        pokemonList.add(new Pokemon("Machamp", "Gray", 160,3));
        pokemonList.add(new Pokemon("Bellsprout", "Yellow", 70,1));
        pokemonList.add(new Pokemon("Weepinbell","Green", 100,2));
        pokemonList.add(new Pokemon("Victreebel",  "Green", 170,0));
        pokemonList.add(new Pokemon("Tentacool", "Blue", 90,1));
        pokemonList.add(new Pokemon("Tentacruel", "Purple", 160,2));
        pokemonList.add(new Pokemon("Geodude", "Gray", 40,1));
        pokemonList.add(new Pokemon("Graveler", "Gray", 100,2));
        pokemonList.add(new Pokemon("Golem", "Brown", 140,3));
        pokemonList.add(new Pokemon("Ponyta", "Orange", 80,1));
        pokemonList.add(new Pokemon("Rapidash", "Orange", 170,2));
        pokemonList.add(new Pokemon("Slowpoke", "Pink", 120,1));
        pokemonList.add(new Pokemon("Slowbro", "Pink", 160,2));
        pokemonList.add(new Pokemon("Magnemite", "Gray", 30,1));
        pokemonList.add(new Pokemon("Magneton", "Gray", 100,2));
        pokemonList.add(new Pokemon("Farfetch'd", "Brown", 60,1));
        pokemonList.add(new Pokemon("Doduo",  "Brown", 140,1));
        pokemonList.add(new Pokemon("Dodrio", "Brown", 180,2));
        pokemonList.add(new Pokemon("Seel", "White", 110,1));
        pokemonList.add(new Pokemon("Dewgong", "White", 170,2));
        pokemonList.add(new Pokemon("Grimer", "Purple", 90,1));
        pokemonList.add(new Pokemon("Muk","Purple", 120,2));
        pokemonList.add(new Pokemon("Shellder", "Purple", 30,1));
        pokemonList.add(new Pokemon("Cloyster", "Purple", 150,2));
        pokemonList.add(new Pokemon("Gastly", "Purple", 130,1));
        pokemonList.add(new Pokemon("Haunter", "Purple", 160,2));
        pokemonList.add(new Pokemon("Gengar", "Purple", 150,3));
        pokemonList.add(new Pokemon("Onix","Gray", 880,1));
        pokemonList.add(new Pokemon("Drowzee", "Yellow", 60,1));
        pokemonList.add(new Pokemon("Hypno", "Yellow", 160,2));
        pokemonList.add(new Pokemon("Krabby", "Red", 40,1));
        pokemonList.add(new Pokemon("Kingler","Red", 130,2));
        pokemonList.add(new Pokemon("Voltrob","Red", 50,1));
        pokemonList.add(new Pokemon("Electrode","Red", 120,2));
        pokemonList.add(new Pokemon("Exeggcute", "Green", 40,1));
        pokemonList.add(new Pokemon("Exeggutor", "Yellow", 200,2));
        pokemonList.add(new Pokemon("Cubone", "Brown", 40,1));
        pokemonList.add(new Pokemon("Marowak",  "Brown", 100,2));
        pokemonList.add(new Pokemon("Hitmonlee",  "Brown", 150,1));
        pokemonList.add(new Pokemon("Hitmonchan",  "Brown", 140,1));
        pokemonList.add(new Pokemon("Lickitung", "Pink", 120,1));
        pokemonList.add(new Pokemon("Koffing", "Purple", 60,1));
        pokemonList.add(new Pokemon("Weezing",  "Purple", 120,2));
        pokemonList.add(new Pokemon("Rhyhorn",  "Gray", 80,1));
        pokemonList.add(new Pokemon("Rhydon",  "Gray", 100,2));
        pokemonList.add(new Pokemon("Chansey","Pink", 110,1));
        pokemonList.add(new Pokemon("Tangela", "Blue", 100,1));
        pokemonList.add(new Pokemon("Kangaskhan", "Brown", 220,1));
        pokemonList.add(new Pokemon("Horsea", "Blue", 40,1));
        pokemonList.add(new Pokemon("Seadra",  "Blue", 120,2));
        pokemonList.add(new Pokemon("Goldeen",  "Orange", 60,1));
        pokemonList.add(new Pokemon("Seaking","Orange", 130,2));
        pokemonList.add(new Pokemon("Staryu","Red", 80,1));
        pokemonList.add(new Pokemon("Starmie", "Purple", 110,2));
        pokemonList.add(new Pokemon("Mr. Mime", "Pink", 130,1));
        pokemonList.add(new Pokemon("Scyther", "Green", 150,1));
        pokemonList.add(new Pokemon("Jynx", "Purple", 140,1));
        pokemonList.add(new Pokemon("Electabuzz","Yellow", 110,1));
        pokemonList.add(new Pokemon("Magmar", "Red", 130,1));
        pokemonList.add(new Pokemon("Pinsir","Green", 150,1));
        pokemonList.add(new Pokemon("Tauros","Brown", 140,1));
        pokemonList.add(new Pokemon("Magikarp", "Orange", 90,1));
        pokemonList.add(new Pokemon("Gyarados",  "Blue", 650,2));
        pokemonList.add(new Pokemon("Lapras", "Blue", 250,1));
        pokemonList.add(new Pokemon("Ditto", "Purple", 30,1));
        pokemonList.add(new Pokemon("Eevee", "Brown", 30,1));
        pokemonList.add(new Pokemon("Vaporeon", "Blue", 100,2));
        pokemonList.add(new Pokemon("Jolteon",  "Yellow", 80,2));
        pokemonList.add(new Pokemon("Flareon", "Orange", 90,2));
        pokemonList.add(new Pokemon("Porygon", "Red", 80,1));
        pokemonList.add(new Pokemon("Omanyte", "Blue", 40,1));
        pokemonList.add(new Pokemon("Omastar", "Blue", 100,2));
        pokemonList.add(new Pokemon("Kabuto", "Orange", 50,1));
        pokemonList.add(new Pokemon("Kabutops", "Orange", 130,2));
        pokemonList.add(new Pokemon("Aerodactyl", "Gray", 180,1));
        pokemonList.add(new Pokemon("Snorlax", "Blue", 210,1));
        pokemonList.add(new Pokemon("Articuno", "Blue", 170,1));
        pokemonList.add(new Pokemon("Zapdos", "Yellow", 160,1));
        pokemonList.add(new Pokemon("Moltres", "Fire", 200,1));
        pokemonList.add(new Pokemon("Dratini", "Blue", 180,1));
        pokemonList.add(new Pokemon("Dragonair", "Blue", 400,2));
        pokemonList.add(new Pokemon("Dragonite", "Orange", 220,0));
        pokemonList.add(new Pokemon("Mewtwo", "Purple", 200,1));
        pokemonList.add(new Pokemon("Mew", "Purple", 40,1));
        }
    }
}
