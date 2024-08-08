package code.Chapter_5.Exercise;

import java.util.Scanner;

// write a program to sum the first n numbers usoing a while loop

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        
        while (i <= n) {
            sum += i; 
            i++; 
        }      
        System.out.println("The sum of the first " + n + " numbers is: " + sum);
        scanner.close();
    }
}
