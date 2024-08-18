package code.Chapter_8.Exercise;

import java.util.Scanner;

//Create a class Square with a method to initialize its side, calculating area, perimeter etc.
class Square {
    // Method to take input for the side length
    public double input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();
        scanner.close(); // Close the Scanner after use
        return side;
    }

    // Method to calculate the area of the square
    public double area(double side) {
        return side * side;
    }

    // Method to calculate the perimeter of the square
    public double perimeter(double side) {
        return 4 * side;
    }
}

public class question3 {
    public static void main(String[] args) {
        Square sq = new Square();

        // Taking input using the input() method
        double side = sq.input();

        // Calculating area and perimeter
        double area = sq.area(side);
        double perimeter = sq.perimeter(side);

        // Printing the results
        System.out.println("Area of the square: " + area);
        System.out.println("Perimeter of the square: " + perimeter);
    }
}
