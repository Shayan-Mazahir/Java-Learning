//Lesson 5
//Author: Shayan Mazahir
void setup() {
  size(500, 500);
  background(255);
}

void draw() {
  float line_x_1 = 0;
  float line_y_1 = height/2;
  float line_x_2 = width;
  float line_y_2 = width/2;
  stroke(0, 255, 0);
  fill(0, 255, 0);
  //line(x1, y1, x2, y2)
  line(line_x_1, line_y_1, line_x_2, line_y_2);
  
  
}
