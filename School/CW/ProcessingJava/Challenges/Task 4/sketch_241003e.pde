//Task 4
//Author: Shayan Mazahir
//Date of Last Edit: 6 October, 2024
void setup(){
  size(600, 600);
  fill(255);
}

// mouseInBounds(int xLow, int xHigh, int yLow, int yHigh) -> boolean
// Purpose: Check if the mouse is within specified bounds.
public boolean mouseInBounds(int xLow, int xHigh, int yLow, int yHigh){
  boolean xInbounds = mouseX > xLow && mouseX < xHigh;
  boolean yInbounds = mouseY > yLow && mouseY < yHigh;
  return xInbounds && yInbounds;
}

// hoverSquare(int x, int y, int sWidth, int sHeight, color shape_color) -> void
// Purpose: Draw a square that changes color when hovered over.
public void hoverSquare(int x, int y, int sWidth, int sHeight, color shape_color) {
    if (mouseInBounds(x, x + sWidth, y, y + sHeight)){
        fill(shape_color);
    } else {
        fill(255);
    }
    rect(x, y, sWidth, sHeight); 
}

void draw() {
  color c1 = color(255, 0, 0);
  hoverSquare(0, 0, width/2, height/2, c1);
  
  color c2 = color(0, 255, 0);
  hoverSquare(width/2, 0, width/2, height/2, c2);
  
  color c3 = color(0, 0, 255);
  hoverSquare(0, height/2, width/2, height/2, c3);
  
  color c4 = color(255, 255, 0);
  hoverSquare(width/2, height/2, width/2, height/2, c4);
}
