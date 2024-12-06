package src;

public class Pokemon {
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
