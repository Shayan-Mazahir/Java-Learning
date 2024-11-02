package School.Assignments.Uml_to_Class;

//Assignment: UML to Class
//Author: Shayan Mazahir
//Date of Last Edit: 25 October 2024
public class GameState {

    // attributes
    private int numLevels;
    private int currentLevel;
    private int difficulty;

    // constructor
    public GameState(int total_levels, int current_level, int difficulty){
        this.numLevels = total_levels;
        this.currentLevel = current_level;
        this.difficulty = difficulty;
    }

    // getters
    public int getnumLevels() {
        return this.numLevels;
    }
    public int getcurrentLevel() {
        return this.currentLevel;
    }
    public int getdifficulty(){
        return this.difficulty;
    }

    // setters
    public void setnumLevels(int numLevels) {
        this.numLevels = numLevels;
    }
    public void setcurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }
    public void setdifficulty(int difficulty){
        this.difficulty = difficulty;
    }

    //overrides
    @Override
    public String toString() {
        String output = " Total Number of Levels: " + numLevels + "\n Current Level: " + currentLevel + "\n Difficulty level: " + difficulty;
        return output;
    }

    public boolean equals(GameState other_game_state) {
        return (this.currentLevel == other_game_state.currentLevel) && (this.difficulty == other_game_state.difficulty) && (this.numLevels == other_game_state.numLevels);
    }

    public int compareTo(GameState other_game_state){
        // compare by difficulty, then currentLevel, then numLevels
        if (this.difficulty != other_game_state.difficulty) {
            return 1;
        } else if (this.currentLevel != other_game_state.currentLevel) {
            return -1;
        } else {
            return 0;
        }
    }

    //other methods
    public void increaseDifficulty() {
        this.difficulty += 1;
    }

    public void decreaseDifficulty() {
        this.difficulty -= 1;
    }

    public void restartGame() {
        this.difficulty = 1;
        this.currentLevel = 1;
    }

    public void nextLevel() {
        this.currentLevel += 1;
    }

    public double percentComplete() {
        double percent_complete = (this.currentLevel / this.numLevels) * 100;
        return  percent_complete;
    }
}

/*
* things to ask:
    public int compareTo(GameState other_game_state){
        // compare by difficulty, then currentLevel, then numLevels
        if (this.difficulty != other_game_state.difficulty) {
            return Integer.compare(this.difficulty, other_game_state.difficulty);
        } else if (this.currentLevel != other_game_state.currentLevel) {
            return Integer.compare(this.currentLevel, other_game_state.currentLevel);
        } else {
            return Integer.compare(this.numLevels, other_game_state.numLevels);
        }
    }
    * Integer.compare?
    * Override?
* */
