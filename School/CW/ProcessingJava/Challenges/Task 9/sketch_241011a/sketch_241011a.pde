void setup() {
  size(800, 800);
  background(255); // White background
  noStroke(); // No stroke for the circles
}

void draw() {
  int spacing = 30; // Spacing between circles

  // Check if the mouse is moving backward (leftward or upward)
  if (mouseX < pmouseX || mouseY < pmouseY) {
    // If the mouse moves backward, erase the canvas
    background(255); // Reset to white background
  }

  // Draw diagonal pattern starting from the current mouse position
  float x = mouseX;
  float y = mouseY;

  // Draw circles diagonally as long as the mouse is moving forward
  while (x <= width && y <= height) {
    fill(255, 192, 203, 150); // Pink color with some transparency
    ellipse(x, y, 20, 20); // Draw circle at current (x, y) position

    // Increment x and y for the diagonal pattern
    x += spacing;
    y += spacing;
  }

  // Draw trailing circles diagonally behind the mouse
  for (int startX = mouseX - spacing; startX >= 0; startX -= spacing) {
    float xRow = startX;
    float yRow = mouseY;

    // Continue drawing circles in a diagonal row upward-left
    while (xRow <= width && yRow <= height) {
      fill(255, 192, 203, 150); // Pink color with some transparency
      ellipse(xRow, yRow, 20, 20); // Draw circle at current (xRow, yRow) position

      // Increment x and y for the diagonal pattern
      xRow += spacing;
      yRow += spacing;
    }
  }
}
