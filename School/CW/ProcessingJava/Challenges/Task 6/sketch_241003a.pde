//Task 6
//Author: Shayan Mazahir
//Date of last Edit: 6 october, 2024
float circleX;  // X position of the circle
float circleY;  // Y position of the circle
float circleDiameter = 50;  // Diameter of the circle
float speedX;  // Speed of the circle in the X direction
float speedY;  // Speed of the circle in the Y direction

void setup() {
  size(600, 600);  // Set the window size
  circleX = width / 2;  // Start in the center
  circleY = height / 2;  // Start in the center
  speedX = random(2, 5);  // Random speed in the X direction
  speedY = random(2, 5);  // Random speed in the Y direction
}

void draw() {
  background(255);  // Clear the screen with a white background
  
  // Draw the circle
  fill(0, 0, 255);  // Set color to blue
  circle(circleX, circleY, circleDiameter);  // Draw the circle

  // Update the position
  circleX += speedX;  // Update X position
  circleY += speedY;  // Update Y position

  // Check for collision with walls
  if (circleX < circleDiameter / 2 || circleX > width - circleDiameter / 2) {
    speedX *= -1;  // Reverse X direction
  }
  if (circleY < circleDiameter / 2 || circleY > height - circleDiameter / 2) {
    speedY *= -1;  // Reverse Y direction
  }
}
