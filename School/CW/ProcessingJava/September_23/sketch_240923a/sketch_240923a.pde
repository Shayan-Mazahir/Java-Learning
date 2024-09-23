//runs single time
void setup() {
  //width(x), height(y)
  size(500, 500);//making the canvas
  //grey scale we can either give 3 numbers; or only one number.
  //0 would represent black, 255 would represent white
  //grey would be all 200; or just 1 grey
  background(200, 200, 200);
}
//this is the loopy loop guy
void draw() {
  fill(0, 204, 255);
  //y is inverted.... cause.. well uk why.... increasing the y will make the y go down
  //rectange draws from one of its point... like (0,0) and then moves
  rect(100, 200, 100, 100);
  //the circle takes in a point and draws around it (like a compas)
  circle(100, 200, 50);
  stroke(255, 255, 0); //stroke gives ALL the shapes the same colour no matter where it has been defined...
  triangle(100, 200, 200, 200, 50, 80);
}
