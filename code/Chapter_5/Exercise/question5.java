package code.Chapter_5.Exercise;

import java.util.Scanner;
//write a program in for loop which takes in a number and gives out the factorial
public class question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
     
        long result = 1;
  
        for (int i = 1; i <= n; i++) {
            result *= i; 
        }
        System.out.println("The factorial of " + n + " is: " + result);

        scanner.close();
    }
}
