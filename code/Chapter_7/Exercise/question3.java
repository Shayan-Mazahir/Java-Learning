package code.Chapter_7.Exercise;
import java.util.Scanner;

// Write a recursive function to calculate the sum of the first n natural numbers.
public class question3 {

    // Recursive function to calculate the sum of the first n natural numbers
    static int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;  // Base case: if n is 1, the sum is 1
        } else {
            return n + sumOfNaturalNumbers(n - 1);  // Recursive case
        }
    }

    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = sumOfNaturalNumbers(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        input.close();
    }
}
