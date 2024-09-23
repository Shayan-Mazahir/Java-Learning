# Lesson 1 - Basics of processing


When you're ready to start your exercise, have a look at `TASK.md`. 

## Header and Comments

At the top of *all* our programs we will include a header - like a title page.  The template will be provided for you but you must make appropriate modifications.

The header is a type of **comment** - think of it as an annotation to help someone understand what your code is doing.

For a single comment line you can use `//` at the beginning - the rest of the line will not be interpreted as code.

For multiple lines you can use `/* (insert text here) */` - just like we have for the header.

Comments are **extremely important** to explain what's happening, because you are most likely *not* the only one reading your code!  You will be expected to write comments for **all exercises and assignments** moving forward.

## `void setup()`

This function will be used to do initial setup for our programs, such as setting screen size or background colour.  This code will run **one time only**.

```java
size(width, height);
```

This expects two arguments/parameters - the width and height in pixels.  We will place this within the curly brackets of `setup()`.  

```java
background(greyscale);
background(red, green, blue);
```

This will set a background colour.  There are many different ways of representing colours, but we'll use greyscale (0-255) or RGB (3 values of 0-255).

## `void draw()`

This is where we'll be spending most of our time.  This function loops continuously as long as our program is running. Effectively this functions as a while true:.

### Drawing Basic Shapes

```java
rect(x, y, width, height);
```

Will draw a rectangle with a top left corner at the coordinates `(x,y)`, with a width and height that you provide.

**IMPORTANT NOTE:** The coordinate system here is different than Math class - `(0,0)` is the top left corner, and y increases going down!

```java
ellipse(x, y, width, height);
line(x1, y1, x2, y2);
```

`ellipse()` will draw a circle with **centre** `(x, y)`.  `line()` will draw a straight line through the points you provide.

### All together
```java
void setup() {
    size(640, 480);
    background(150);
}
void draw() {
    ellipse(100, 200, 50, 50);
}
```

### Additional Shapes

```java
triangle(x1, y1, x2, y2, x3, y3);
quad(x1, y1, x2, y2, x3, y3, x4, y4);
```

These work the same as `line()` - setting individual points.  But be careful with `quad()` - your teacher will show you the problem with `quad(400, 400, 515, 380, 395, 510, 520, 500);`

### Colours and More

```java
fill(int, int, int); // fills the inside of your shape with the colour
stroke(int, int, int); // changes the outline/stroke colour
strokeWeight(int); // changes the thickness of the stroke in pixels
noFill(); // take a guess
noStroke(); // yup
```

**IMPORTANT NOTE**: For the above properties, they will apply to any shapes until the property is changed again.

Imagine picking up a red marker - everything you draw will be red until you pick up another marker.  And since the `draw()` function loops, you will begin re-drawing previous shapes with that red marker as


Your task: Write code in processing to display an image nearly identical to what is in house.png. All shapes should use variables as values passed to the shapes. When you are done this task, show me the completed work and then try challenge 1.