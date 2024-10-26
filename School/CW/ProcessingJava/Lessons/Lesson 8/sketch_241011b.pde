int rec_width = 20;
int rec_height = 20;
int rec_y = 20;
int rec_x = 0;

// Initial diameter and opacity for the pink circle
float circleDiameter = 200; // Set initial diameter
float circleOpacity = 150; // Set initial opacity (0-255)

void setup() {
  size(800, 800);
  background(255, 255, 255);
}

void draw() {
  // Clear the background each frame
  background(255); 

  // Draw rectangles and circles in the top half
  while (rec_y <= height / 2) {
    while (rec_x <= width) {
      noStroke();
      rect(rec_x, rec_y, rec_width, rec_height); // No stroke for rectangles

      fill(0); // Black fill for circles
      stroke(0); // Add stroke for circles
      circle(rec_x + rec_width / 2, rec_y + rec_height / 2, 10); // Circle in the center of the rectangle
      
      noFill(); // Reset to no fill after the circle
      rec_x += rec_width;
    }
    rec_x = 0;
    rec_y += rec_height;
  }

  // Draw the pink circle in the middle of the bottom half
  float circleX = width / 2; // Centered on the x-axis
  float circleY = height * 3 / 4; // Positioned in the bottom half

  fill(255, 192, 203, (int)circleOpacity); // Pink color with opacity
  noStroke();
  circle(circleX, circleY, circleDiameter); // Draw the circle

  // Gradually decrease the diameter and opacity
  if (circleDiameter > 0) {
    circleDiameter -= 0.5; // Decrease the diameter by 0.5 each frame
  }

  if (circleOpacity > 0) {
    circleOpacity -= 1; // Gradually decrease opacity (1 unit per frame)
  }

  // Prevent the circle diameter and opacity from going negative
  if (circleDiameter < 0) {
    circleDiameter = 0;
  }

  if (circleOpacity < 0) {
    circleOpacity = 0;
  }
}
