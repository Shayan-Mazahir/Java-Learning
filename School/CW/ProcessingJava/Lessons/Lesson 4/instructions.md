# Lesson 4 - Custom Variables

This lesson will go over creating your own custom variables.  We will start by covering outputting values to the console for debugging purposes using `System.out.println()`, and then hop into variables and how to name them.

## `System.out.println()`

When using variables, sometimes the values are not what we think they are and the program does things we do not expect it to do. This is when using `System.out.println()` can help us to debug our program and see what is going on. Below is an example displaying the value of `mouseX` to the console.

```java

void setup() {
    fullScreen();  
    background(150);
}

void draw() {
    System.out.println("x: " + mouseX + " , y: " + mouseY);
}
```

The output from the above will display the value of the x-position of the mouse in the console.  The console will appear at the bottom of the processing code window and not on the visual that is created.


## `Variables`
Now that we know where we can have debug information show it, it is time to start using variables in our program. In our case, variables can be used to move objects, portions of objects, change the size/diameter of objects, etc. Below are a few examples to get us started.

```java
int diameter = 50;

void setup() {
    fullScreen();  
    background(150);
}

void draw() {
    ellipse(width/2, height/2, diameter, diameter);
}
```

The example above will create an ellipse in the middle of the screen with a diameter of 50, since the `diameter` variable has a value of 50. This does not seem that useful but, now that we have a variable in the ellipse drawing, we can now change the value of the diameter over time to have things happen.

```java
//Diameter changing over time

int diameter = 50;

void setup() {
    fullScreen();
    background(150);
}

void draw() {
    ellipse(width/2, height/2, diameter, diameter);
    diameter = diameter + 1;
}
```

In the above code, now the diameter will increase by a value of 1 everytime the `draw()` function starts over (60 times per second).


## `final`
Whenever you want to create your own value or expression in the program, but you know that the value will never change after being created (pi is a good example here), then you can use the `final` option.

```java
// Example

final double PI = 3.1415926535;

void setup() {
    fullScreen();
    background(150);
}

void draw() {
    System.out.println("PI: " + PI);
    System.out.println("PI x mouseX" + (PI * mouseX));
    PI += 1; // This will cause an error as you cannot change a final variable.
}
```

## Naming variables
Variable names should describe their purpose. As above, you'll notice that we used `diameter` to describe the diameter of the ellipse, and `PI` to be the value of the mathematical constant π. The same holds true for any of the built-in variables you have been using `mouseX` give you the x-position of the mouse, etc.

When naming your variables, there are two styles of naming conventions that are acceptable to be used. When you choose one of these types, for consistency, you will want to stick with the same style.

### Style 1: `camelCase` 
This style requires that your variable names start with a lowercase letter, and if the variable has multiple words in it, then every subsequent word starts with an uppercase letter. This is important, as there is a difference in the meaning of a variable named `office` versus `offIce`, as an example.

# Task(s)


- Write a program that recreates movingCircles.gif (ignore the darkness change)

- When you click the mouse, it should reset the position of the circles and start over.