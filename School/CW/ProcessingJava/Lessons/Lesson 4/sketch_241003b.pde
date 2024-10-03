//Title: Built in variables and methods
//date:
//Author: Shayan Mazahir

void setup() {
  size(600, 600);
  background(random(0, 255), random(0, 255), random(0, 255)); //grey scale if we have only 1
}

float circleX = 300;
float circleY = 600;
float circle_diameter = 100;

float circleX_2 = 0;
float circleY_2 = 0;
float circle_diameter_2 = 0;
void draw() {
  //background(random(0, 255), random(0, 255), random(0, 255));
  //circle 1
  fill(255);
  circle(circleX, circleY, circle_diameter);
  circleY = circleY - 1;
  circle_diameter = circle_diameter - 0.05;

  //circle 2
  circle(circleX_2, circleY_2, circle_diameter_2);
  circleX_2 = circleX_2 + 0.3;
  circleY_2 = circleY_2 + 0.3;
  circle_diameter_2 = circle_diameter_2 + 0.3;
}
