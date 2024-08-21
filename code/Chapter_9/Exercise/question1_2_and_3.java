package code.Chapter_9.Exercise;

import java.util.Scanner;

// Create a class Cylinder and use getter and setters to set its radius and height 
class Cylinder {
    private double radius;
    private double height;

    // Default Constructor
    public Cylinder() {
        this.radius = 1.0;  // Default value for radius
        this.height = 1.0;  // Default value for height
    }

    // Parameterized Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double input_height) {
        height = input_height;
    }

    // Method to calculate the surface area of the cylinder
    public double calculateSurfaceArea() {
        return (2 * 3.14159 * radius * height) + (2 * 3.14159 * radius * radius);
    }

    // Method to calculate the volume of the cylinder
    public double calculateVolume() {
        return 3.14159 * radius * radius * height;
    }
}

public class question1_2_and_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the height: ");
        double height = input.nextDouble();

        System.out.println("Please enter the radius: ");
        double radius = input.nextDouble();

        // Using the parameterized constructor to set radius and height
        Cylinder cylinder = new Cylinder(radius, height);

        double area_cylinder = cylinder.calculateSurfaceArea(); // Using the method to calculate area
        double volume = cylinder.calculateVolume(); // Using the method to calculate volume
        
        System.out.println("The area of the cylinder: " + area_cylinder);
        System.out.println("The volume of the cylinder: " + volume);

        input.close();
    }
}
