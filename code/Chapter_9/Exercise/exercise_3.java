package code.Chapter_9.Exercise;

import java.util.Scanner;
import java.util.Random;

class Game {
    private int number;
    private int noOfGuesses;

    public Game() {
        // Constructor to generate the random number
        Random rand = new Random();
        this.number = rand.nextInt(100) + 1;  // Generates a number between 1 and 100
        this.noOfGuesses = 0;
    }

    public void takeUserInput() {
        // Method to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the number (between 1 and 100): ");
        int userInput = scanner.nextInt();
        this.noOfGuesses++;
        checkNumber(userInput);
        scanner.close();
    }

    public void checkNumber(int userInput) {
        // Method to check if the guessed number is correct
        if (userInput == this.number) {
            System.out.println("Congratulations! You guessed the correct number in " + this.noOfGuesses + " guesses.");
        } else if (userInput < this.number) {
            System.out.println("Too low! Try again.");
            takeUserInput();
        } else {
            System.out.println("Too high! Try again.");
            takeUserInput();
        }
    }

    // Getter for noOfGuesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter for noOfGuesses
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
}

public class exercise_3 {
    public static void main(String[] args) {
        Game game = new Game(); // Creates a new Game instance
        game.takeUserInput(); // Starts the game
    }
}
