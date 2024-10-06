//Task 5
//Author: Shayan Mazahir
//Date of Last edit: 5 October, 2025
void setup(){
  size(600, 600);
  fill(255);
}


void draw() {
  background(255);
//circle(x, y, extent)  
  if (mouseX >= width/2) {
     circle(width/2, mouseY, 20);

  } else {
     circle(mouseX, mouseY, 20);
 }
  //line(x1, y1, x2, y2)
  line(width/2, 0, width/2, height);
}
