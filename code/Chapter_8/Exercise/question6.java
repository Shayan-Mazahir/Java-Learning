package code.Chapter_8.Exercise;

import java.util.Scanner;

class Circle {
    // Method to take input for the radius and return the radius, area, and circumference as an array
    public double[] getProperties() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle: ");
        double radius = input.nextDouble();
        input.close();

        // Calculate the area and circumference
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        // Return the radius, area, and circumference as an array
        return new double[]{radius, area, circumference};
    }
}

public class question6 {
    public static void main(String[] args) {
        Circle circle = new Circle();

        // Get the properties using the getProperties() method
        double[] properties = circle.getProperties();
        double radius = properties[0];
        double area = properties[1];
        double circumference = properties[2];

        // Output the radius, area, and circumference
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
