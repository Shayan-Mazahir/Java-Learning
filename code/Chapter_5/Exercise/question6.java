package code.Chapter_5.Exercise;

import java.util.Scanner;

// Program to find the factorial of a given number using a while loop
public class question6 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Please enter a positive integer: ");
        int number = scanner.nextInt();

        // Initialize the result variable to 1
        long result = 1;

        // Initialize the loop counter variable
        int i = 1;

        // Use a while loop to calculate the factorial
        while (i <= number) {
            result *= i; // Multiply result by i
            i++; // Increment the loop counter
        }

        // Output the result
        System.out.println("The factorial of " + number + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
