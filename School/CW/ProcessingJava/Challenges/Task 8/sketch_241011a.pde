void setup() {
  size(800, 800);
  background(255); // White background
  
  // Draw 100 random horizontal lines
  for (int i = 0; i < 100; i++) {
    float r = random(50); // Generate a random length factor
    stroke(r * 5); // Set stroke color based on random value
    line(50, i * 8, 50 + r, i * 8); // Draw the line with a random length
  }
}

void draw() {
  // No need to draw anything in the draw loop
}
