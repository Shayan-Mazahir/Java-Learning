//Title: Lesson 2
//Author: Shayan Mazahir
//Date of last edit: 05 October, 2024

void setup(){
  size(600, 600);
  background(200, 150, 0);
}

//followMouse() -> empty
//purpose: function for the circle to follow the mouse
public void followMouse() {
  circle(mouseX, mouseY, 50);
}

void draw() {
  background(200, 150, 0); //party mode :D
  fill(255);
  followMouse();
}

void keyPressed(){
  line(0, 0, width, height);  
}

void mousePressed(){
  fill(0);
  circle(50, 50, 90);
}
