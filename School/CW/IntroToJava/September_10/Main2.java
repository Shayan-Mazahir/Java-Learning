package School.CW.IntroToJava.September_10;
/*
 * Assignment: Quiz
 * Author: Shayan Mazahir
 * Date of last edit: September 10, 2024
*/
public class Main2 {
    public static void main(String[] args) {
        int x = 3;

        // Check if x is greater, smaller, or equal to 10
        if (x > 10) {
            System.out.println("x is greater than 10");
        } else if (x < 10) {
            System.out.println("x is smaller than 10");
        } else {
            System.out.println("x is equal to 10");
        }

        // Check if x is a multiple of three
        if (x % 3 == 0) {
            System.out.println("x is a multiple of 3");
        }

        // Prime number check using a while loop
        boolean is_prime = true;
        if (x <= 1) {
            is_prime = false; // Numbers <= 1 are not prime
        } else {
            int i = 2;
            while (i <= Math.sqrt(x)) { // Continue while i is less than or equal to the square root of x
                if (x % i == 0) {
                    is_prime = false; // If divisible, not a prime number
                    break; // Exit the loop early if we find a divisor
                }
                i++;
            }
        }

        if (is_prime) {
            System.out.println("x is a prime number");
        } 
    }
}
