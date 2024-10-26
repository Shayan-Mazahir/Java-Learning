# Lesson 8 - Repetition Structures - `while()`

This lesson will go over `while` loops referencing some of the `for` loop materials.

## `while` loops

`while` loops are similar to `for` loops in that they also need the following:
* `initial value`: the value the loop starts at
* `condition`: the rule for which the loop will stop running
* `pattern`: the increasing or decreasing value required to ensure the pattern is fulfilled

The structure of a while loop looks like 

```java
//initial value

while (condition) { 
    //pattern 
}
```

We will use the same rectangle examples as we did previously.

```java
int xPosition;

void setup() {
    size(800, 800);
    background(255);
}

void draw() {
    xPosition = 50;
    while (xPosition <= 650) {
        rect(xPosition, 350, 100, 100);

        xPosition += 150;
    }

    /*
    for (let xPosition = 50; xPosition <= 650; xPosition += 150) {
        rect(xPosition, 350, 100, 100);
    }
    */
}
```

Just like with `for` loops, you do not have to increase your pattern all the time. Sometimes you might want to decrease the pattern instead. Here is an example of how to do so:

```java
int xPosition;
int diameter;

void setup() {
    size(800, 800);
    background(255);
}

void draw() {
    xPosition = 50;
    while (xPosition <= 650) {
        rect(xPosition, 350, 100, 100);

        xPosition += 150;
    }

    diameter = 500;
    while (diameter >= 0) {
        ellipse (width/2, height/2, diameter, diameter);

        diameter -= 50;
    }
}
```

## Troubleshooting

### Loop not running
If you create a while loop and nothing shows up, you will want to check that:
* If you have an increasing pattern, your initial value should be smaller than your running condition.
* If you have a decreasing pattern, your initial value should be larger than your running condition.

This could look like:
```java

//Do **not** run this
void setup() {
    size(800, 800);
    background(255);
}

void draw() {
    for (int xPosition = 50; xPosition > 650; xPosition += 150) {
        rect(xPosition, 350, 100, 100);
    }
}
```

Note that the `initial value` is `50`, but the `condition` to keep running states that it is `greater than 650`. Since 50 is **not** greater than or equal to 650, the loop does not run.

### Infinite loops
While loops have a higher chance of creating infinite loops, so ensure that you are setting up your initial value, condition, and pattern properly.  If you notice your program starts to freeze, or crash, then your running condition is set up so that it is **never** false, and therefore creates what is called an **infinite loop**.

This could look like:
```java

int xPosition;

//Do **not** run this
void setup() {
    createCanvas(800, 800);
    background(255);
}

void draw() {
    xPosition = 50;
    while (xPosition < 650) {
        rect(xPosition, 350, 100, 100);

        xPosition -= 150;
    }
}
```

In the above case, you'll notice that we start `xPosition` at 50, and while `(xPosition < 650)` is true, it will continue to start in the while loop.  This is where our pattern would normally help us, but if we follow the pattern we get the following:

| Initial Value | Current Value |      Stopping Condition      |
| ------------- | ------------- | ---------------------------- |
| 50            | 50            | greater than or equal to 650 |
| 50            | -100          | greater than or equal to 650 |
| 50            | -250          | greater than or equal to 650 |
| 50            | -400          | greater than or equal to 650 |
| 50            | ...           | greater than or equal to 650 |
| 50            | infinite      | greater than or equal to 650 |

# Task(s)

- Write a program that recreates Exercise8_2O.gif. The main concept here is only having one `ellipse()/triangle()` for the top half of the sketch, and one `ellipse()` for the bottom half of the sketch. 