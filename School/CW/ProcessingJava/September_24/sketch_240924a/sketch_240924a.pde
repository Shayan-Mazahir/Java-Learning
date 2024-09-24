/*
Name: Shayan Mazahir
 Description: Drawing a house
 Date of last edit: September 24
 */
//da main guy
void setup() {
  //setting uo our canvas
  size(900, 900);
  //setting our background colour
  background(200);
}

//house
public void drawHouse(int houseX, int houseY) {
  //floppy disk (house)
  //giving house some colour
  fill(255, 0, 0);
  //giviing house some stroke
  stroke(255, 0, 0);
  //x-axis, y-axis, width, height
  rect(houseX, houseY, 80, 90);

  //door for house
  //giving the colour for doore
  fill(255, 255, 255);
  stroke(0);
  //x-axis, y-axis, width, height
  rect(houseX + 20, houseY + 45, 30, 45);

  //the knob
  fill(0);
  stroke(0);
  circle(houseX + 22, houseY + 70, 5);

  //roof
  triangle(houseX, houseY, houseX + 80, houseY, houseX + 40, houseY - 30);
}

//sun
public void sun(int sunX, int sunY, int diameter) {
  //circle sun
  fill(255, 255, 0);
  stroke(255, 255, 0);
  //x, y, radius
  circle(sunX, sunY, diameter);

  //sun rays
  //x1, y1, x2, y2
  line(sunX - 80, sunY + 30, sunX + 80, sunY - 50);
  line(sunX - 100, sunY + 50, sunX + 100, sunY - 70);
}

//grass
public void grass(int grassX, int grassY, int grassWidth, int grassHeight) {
  //making the grass
  //colour for the grass
  fill(0, 255, 0);
  //giving the rectangle a stroke... (changing line colours)
  stroke(0, 255, 0);
  //x-axis, y-axis, width, height
  rect(grassX, grassY, grassWidth, grassHeight);
}

//grass
public void cloud(int circle_x, int circle_y, int circle_diameter) {
  //circle(x, y, extent)
  noStroke();

  strokeWeight(4);
  fill(255, 255, 255);
  circle(circle_x, circle_y, circle_diameter);
  circle(circle_x - 50, circle_y, circle_diameter);
  circle(circle_x - 13, circle_y + 50, circle_diameter);
  circle(circle_x - 60, circle_y + 50, circle_diameter);
  circle(circle_x + 30, circle_y + 50, circle_diameter);
}
//loopy loop guy
void draw() {

  cloud(350, 50, 60);
  cloud(400, 90, 80);
  sun(100, 250, 200);
  grass(0, 200, 399, 250);
  drawHouse(250, 300);
}
