//class work
int diameter;
int speed = 1;
int direction = 1;

void setup(){
  size(500, 500);
  background(150);
  diameter = 0;
}

void draw() {
  //background(150);
  diameter = diameter - speed * direction;
  
  if (diameter > 50){
    fill(0, 150, 0);
  } else if (diameter > 150) {
    fill(0, 0, 255);
  } else {
    fill(255, 0, 0);
  }
  
  if (diameter >= 150) {
    direction = -1;
  }
  if (diameter <= 20) {
  direction = 1;
}
  
  //if (diameter <= 10) {
  //  diameter = width;
    
  //}
  ellipse(width/2, height/2, diameter, diameter);
}
