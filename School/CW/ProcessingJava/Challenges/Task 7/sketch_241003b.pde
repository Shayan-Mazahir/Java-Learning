// Task 7
// Author: Shayan Mazahir
// Date of Last Edit: 06 October, 2024

void setup() {
  size(600, 600);
}

float x_axis = 300;  // Starting x position
float y_axis = 300;  // Starting y position

void draw() {
  background(255);
  
  // Draw the square
  fill(0);  // Default black fill
  rect(x_axis, y_axis, 40, 50);

  // Move the square with arrow keys
  if (keyPressed) {
    if (keyCode == LEFT) {
      x_axis -= 2;  // Move left
    } else if (keyCode == RIGHT) {
      x_axis += 2;  // Move right
    } else if (keyCode == UP) {
      y_axis -= 2;  // Move up
    } else if (keyCode == DOWN) {
      y_axis += 2;  // Move down
    }
  }
}

//void mousePressed() {
//  // Check if the mouse is within the bounds of the square
//  if (mouseX > x_axis && mouseX < x_axis + 40 && mouseY > y_axis && mouseY < y_axis + 50) {
//    fill(0, 255, 0);  // Change to green if inside
//  } else {
//    fill(0); // Keep black if outside
//  }
//}

//void mouseReleased() {
//  // Redraw square in its original color when mouse is released
//  fill(0); // Reset to black
//  rect(x_axis, y_axis, 40, 50);
//}
