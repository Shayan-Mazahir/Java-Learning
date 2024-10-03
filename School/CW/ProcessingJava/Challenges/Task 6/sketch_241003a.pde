//Lesson 6
//Author: Shayan Mazahir
void setup(){
  size(500, 500);
  background(150);
}

void draw(){
  //outer circle
  float circle_out_x = width/2;
  float circle_out_y = height/2;
  float circle_out_diam = 50;
  
  //inner circle
  float circle_in_x = width/2;
  float circle_in_y = height/2;
  float circle_in_diam = 70;
  //circle(x, y, extent)
  //color for circle 2
  fill(255);
  stroke(255);
  circle(circle_in_x, circle_in_y, circle_in_diam);
  
  //color for circle 1
  fill(0);
  stroke(0);
  circle(circle_out_x, circle_out_y, circle_out_diam);
  
  if (keyPressed == '+'){
    circle_out_diam += 1;
  }

  

  
}
