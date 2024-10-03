//Task 2: colorMouseBall
void setup(){
  size(600, 600);
  fill(255);
}

//arc(a, b, c, d, start, stop)

void draw() {
  //circle(x, y, extent)  
  fill(mouseX, mouseY, mouseY);
  circle(mouseX, mouseY, 30);

}
