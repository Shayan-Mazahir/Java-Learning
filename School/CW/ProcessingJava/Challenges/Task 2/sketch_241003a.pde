//Author: Shayan Mazahir
//Task 2: colorMouseBall
//Date of Last Edit: 5 October, 2024
void setup(){
  size(600, 600);
  fill(255);
}

void draw() {
  //circle(x, y, extent)  
  fill(mouseX, mouseY, mouseY);
  circle(mouseX, mouseY, 30);
}
