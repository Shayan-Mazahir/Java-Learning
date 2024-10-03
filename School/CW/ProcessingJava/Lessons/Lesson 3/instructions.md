# Lesson 3 - Built-in Methods

This lesson will go over some other built-in methods.

## `void keyPressed()`

Anything that you place inside of this function will occur whenever you press **any** key on the keyboard. We will learn more in the future about specifying a process when a particular key is pressed. For now, we will use this function to get the idea of providing input to the system via pressing a key.

```java
void setup() {
    size(500, 500);
    background(150);
}

void draw() {
    ellipse(width/2, height/2, 50, 50);
}

void keyPressed() {
    //draws a line from the top left
    //to the bottom right
    line(0, 0, width, height);
}
```

## `void mouseClicked()`

Similar to the `keyPressed()` function above, anything that you place inside of this function will occur whenever you click the mouse. We will learn more in the future about specifying a process when a particular mouse button is pressed. For now, we will use this function to get the idea of providing input to the system via clicking the mouse.

```java
void setup() {
    size(500, 500);
    background(150);
}

void draw() {
    ellipse(width/2, height/2, 50, 50);
}

void mouseClicked() {
    //draws a line from the top left
    //to the bottom right
    line(0, 0, width, height);
}
```

## `random()`

There are two styles of using the `random()` function. It can be used with only one number, such as `random(max)` which would become a random integer between 0 and `max`. The other way it can be used is with two numbers, such as `random(min, max);` which would become a random integer between `min` and `max`.

```java
void setup() {
    size(500, 500);
    background(150);
}

void draw() {
    ellipse(width/2, height/2, 50, 50);
}

void mouseClicked() {
    //draws a line from the top left
    //to the bottom right
    line(0, 0, random(width), random(height));
}
```

### Important Health and Safety Note

Do **not** use random when dealing with colours (fill or stroke) haphazardly. If a large portion of the screen is using random colours, this can cause really quick flashing and changing of colours on the screen which has the potential to cause epileptic seizures. Your teacher will provide you an example of what is, and what isn't acceptable for random use of colours.

# Task(s)

- Write a program that recreates https://openprocessing.org/sketch/1030390. The key idea here is that there is only one line that includes an `ellipse()` in it.

- Your program should be able to reset the screen with a mouse click.

- Your program should be able to generate a randomly sized `rect()` starting in the top left using a key press.