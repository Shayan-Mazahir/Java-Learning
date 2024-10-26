package School.Assignments.Uml_to_Class;

// Main class to test GameState
public class Main {
    public static void main(String[] args) {
        // Create an instance of GameState
        GameState game = new GameState(5, 1, 1); // 5 levels, starting at level 1, with difficulty 1

        // Print initial game state
        System.out.println("Initial Game State:");
        System.out.println(game);

        // Increase difficulty
        game.increaseDifficulty();
        System.out.println("\nAfter Increasing Difficulty:");
        System.out.println(game);

        // Decrease difficulty
        game.decreaseDifficulty();
        System.out.println("\nAfter Decreasing Difficulty:");
        System.out.println(game);

        // Restart game
        game.restartGamey();
        System.out.println("\nAfter Restarting Game:");
        System.out.println(game);

        // Move to next level
        game.nextLevel();
        System.out.println("\nAfter Going to Next Level:");
        System.out.println(game);

        // Calculate percent complete
        double percentComplete = game.percentComplete();
        System.out.printf("Percent Complete: %.2f%%\n", percentComplete);
    }
}