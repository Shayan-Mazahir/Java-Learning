//task 7
void setup(){
  size(600, 600);
  fill(255);
}
//rect(a, b, c, d)\

float x_axis;
float y_axis;
void draw() {
  background(255);

  //x, y, width, height, angle, angle
  fill(255, 0, 255);
  rect(x_axis, y_axis, 40, 50);
  //x, y, width, height
  if (keyPressed && (keyCode == LEFT)) {
    x_axis -= 1;
  } else if (keyPressed && (keyCode == RIGHT)) {
    x_axis += 1;
  } else if (keyPressed && (keyCode == UP)) {
    y_axis -= 1;
  } else if (keyPressed && (keyCode == DOWN)) {
    y_axis += 1;
  }


}
