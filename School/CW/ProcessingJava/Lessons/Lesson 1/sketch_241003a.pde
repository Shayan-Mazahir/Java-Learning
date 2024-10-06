//Author: Shayan Mazahir
//Date of Last Edit: 05 October, 2024
//Lesson 1
void setup(){
  //setting up our canvas
  size(400, 400);
  //setting our background colour
  background(200);
}

//houseDraw(int houseX, int houseY, int houseWidth, int houseHeight) -> nothing
//purpose: draws a house with given co-ordinated
public void houseDraw(float houseX, float houseY, float houseWidth, float houseHeight) {
  //giving house some colour
  fill(255, 0, 0);
  //giving house some stroke
  stroke(255, 0, 0);
  //x-axis, y-axis, width, height
  rect(houseX, houseY, houseWidth, houseHeight);
  //rect(300, 160, 80, 90);
}

//drawDoor(float doorX, float doorY, float doorWidth, float doorHeight) -> nothing
//purpose: draws a rectangle for the door
public void drawDoor(float doorX, float doorY, float doorWidth, float doorHeight) {
  //giving the colour for door
  fill(255, 255, 255);
  stroke(0);
  //x-axis, y-axis, width, height
  rect(doorX, doorY, doorWidth, doorHeight);
  //rect(320, 205, 30, 45);
}

//drawKnob(float circleX, float circleY, float circleDiam) -> return
//purpose: draws a circle for the door knob
public void drawKnob(float circleX, float circleY, float circleDiam) {
  //the knob
  fill(0);
  stroke(0);
  //circle(x, y, extent)
  circle(circleX, circleY, circleDiam);
  //circle(322, 230, 5);
}

//drawRoof(float roofX1, float roofY1, float roofX2, float roofY2, float roofX3, float roofY3) -> nothing
//purpose: draws a triangle for the roof
public void drawRoof(float roofX1, float roofY1, float roofX2, float roofY2, float roofX3, float roofY3){
  //roof
  //triangle(x1, y1, x2, y2, x3, y3)
  triangle(roofX1, roofY1, roofX2, roofY2, roofX3, roofY3);
  //triangle();
}

//drawSun(float circleX, float circleY, float circleDiam) -> nothing
//purpose: draws a circle with yellow color for the sun
public void drawSun(float circleX, float circleY, float circleDiam) {
  //circle sun
  fill(255, 255, 0);
  stroke(255, 255, 0);
  //circle(x, y, extent)
  circle(circleX, circleY, circleDiam);
}

//drawSunRays(float lineX1, float lineY1, float lineX2,float lineY2) -> nothing
//purpose: draws some lines for the sun
public void drawSunRays(float lineX1, float lineY1, float lineX2,float lineY2) {
    //sun rays (adjusted to radiate from the sun's center)
  stroke(255, 255, 0);
  //line(x1, y1, x2, y2)
  line(lineX1, lineY1, lineX2, lineY2);  // top-left ray
}

//drawGrass(float x1, float x2, float recWidth, float recHeight) -> nothing
//purpose: draws a rectangle and fills it with the green color
public void drawGrass(float x1, float x2, float recWidth, float recHeight) {
  fill(0, 255, 0);
  stroke(0, 255, 0);
  //x-axis, y-axis, width, height
  rect(x1, x2, recWidth, recHeight);
}

void draw(){
  //calling all the functions to draw 
  drawSun(100, 200, 100);
  drawSunRays(100, 200, 50, 150); 
  drawGrass(0, 200, 399, 250);
  houseDraw(300, 160, 80, 90);
  drawDoor(320, 205, 30, 45);
  drawKnob(322, 230, 5);
  drawRoof(300, 160, 380, 160, 340, 130);
  
}
