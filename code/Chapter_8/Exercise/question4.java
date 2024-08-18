package code.Chapter_8.Exercise;

import java.util.Scanner;
//Create a class Rectangle & problem 3.

class Rectangle {
    public double[] sides() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length: ");
        double length = input.nextDouble();
        System.out.println("Please enter width: ");
        double width = input.nextDouble();
        input.close();
        return new double[]{length, width};
    }
}
public class question4 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        // Get the sides using the sides() method
        double[] sides = rect.sides();
        double length = sides[0];
        double width = sides[1];

        // Output the length and width
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("area is: " + length * width);
    }
}