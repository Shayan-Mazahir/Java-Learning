package code.Chapter_5.Exercise;

import java.util.Scanner;

//Question 11: Repeat question 2 using for loop.

public class question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
        int sum = 0;

        // Using a for loop to calculate the sum of the first n numbers
        for (int i = 1; i <= n; i++) {
            sum += i; 
        }

        System.out.println("The sum of the first " + n + " numbers is: " + sum);
        scanner.close();
    }
}
