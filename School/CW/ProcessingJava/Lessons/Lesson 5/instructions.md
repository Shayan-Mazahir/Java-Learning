# Lesson 5 - Conditional Statements

This lesson will go over `if` statements and everything related to it, including Boolean values.

## `if` statements

The basic idea of using `if` statements is **if** something is true, **then** do \_\_\_\_\_\_\_\_\_\_.

Below are a list of comparison operators that we can use when comparing two values.

### Comparison operators
| Operator | Meaning |
| -------- | ------- |
| > | greater than |
| >= | greater than or equal to |
| < | less than |
| <= | less than or equal to |
| == | equal to (in value) |
| != | **not** equal to (in value) |

When using these comparison operators, the value that is produced is either `true` or `false`.

This is important because the value needs to be `true` for the program to enter the if statement; whereas, if it is `false` it will skip over that section of code.

```java
int diameter;

void setup() {
    size(500, 500);
    background(150);
    diameter = 0;
}

void draw() {
    diameter = diameter + 1;

    if (diameter > 50) {
        fill(0, 150, 0);
    }

    ellipse(width/2, height/2, diameter, diameter);
}
```

In the above, whenever the diameter becomes greater than 50, the fill value of the ellipse will become a green colour.  Until then, `diameter > 50` is false.

## `else`

The `else` statement has to be connected to an `if` statement. You can think of it as the worse otherwise. **If** this is true then do that, **otherwise** do this other thing.

```java
int diameter;

void setup() {
    size(500, 500);
    background(150);
    diameter = 0;
}

void draw() {
    diameter = diameter + 1;

    if (diameter > 50) {
        fill(0, 150, 0);
    } else {
        fill(150, 0, 0);
    }

    ellipse(width/2, height/2, diameter, diameter);
}
```
In the above example, the fill value will be green whenever the diameter is greater than 50, but before then, the fill value will be red rather than the default.

## `else if ()`

`else if` can be used to chain multiple conditions that you want to check, and depending on which one is true, it will do that in particular. **If** this is true then do that, **else if** this is true then do this thing, **otherwise** do this other thing.

```java
int diameter;

void setup() {
    size(500, 500);
    background(150);
    diameter = 0;
}

void draw() {
    diameter = diameter + 1;

    if (diameter > 150) {
        fill(0, 0, 150);
    } else if (diameter > 50) {
        fill(0, 150, 0);
    } else {
        fill(150, 0, 0);
    }

    ellipse(width/2, height/2, diameter, diameter);
}
```

In this case, it will change to blue when `diameter > 150` is true. If that isn't true, then it checks if `diameter > 50` is true. If that **also** isn't true, then it goes into the `else` statement. 

## `&&`, `||`, and `!`

You can do multiple things in the same if statement if you want. To do so, you can see if multiple items are all true using the ``&&`` (and) symbol. If you only care if one item is true, then you can use the ``||`` (or) symbol instead.

Lastly, you can use the `!` symbol if you want the negation of what you are testing to be checked to be true.

```java
int diameter;

void setup() {
    size(500, 500);
    background(150);
    diameter = 0;
}

void draw() {
    diameter = diameter + 1;

    if (diameter > 50 && mouseX > width/2) {
        fill(0, 150, 0);
    } else if (mouseY > height/2) {
        fill(150, 150, 0);
    } else if (!(diameter > 50)) {
        fill(150, 0, 0);
    }

    ellipse(width/2, height/2, diameter, diameter);
}
```

In this case, you can test out to see what is happening based on your mouse placement on the canvas.

## Boolean values (`true` and `false`)

As noted earlier, anything in the `()` portion of an `if (expression) {}` statement has to evaluate to `true` in order for the program to enter the if statement itself.  The idea of `true` and `false` are also called **Boolean** values.  You can create your own variables that hold only `true` or `false` and make use of those.

```java
boolean drawEllipse;

void setup() {
    size(400, 400);
    drawEllipse = false;
}
void draw() {
    background(150);
    //we could write (drawEllipse === true) here
    //but drawEllipse is already true or false
    if (drawEllipse) {
        ellipse(width/2, height/2, 50, 50);
    } else {
        rect(width/2, height/2, 50, 50);
    }
}
void mouseClicked() {
    drawEllipse = true;
}
void keyPressed() {
    drawEllipse = false;
}
```

This will draw an ellipse when the `drawEllipse` variable is `true`, but will draw a rectangle whenever it is `false`. This is useful when you want to toggle something to be visible or not, or to start movement or not, etc.

# Task(s)

- Write a program that recreates lesson5Task.gif