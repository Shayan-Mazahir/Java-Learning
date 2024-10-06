// Lesson 6
// Author: Shayan Mazahir
// Date of Last Edit: 06 October, 2024

float circle_out_diam = 50; // Black circle diameter
float circle_in_diam = 70;  // White circle diameter
color circle_out_color = color(0); // Initial color of the black circle (black)

void setup(){
  size(500, 500);
  background(150);
}

void draw(){
  // Outer circle (black initially)
  float circle_out_x = width / 2;
  float circle_out_y = height / 2;
  
  // Inner circle (white)
  float circle_in_x = width / 2;
  float circle_in_y = height / 2;

  // Background reset
  background(150);

  // Draw white circle behind
  fill(255);
  stroke(255);
  circle(circle_in_x, circle_in_y, circle_in_diam);
  
  // Draw black circle (or current color)
  fill(circle_out_color);
  stroke(circle_out_color);
  circle(circle_out_x, circle_out_y, circle_out_diam);
}

// Function to handle key press events
void keyPressed() {
  // Adjust white circle diameter with '+' and '-'
  if (key == '+') {
    circle_in_diam += 5;
  } else if (key == '-') {
    circle_in_diam -= 5;
    if (circle_in_diam < 0) {
      circle_in_diam = 0;  // Ensure the diameter doesn't go negative
    }
  }

  // Change black circle color
  if (key == 'r') {
    circle_out_color = color(255, 0, 0);  // Red
  } else if (key == 'g') {
    circle_out_color = color(0, 255, 0);  // Green
  } else if (key == 'b') {
    circle_out_color = color(0, 0, 255);  // Blue
  } else if (key == ENTER || key == ENTER) {
    circle_out_color = color(0);  // Black on pressing Enter
  }
}
