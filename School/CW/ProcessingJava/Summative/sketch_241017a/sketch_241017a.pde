// Author: Shayan Mazahir
// Assignment: PAC-MAN
// Date Of Last Edit: 17 October, 2024

// Variables for Pac-Man's position and size
int circle_y = 20;     
int circle_x = 20;       
int circle_diam = 30;    

// Variable to track whether the game has started
boolean gameStarted = false; 

// Food variables to hold positions of food dots
int food1_x, food1_y; 
int food2_x, food2_y; 
int food3_x, food3_y; 
int foodCount = 3; 

// Game control variables
boolean drawGrid = false; // Controls whether to draw the triangle grid

void setup() {
  size(672, 864);  
  background(0);   
  spawnFood();
}

//showStartScren() -> void
// Purpose: Function to display the start screen
public void showStartScreen() {
  background(0);  // Set the background to black
  fill(255);    // Set text colour to white
  textSize(32);   // Set text size
  textAlign(CENTER, CENTER); // Center-align the text
  text("Press S to start the game", width / 2, height / 2);  // Display message
}

//playGame() -> void
// Purpose: The main game
public void playGame() {
  background(0);  // Set black background for the game

  // Draw Pac-Man
  fill(255, 255, 0);
  circle(circle_x, circle_y, circle_diam); 

  // Draw food dots
  drawFood(); 

  // Move Pac-Man based on arrow key presses
  if (keyPressed) {

    if (keyCode == UP && (circle_y > 0) && (circle_diam / 2 < circle_y)) {
      circle_y -= 1; // Move Pac-Man up
    } else if (keyCode == DOWN && (circle_y < height - (circle_diam / 2))) {
      circle_y += 1; // Move Pac-Man down
    } else if (keyCode == LEFT && (circle_x > 0) && (circle_diam / 2 < circle_x)) {
      circle_x -= 1; // Move Pac-Man left
    } else if (keyCode == RIGHT && (circle_x < width - (circle_diam / 2))) {
      circle_x += 1; // Move Pac-Man right
    }
  }

  // Check for mouse interactions to move Pac-Man
  if (mousePressed) {
    if (mouseButton == RIGHT) {
      // Move Pac-Man to a random position if right mouse button is pressed
      circle_x = (int) random(10, width - 10);
      circle_y = (int) random(10, height - 10);
    }
  }
}

//drawTriangleGrid() -> void
// Purpose: Function to draw a grid of colourful triangles when 's' is pressed
public void drawTriangleGrid() {
  int triSize = 40;  // Size of each triangle
  // Nested loops to create a grid of triangles
  for (int x = 0; x < width; x += triSize) {
    for (int y = 0; y < height; y += triSize) {
      fill(random(255), random(255), random(255));  // Set a random colour for each triangle
      triangle(x, y, x + triSize / 2, y + triSize, x + triSize, y);  
    }
  }
}

//spawnFood() -> void
// Purpose: Function to spawn food at random positions
public void spawnFood() {
  // Randomly set positions for each food dot
  food1_x = (int) random(10, width - 10);
  food1_y = (int) random(10, height - 10);

  food2_x = (int) random(10, width - 10);
  food2_y = (int) random(10, height - 10);

  food3_x = (int) random(10, width - 10);
  food3_y = (int) random(10, height - 10);
}

//drawFood() -> void
// Purpose: Function to draw food dots
public void drawFood() {
  fill(255, 0, 0); // Set colour to red for food
  // Draw each food dot
  ellipse(food1_x, food1_y, 10, 10); 
  ellipse(food2_x, food2_y, 10, 10); 
  ellipse(food3_x, food3_y, 10, 10); 
}

void draw() {
  // Check if the game has started
  if (!gameStarted) {
    showStartScreen();
  } else {
    playGame(); // Call the function to play the game
  }
  if (keyPressed) {
    if (key == 's') {
      drawTriangleGrid();
    }
  }
}


void keyPressed() {
  // Start the game if 'S' is pressed
  if (key == 'S') {
    gameStarted = true; 
  }
}


void mousePressed() {
  // Change the background color to random for an instance
  if (mouseButton == LEFT) {
    background(random(0, 255), random(0, 255), random(0, 255), 100);
  }
}
