//Task 1
//Author: Shayan Mazahir
//Date of Last Edit: 6 October 2024
void setup() {
  size(600, 600);
  background(255);
}

void draw() {
  // Clear the background each frame
  background(255);
  
  // Set the stroke weight for arcs
  strokeWeight(10);
  
  // Draw arcs with different colors
  noFill(); // Ensure the arcs are not filled
  
  // Draw the arcs
  drawArc(height / 2, width / 2, 250, color(255, 0, 0));    // Red arc
  drawArc(height / 2, width / 2, 230, color(0, 255, 0));    // Green arc
  drawArc(height / 2, width / 2, 210, color(0, 0, 255));    // Blue arc
  drawArc(height / 2, width / 2, 190, color(255, 255, 0));  // Yellow arc
  drawArc(height / 2, width / 2, 170, color(255, 165, 0));  // Orange arc
  drawArc(height / 2, width / 2, 150, color(255, 105, 180)); // Pink arc
}

void drawArc(float x, float y, float diameter, color c) {
  stroke(c); // Set the stroke color
  arc(x, y, diameter, diameter, PI, TWO_PI); // Draw the arc
}
