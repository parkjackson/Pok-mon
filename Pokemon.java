//IN PROGRESS

import java.util.Scanner;
import java.util.*; 

public class Pokemon {
    //fields
    private String name; //What's the pokemons name? 
    private String type; //What's the pokemons type? (fire bug ground etc)
    private String secondaryType; //Does the pokemon have a secondaryType? 
    private boolean firstEvolution; //does this pokemon have a first evolution?
    private boolean secondEvolution; //does this pokemon have a second evolution?
    private boolean thirdEvolution; //does this pokemon have a third evolution?
    private int height; //what is the height of the pokemon
  
}

class Pokemon {
    String name;
    String type;
    String evolutionStage;
    String color;
    double height; // Height in meters

    public Pokemon(String name, String type, String evolutionStage, String color, double height) {
        this.name = name;
        this.type = type;
        this.evolutionStage = evolutionStage;
        this.color = color;
        this.height = height;
    }
}

