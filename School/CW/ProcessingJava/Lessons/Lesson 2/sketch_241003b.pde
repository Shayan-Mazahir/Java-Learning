//Title: Mouse Ball Lesson 2
//Author: Shayan Mazahir

void setup(){
  size(600, 600);
  background(200, 150, 0); //grey scale if we have only 1
  
}

void draw() {
  background(200, 150, 0); //party mode :D
  fill(255);
  circle(mouseX, mouseY, 50);
  
  //rect(width/2, height/2, mouseX, mouseY);
}

void keyPressed(){
  line(0, 0, width, height);  
}

void mousePressed(){
  fill(0);
  circle(50, 50, 90);
}
