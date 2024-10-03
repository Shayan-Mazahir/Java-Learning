//Task 3
//Author: Shayan Mazahir
//issue: circle not being in middle
void setup(){
  size(500, 800);
  background(150);

}

/*
            x-axis
        |--------------------------
        |            width/2, height = 0
        |
 y-axis |
        |
        |
*/

void draw() {
  float circle_x_1 = width/2;
  float circle_y_1 = 0;
  float circle_1_diam = 1;
  fill(0);
  stroke(0);
  //circle(x, y, extent)
  circle(circle_x_1, circle_y_1, circle_1_diam);
  circle_y_1 += 1;
  circle_1_diam += 1;
}
