package code.Chapter_2.Exercise;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number 1: ");
        double number_1 = input.nextDouble();

        System.out.print("Please enter number 2: ");
        double number_2 = input.nextDouble();

        input.close();
        
        // Print the results of both comparisons
        System.out.println("Is Number 1 (" + number_1 + ") greater than Number 2 (" + number_2 + ")? " + (number_1 > number_2));
        System.out.println("Is Number 1 (" + number_1 + ") less than Number 2 (" + number_2 + ")? " + (number_1 < number_2));
        System.out.println("Is Number 1 (" + number_1 + ") equal to Number 2 (" + number_2 + ")? " + (number_1 == number_2));
    }
}
