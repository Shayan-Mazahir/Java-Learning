package code.Chapter_9.Exercise;

import java.util.Scanner;
//Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters 

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

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
        Rectangle rectangle = new Rectangle(10, 10);
        
        

    }
}
