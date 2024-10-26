# Lesson 7 - Repetition Structures - `for()`

This lesson will go over the `for` loops and why we use repetition structures.

## Repetition Structures

We use repetition structures when there is a pattern available to create more than one item/process at a time based on the pattern available.  For example, if we wanted to place five (or five million) rectangles on the screen that are the same size and evenly spaced between them, we can use a loop to create them all in a few lines of code rather than creating five (or five million) individual rectangles.

## `for` loops

The key information that is in a `for` loop is as follows:
* `initial value`: the value the loop starts at
* `condition`: the rule for which the loop will stop running
* `pattern`: the increasing or decreasing value required to ensure the pattern is fulfilled

The structure of a for loop looks like `for (initial value; condition; pattern) { }`. We define the variable that will contain the information of the initial value immediately inside the for loop. This is different than when we created variables previously. The variable will exist **only within** the for loop, and will not exist outside of it.

As an example, if we were to draw five rectangles (as below), what would the pattern be between these rectangles?

```java
void setup() {
    size(800, 800);
    background(255);
}

void draw() {
    rect(50, 350, 100, 100);
    rect(200, 350, 100, 100);
    rect(350, 350, 100, 100);
    rect(500, 350, 100, 100);
    rect(650, 350, 100, 100);    
}
```

Once we have the pattern, we can then modify the code to draw all of the rectangles. In this case, the initial value would be 50 (the smallest x-position value), the ending condition would be when we get to 650 (the largest x-position value), and the pattern would be 150 (the difference between each x-position).

```java
void setup() {
    size(800, 800);
    background(255);
}

void draw() {
    for (int xPosition = 50; xPosition <= 650; xPosition += 150) {
        rect(xPosition, 350, 100, 100);
    }

    /*
    rect(50, 350, 100, 100);
    rect(200, 350, 100, 100);
    rect(350, 350, 100, 100);
    rect(500, 350, 100, 100);
    rect(650, 350, 100, 100);
    */    
}
```

You'll notice in this case that we stated the pattern as `xPosition += 150`. This is a shorthand for `xPosition = xPosition + 150`. Note that the `+` comes **before** the `=`. If you swapped these, you would be setting xPosition to positive 150 instead.

Here is another example of the same rectangles, but with varying stroke weights. Run this code to see what happens. Why does this happen?

```java
void setup() {
    size(800, 800);
    background(255);
}

void draw() {
    for (int xPosition = 50; xPosition <= 650; xPosition += 150) {

        strokeWeight(xPosition / 100);
        rect(xPosition, 350, 100, 100);

    }    
}
```

You do not have to increase your pattern all the time. Sometimes you might want to decrease the pattern instead. Here is an example of how to do so:

```java
void setup() {
    size(800, 800);
    background(255);
}

void draw() {
    for (int xPosition = 50; xPosition <= 650; xPosition += 150) {
        rect(xPosition, 350, 100, 100);
    }

    for (int diameter = 500; diameter >= 0; diameter -= 50) {
        ellipse (width/2, height/2, diameter, diameter);
    }
}
```

## Troubleshooting

### Loop not running
If you create a for loop and nothing shows up, you will want to check that:
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
If you create a for loop and the program starts to freeze, or crash, then your running condition is set up so that it is **never** false, and therefore creates what is called an **infinite loop**.

This could look like:
```java

//Do **not** run this
void setup() {
    size(800, 800);
    background(255);
}

void draw() {
    for (int xPosition = 50; xPosition < 650; xPosition -= 150) {
        rect(xPosition, 350, 100, 100);
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


- Write a program that recreates Exercise6_2O.png. The main concept here is only having one `ellipse()`, one `triangle()`, and two `rect()` shapes drawn and letting the `for` loop do the repetition.