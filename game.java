package src;
import java.util.*;
import javax.swing.*;


public class game{

        public static void main(String[] args) {
            

            //MENU 
            starts s = new starts();
            s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            s.setVisible(true);
            s.setSize(370, 450);
            s.setTitle("Pokemon Guessing Game!");;

            //putting color into terminal
            final String RESET = "\u001B[0m";
            final String RED = "\u001B[31m";
            final String GREEN = "\u001B[32m";
            final String YELLOW = "\u001B[33m";
            final String BLUE = "\u001B[34m";
            final String PINK = "\u001B[35m";
            final String CYAN = "\u001B[36m";

            //initialize pokedex
            Pokedex pokedex = new Pokedex();
            Pokedex.ListOfPokemon list = pokedex.new ListOfPokemon();
            List<Pokemon> pokedexList = list.getPokedex();
            

            // Game setup welcome text
            java.util.Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println();
            System.out.println(CYAN + "WELCOME" + RESET + " to the" + YELLOW + " Pokemon Guessing Game!" + RESET);
            System.out.println();
            System.out.println("Try to guess the " + PINK + "randomly chosen" + RESET + YELLOW + " Pokemon " + RESET + "from " + BLUE + "Generation One" + RESET + ".");
            System.out.println("You will get" + BLUE + " feedback" + RESET + " on your guesses to " + GREEN + "help you narrow it down." + RESET);
            System.out.println("For each " + GREEN + "correct " + RESET + "guess the" + YELLOW + " Pokemon " + RESET + "will be "  + RED + "removed " + RESET + ", get down to " + RED + " 0 " + RESET + YELLOW + "Pokemon " + RESET + "and you beat the game!");
            System.out.println("Type " + RED + "'exit' " + RESET + "to quit the game.");
            System.out.println();
            System.out.println();
        
            while (true) {
                // Randomly select a target Pokemon
                Random random = new Random();
                int i = pokedexList.size();
                if (pokedexList.isEmpty()) {        //first thing first, if list is empty that means you beat the game! so itll stop
                    System.out.println();
                    System.out.println(YELLOW + "Congratulations!" + RESET + " You've guessed all the Pokemon!" + CYAN + " ReRun the Program" + RESET+ " to Start Again!");
                    break;
                }
                Pokemon targetPokemon = pokedexList.get(random.nextInt(pokedexList.size())); //target pokemon = random pokemon
        
                boolean guessedCorrectly = false;
        
                while (!guessedCorrectly) {
                    // Prompt user for a guess
                    System.out.println(YELLOW + "Pokemon " + RESET +  "Left: " + i);
                    System.out.print("Enter your guess(" + RED + "example... " + RESET + GREEN + " Bulbasaur" + RESET + "): ");
                    String userGuess = scanner.nextLine().trim(); //next line waits for user to press enter before anything happens, trim allows for extra spaced to be cut (if user says "   pikachu" itll return "pikachu")
                    System.out.println();

                    //  the user can exit if they want
                    if (userGuess.equalsIgnoreCase("exit")) {
                        System.out.println();
                        System.out.println("Thanks for playing!");
                        scanner.close();
                         System.exit(0); //when exiting, status 0 means program ended without any problems
                    }
        
                    // Find guessed pokemon in the pokedex
                    Optional<Pokemon> guessedPokemonOpt = pokedexList.stream() //by converting the list to a stream we can use the filtering option
                            .filter(p -> p.name.equalsIgnoreCase(userGuess)) //this filter allows for the program to check if the pokemon (p) is the same as the user's guess but also makes it so a capitolized "Pikachu" is the same as a normal "pikachu" because it ignores capitolization
                            .findFirst(); //will find the first pokemon name that matches with the user guess 
                   
                        if (guessedPokemonOpt.isPresent()) {
                        Pokemon guessedPokemon = guessedPokemonOpt.get();
        
                        // Check if the guess is correct
                        if (guessedPokemon.name.equalsIgnoreCase(targetPokemon.name)) {
                            System.out.println();
                            System.out.println(GREEN + "Correct! You guessed the Pokémon: " + RESET + targetPokemon.name);
                            guessedCorrectly = true;
                            System.out.println("Starting a new round with a new Pokemon...");
                            System.out.println();
                            pokedexList = recursion.remove(new ArrayList<>(pokedexList), targetPokemon, pokedexList.size() - 1);
                        }
                            else {
                            // give feedback
                            System.out.println(RED + "Wrong Pokémon! Use these cluse to guess ur next Pokemon" + RESET);

                            //Evolution stage feedback
                            if(guessedPokemon.evolutionStage > targetPokemon.evolutionStage) {
                                System.out.println(PINK + "  Evolution Stage Match: " + RESET + "Your evolution stage is too" + RED + " HIGH!" + RESET);
                            }
                            else if(guessedPokemon.evolutionStage < targetPokemon.evolutionStage){
                                System.out.println(PINK + "  Evolution Stage Match: " + RESET + "Your evolution stage is too" + RED + " LOW!" + RESET);
                            }
                            else if(guessedPokemon.evolutionStage == targetPokemon.evolutionStage){
                                System.out.println(PINK + "  Evolution Stage Match: " + RESET + (guessedPokemon.evolutionStage == targetPokemon.evolutionStage));
                            }

                            //Color matching feedback
                            if(!guessedPokemon.color.equalsIgnoreCase(targetPokemon.color)){
                                System.out.println();
                                System.out.println(YELLOW + "  Color Match: " + RESET + guessedPokemon.name + " is " + guessedPokemon.color + " it " + RED + "DOES NOT" + RESET + " match the target Pokemon's color");
                            }
                            else if(guessedPokemon.color.equalsIgnoreCase(targetPokemon.color)) {
                                System.out.println();
                            System.out.println(YELLOW + "  Color Match: " + RESET + guessedPokemon.color.equalsIgnoreCase(targetPokemon.color));
                            }

                            //height feedback
                            if (guessedPokemon.height > targetPokemon.height) {
                                System.out.println();
                                System.out.println(CYAN + "  Height Match: " + RESET + "The height of " + guessedPokemon.name + " is" + RED + " taller than" + RESET + " the mystery Pokemon!");
                                System.out.println();
                                System.out.println();
                            } 
                            else if (guessedPokemon.height < targetPokemon.height) {
                                System.out.println();
                               System.out.println(CYAN + "  Height Match: " + RESET + "The height of " + guessedPokemon.name + " is" + RED + " shorter than" + RESET + " the mystery Pokemon!");
                               System.out.println();
                               System.out.println();
                            }
                            else if (guessedPokemon.height == targetPokemon.height) {
                                System.out.println();
                                System.out.println(CYAN + "  Height Match: " + RESET + (guessedPokemon.height == targetPokemon.height ));
                                System.out.println();
                                System.out.println();
                            }
                        }
                    }   
                        else {
                            System.out.println();
                            System.out.println(RED + "Pokemon not found in the list! Make sure you spell it correctly and try again." + RESET);
                            System.out.println();
                            System.out.println();
                            }
                    } 
                }            
            scanner.close();
        }
}
