package code.Chapter_9.Exercise;

// import java.util.Scanner;

//Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters

class Rectangle {
    private int length;
    private int breadth;

    // Default constructor that initializes the rectangle to length and breadth of 5
    public Rectangle() {
        this.length = 5;
        this.breadth = 5;
    }

    // Overloaded constructor with custom parameters
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class question4 {
    public static void main(String[] args) {
        // Create a rectangle using the default constructor
        Rectangle defaultRectangle = new Rectangle(10, 20);
        System.out.println("Default Rectangle: Length = " + defaultRectangle.getLength() + ", Breadth = " + defaultRectangle.getBreadth());

        // Create a rectangle using the overloaded constructor with custom parameters
        Rectangle customRectangle = new Rectangle(10, 10);
        System.out.println("Custom Rectangle: Length = " + customRectangle.getLength() + ", Breadth = " + customRectangle.getBreadth());
    }
}
