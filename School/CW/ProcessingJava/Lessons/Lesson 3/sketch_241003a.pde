//Title: Lesson 3
//Author: Shayan Mazahir
//Date of last Edit: 03 October, 2024
void setup() {
  size(500, 500);
  background(255);
}

void draw() {

  float diameter = 20;
  float color_red = random(0, 255);
  float color_green = random(0, 255);
  float color_blue = random(0, 255);
  float rectangle_x = 0;
  float rectangle_y = 0;
  float rectangle_width = random(0, 200);
  float rectangle_height = random(0, 200);

  fill(color_red, color_green, color_blue);
  stroke(color_red, color_green, color_blue);
  //circle(x, y, extent)
  circle(random(0, 500), random(0, 500), diameter);
  
  if (mousePressed) {
    background(255);
  }
  
  if (keyPressed) {
    //rect(x, y, width, height)
    rect(rectangle_x, rectangle_y, rectangle_width, rectangle_height);
  }
}
