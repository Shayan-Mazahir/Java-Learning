# Lesson 2 - Built-in Variables

This lesson will go over some built-in variables.

## `width` and `height`
After starting the program, and after setting the size of the canvas, there are two particular variables that you can use to get the `width` and `height` of the window. This can be useful for positioning shapes on the screen.

```java
void setup() {
    size(640, 480);
    background(150);
}
void draw() {
    ellipse(width/2, height/2, 50, 50);
}
```

The above code will replace the variable `width` with the value of `640`, and replace the variable `height` with the value of `480`, thus the ellipse's centre will be at `(320, 240)`. Using these variables makes it easier if you change the size/shape of your canvas, as you do not need to go through your code to change other values that rely on the width and height of your canvas.

## `fullScreen()`

This method is used instead of size() if you want the image to take up the entire screen as it will automatically size to their screen size.

## `mouseX` and `mouseY`

These two variables find the current x-position of the mouse (`mouseX`), and the current y-position of the mouse (`mouseY`). This can be used anywhere in your sketch where a variable might make sense.

```java
void setup() {
    fullScreen();
    background(150);
}

void draw() {
    rect(width/4, height/4, mouseX, mouseY);
}
```

This program will create a rectangle that has the upper-left corner at `(width/4, height/4)`, and the bottom-right corner of it wherever the mouse currently is `(mouseX, mouseY)`.  How would this sketch look different if we were to put `background(150);` inside of `draw()` instead of `setup()`?

# Task(s)

- Write a program that recreates the behaviour in mouseBall.gif . The main concept here is having an ellipse follow the mouse.