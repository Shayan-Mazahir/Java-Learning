package code.Chapter_7.Exercise;

import java.util.Scanner;

// Write a method to print the multiplication table of a given number
public class question1 {

    static void multiplication(int a) {
        int i = 1; // Start from 1
        while (i <= 10) {  // Loop until 10
            int result = a * i;
            System.out.println(a + " x " + i + " = " + result);
            i++;  // Increment i
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        multiplication(number);  // Print the table of the entered number

        input.close();
    }
}
