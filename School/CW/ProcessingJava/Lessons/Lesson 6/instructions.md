# Lesson 6 - Specific Input

This lesson will go over some specific inputs available from the keyboard and mouse. Previously you learned how to use `void mouseClicked()` and `void keyPressed()`. Now we are going to work with built-in variables that you can use in conjunction with if statements.

## `mousePressed`

This built-in variable returns true is any mouse button is being pressed.

```java
void setup() {
    size(400, 400);
}

void draw() {
    background(50);
    if (mousePressed) {
        ellipse(width/2, height/2, 50, 50);
    }
}
```

The above will only show the ellipse in the centre of the screen whenever a mouse button is being held.

## `mouseButton`

Not all mice have multiple buttons, but if you want to set up a sketch that makes use of multiple buttons, you can do so using built-in constants and comparison it to `mouseButton` to see if it is the `LEFT` or `RIGHT` mouse button being held down.

```java
void setup() {
    size(400, 400);
}

void draw() {
    background(50);
    if (mousePressed && mouseButton == LEFT) {
        ellipse(width/2, height/2, 50, 50);
    } else if (mousePressed && mouseButton == RIGHT) {
        rect(width/2, height/2, 50, 50);
    }
}
```

## `keyPressed`

This works similarly to `mousePressed`; however, it works for whenever you are holding down any key on the keyboard.

```java
void setup() {
    size(400, 400);
}

void draw() {
    background(50);
    if (keyPressed) {
        ellipse(width/2, height/2, 50, 50);
    }
}
```

## `key` and `keyCode`

For `key` and `keyCode`, you can identify any particular key on the keyboard. This is useful if you want to do something specific based on a particular key that is being pressed on the keyboard.

The program will also keep track of the most recent key that you pressed. You might notice this once in a while, especially if you do not use the `keyIsPressed` variable as well.

```java
void setup() {
    size(400, 400);
}

void draw() {
    background(50);
    if (keyPressed && (key == 'e' || key == 'E')) {
        ellipse(width/2, height/2, 50, 50);
    } else if (keyPressed && (key == 'r' || key == 'R')) {
        rect(width/2, height/2, 50, 50);
    }
}
```

The above will check to see if a key is being held (`keyPressed`) and if it is the letter `e` or `E`, then it will display an ellipse; whereas, if the key being held is `r` or `R` then the program will display a rectangle; otherwise, it displays no shape.

Certain keys must use keyCode instead of key to work. There are examples [here on the processing website](https://processing.org/reference/keyCode.html). Below is an example with the arrow keys


```java
color fillVal = color(126);

void setup() {
 size(300, 300); 
}

void draw() {
  fill(fillVal);
  rect(25, 25, 50, 50);
}

void keyPressed() {
  if (key == CODED) {
    if (keyCode == UP) {
      fillVal = color(255);
    } else if (keyCode == DOWN) {
      fillVal = color(0);
    } 
  } else {
    fillVal = color(126);
  }
}
```

# Task(s)

- Write a program that recreates https://openprocessing.org/sketch/1140787. 

The mouse interaction is as follows:
- Hold the mouse to change the stroke colour to black
- Release the mouse to change the stroke colour back to white

The keyboard interaction is as follows:
- `r` to change the fill colour to red
- `g` to change the fill colour to green
- `b` to change the fill colour to blue
- `ENTER` to change the fill colour to black
- `+` to increase the stroke weight (to a maximum value of 20)
- `-` to decrease the stroke weight (to a minimum value of 5)