// Author: Shayan Mazahir
// Date of Last Edit: 06 October, 2024
// Lesson 5

float x_1 = 0;  // top circle x
float y_1 = 0;  // top circle y
float d_1 = 10; // top circle diameter

float x_2 = 0;  // bottom circle x
float y_2;      // bottom circle y (initialize in setup)
float d_2 = 20; // bottom circle diameter

void setup() {
  size(500, 500); // Window size
  background(204, 255, 204);  // Background color
  y_2 = height;  // Set bottom circle's initial y position to window height
}

//drawTopCircle() -> nothing
//Purpose: Function to handle the top circle logic
void drawTopCircle() {
  stroke(0);
  circle(x_1, y_1, d_1);
  x_1 += 1;
  y_1 += 6;

  if (y_1 > height / 2) {
    y_1 = 0;  // Reset if the circle passes halfway down the screen
  }
  if (x_1 > width) {
    x_1 = 0;  // Reset if the circle moves beyond the screen width
  }
}

//drawBottomCircle() -> void
// Function to handle the bottom circle logic
void drawBottomCircle() {
  stroke(0);
  circle(x_2, y_2, d_2);
  x_2 += 0.5;
  y_2 -= 7;

  if (y_2 < height / 2) {
    y_2 = height;  // Reset if the circle moves past the middle of the screen
  }
  if (x_2 > width) {
    x_2 = 0;  // Reset if the circle moves beyond the screen width
  }
}

void draw() {
  stroke(0, 255, 0);
  
  // Draw center line
  line(0, height / 2, width, height / 2);

  // Draw the top and bottom circles
  drawTopCircle();
  drawBottomCircle();
}
