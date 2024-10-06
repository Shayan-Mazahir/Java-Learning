//Task 3
//Author: Shayan mazahir
//Date of Last Edit: 6 October, 2024
float circle1X; // X position for the first circle
float circle1Y; // Y position for the first circle
float circle2X; // X position for the second circle
float circle2Y; // Y position for the second circle
float diameter1 = 0; // Diameter for the first circle
float diameter2 = 0; // Diameter for the second circle

void setup() {
  size(600, 600);
  noStroke(); // Remove stroke for circles
  circle1X = width; // Start from the right side
  circle1Y = height / 2; // Middle of the height
  circle2X = width / 2; // Middle of the width
  circle2Y = 0; // Start from the top
  colorMode(HSB); // Set color mode to HSB
}

//drawMovingCircle1() -> void
//purpose: Function to draw the first circle
void drawMovingCircle1() {
  diameter1 += 0.5; // Increase the diameter
  float hue1 = (diameter1 * 2) % 360; // Calculate hue for the first circle
  fill(hue1, 255, 255); // Set color using HSB
  circle(circle1X, circle1Y, diameter1); // Draw the circle
  circle1X -= 2; // Move circle left
  
  // If it goes off-screen, reset to the right
  if (circle1X < 0) {
    circle1X = width;
    diameter1 = 0; // Reset diameter when it reappears
  }
}

//drawMovingCircle2() -> void
// Function to draw the second circle
void drawMovingCircle2() {
  diameter2 += 0.5; // Increase the diameter
  float hue2 = (diameter2 * 2) % 360; // Calculate hue for the second circle
  fill(hue2, 255, 255); // Set color using HSB
  circle(circle2X, circle2Y, diameter2); // Draw the circle
  circle2Y += 2; // Move circle down
  
  // If it goes off-screen, reset to the top
  if (circle2Y > height) {
    circle2Y = 0;
    diameter2 = 0; // Reset diameter when it reappears
  }
}

void draw() {
  drawMovingCircle1(); // Call the function to draw the first circle
  drawMovingCircle2(); // Call the function to draw the second circle
}
