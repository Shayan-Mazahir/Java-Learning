//Title: Built in variables and methods
//date:
//Author: Shayan Mazahir

void setup(){
  size(600, 600);
  background(random(0, 255), random(0, 255), random(0, 255)); //grey scale if we have only 1
  
}

void draw() {
  //background(mouseX, mouseY, 50); //party mode :D
  fill(random(0, 255), random(0, 255), random(0, 255));
  circle(random(0, 600), random(0, 600), 50);
  
  //rect(width/2, height/2, mouseX, mouseY);
}

void keyPressed(){
  rect(0, 0, random(0, 600), random(0, 600));  
}

void mousePressed(){
  background(random(0, 255), random(0, 255), random(0, 255));
}
