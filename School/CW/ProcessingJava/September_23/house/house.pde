//da main guy
void setup(){
  //setting uo our canvas
  size(400, 400);
  //setting our background colour
  background(200);
}

//loopy loop guy
void draw(){
  //circle sun
  fill(255, 255, 0);
  stroke(255, 255, 0);
  circle(100, 200, 100);
  
  //sun rays
  line(50, 300, 80, 90);
  line(50, 300, 100, 90);
  line(50, 300, 180, 90);
  //making the grass
  //colour for the grass
  fill(0, 255, 0);
  //giving the rectangle a stroke... (changing line colours)
  stroke(0, 255, 0);
  //x-axis, y-axis, width, height
  rect(0, 200, 399, 250);
  
  //floppy disk (house)
  //giving house some colour
  fill(255, 0, 0);
  //giviing house some stroke
  stroke(255, 0, 0);
  //x-axis, y-axis, width, height
  rect(300, 160, 80, 90);
  
  //door for house
  //giving the colour for doore
  fill(255, 255, 255);
  stroke(0);
  //x-axis, y-axis, width, height
  rect(320, 205, 30, 45);
  
  //the knob
  fill(0);
  stroke(0);
  circle(322, 230, 5);
  
  //roof
  triangle(300, 160, 380, 160, 340, 130);
  
  
  
}
