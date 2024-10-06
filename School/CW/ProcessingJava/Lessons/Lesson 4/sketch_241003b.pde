//Title: Built in variables and methods
//Date of last Edit: 06 October 2024:
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
  //decreasing the y axis while decreasing the diameter as well to make sure the circle gets small while going upwards
  circleY = circleY - 1;
  circle_diameter = circle_diameter - 0.05;

  //circle 2
  circle(circleX_2, circleY_2, circle_diameter_2);
  //increasing the X and Y axis so that the circle can move in a diagonal manner
  circleX_2 = circleX_2 + 0.3;
  circleY_2 = circleY_2 + 0.3;
  circle_diameter_2 = circle_diameter_2 + 0.3;
}
