//Challenge 1: Arc
//Author: Shayan Mazahir
void setup(){
  size(600, 600);
  fill(255);
}

//arc(a, b, c, d, start, stop)

void draw() {
  //x, y, width, height, angle, angle
  fill(255, 0, 255);
  arc(height/2, width/2, 100, 10, 3.14159, 6.28319);

}
