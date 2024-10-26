//Author: Shayan Mazahir
//Date of Last Edit: 10 October 2024
//Assignment: Lesson 7
//color variables
int right_rec_color = 0;
int left_rec_color = 0;
int circle_color = 0;
int triangle_color = 179;
int line_color = 0;

//right rectangle variables
int right_rec_width = 50;
int right_rec_height = 50;
int right_rec_x = 30;
int right_rec_y = 10;

//left rectangle variables
int left_rec_width = 50;
int left_rec_height = 50;
int left_rec_x;
int left_rec_y = 10;

//making the circles
//circle(x, y, extent)
float circle_x;
int circle_y = 200;
int circle_diam = 45;

//making the triangle
//x1, y1, x2, y2, x3, y3
int triangle_x_1 = left_rec_width + 50;
int triangle_y_1 = 10;
int triangle_x_2 = triangle_x_1 - 10;
int triangle_y_2 = left_rec_height;
int triangle_x_3 = triangle_x_1 + 10;
int triangle_y_3 = left_rec_height;

//right side lines
//line(x1, y1, x2, y2)
int line_left_x_1;
int line_left_y_1;
//we cant use the right_rec_width or left_rec_width cause then we would need to have 2 line loop
int line_left_x_2 = 80;
int line_left_y_2 = left_rec_y;

//left side lines
int line_right_x_1;
int line_right_y_1;
int line_right_x_2;
int line_right_y_2 = right_rec_y;

void setup() {
  size(800, 800);
  background(150);
  //making sure the size difference between left and right rect from the sides is the same
  left_rec_x = width - (left_rec_width + 30);
  circle_x = (right_rec_x + left_rec_x) / 2;
  line_left_x_1 = width / 2;
  line_left_y_1 = height - right_rec_height;
  line_right_x_1 = width / 2;
  line_right_y_1 = height - left_rec_height;
  line_right_x_2 = right_rec_y + (width - (right_rec_width + 40));
}

void drawRightRectangles() {
  //making the right side rectangles
  //so we dont need the color = 0 on top of the loop like we did for the circle thingi, mainly cause this loop only runs once, while the circle loop runs again and again thus we need it again and again
  while (right_rec_y <= height - right_rec_height) {
    fill(right_rec_color, 0, 0);
    rect(right_rec_x, right_rec_y, right_rec_width, right_rec_height);
    right_rec_y += 50;
    right_rec_color += 12;
  }
}

void drawLeftRectangles() {
  //making the left side rectangles
  while (left_rec_y <= height - left_rec_height) {
    fill(left_rec_color, 0, 0);
    rect(left_rec_x, left_rec_y, left_rec_width, left_rec_height);
    left_rec_y += 50;
    left_rec_color += 12;
  }
}

void drawCircles() {
  //making the circle
  circle_color = 0;
  circle_x = 300;
  while (circle_x <= 550) {
    fill(0, circle_color, 0);
    circle(circle_x, circle_y, circle_diam);
    circle_x += circle_diam;
    circle_color += 12;
  }
}

void drawTriangles() {
  //triangles
  //triangle(x1, y1, x2, y2, x3, y3)
  //y1, x2, y2, x3, y3 remain the same, x1 goes forward
  while (triangle_x_1 <= 650) {
    fill(0, 0, triangle_color);
    triangle(triangle_x_1, triangle_y_1, triangle_x_2, triangle_y_2, triangle_x_3, triangle_y_3);
    triangle_x_1 += 60;
    triangle_x_2 += 60;
    triangle_x_3 += 60;
    triangle_color += 25;
  }
}

void drawLines() {
  //line(x1, y1, x2, y2)
  line_color = 0;
  while (line_left_y_2 <= left_rec_y) {
    stroke(line_color);
    line(line_left_x_1, line_left_y_1, line_left_x_2, line_left_y_2);
    line_left_y_2 += 25;
    line_color += 6;
  }

  //line(x1, y1, x2, y2)
  line_color = 0;
  while (line_right_y_2 <= left_rec_y) {
    stroke(line_color);
    line(line_right_x_1, line_right_y_1, line_right_x_2, line_right_y_2);
    line_right_y_2 += 25;
    line_color += 6;
  }
}

void draw() {
  //rect(a, b, c, d)
  //x, y, width, height
  //making the right side rectangles
  //so we dont need the color = 0 on top of the loop like we did for the circle thingi, mainly cause this loop only runs once, while the circle loop runs again and again thus we need it aqgain and again
  drawRightRectangles();

  //making the left side rectangles
  drawLeftRectangles();

  //making the circle
  drawCircles();

  //triangles
  //triangle(x1, y1, x2, y2, x3, y3)
  //y1, x2, y2, x3, y3 remain the same, x1 goes forward
  drawTriangles();

  //line(x1, y1, x2, y2)
  drawLines();
}
