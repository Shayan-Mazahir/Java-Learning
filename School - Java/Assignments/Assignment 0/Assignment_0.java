/*
Assignment: Assignment 0
Author: Syed Shayan Mazahir
Date of last edit: 6 September 2024
*/

// Importing the Scanner module to ask for input
import java.util.Scanner;
import java.util.Arrays; //it wasnt working on my laptop without importing this for some reason :/ (Im on Visual Studio Code and whatever is the latest java version)

// Question 1
// calculateShippingCost(int weight_input) -> double
// Takes in the weight as an integer and returns the calculated shipping cost as a double.
public class Assignment_0 {

    static double calculateShippingCost(int weight_input) {
        double shipping_cost = weight_input * 0.10;

        // Check weight ranges and add additional charges accordingly
        if (weight_input > 100) {
            shipping_cost += 30;  // Additional charge for weight over 100
        } else if (weight_input > 50) {
            shipping_cost += 15;  // Additional charge for weight over 50
        } else if (weight_input > 25) {
            shipping_cost += 10;  // Additional charge for weight over 25
        }

        return shipping_cost;  // Return the final shipping cost
    }

    // Question 2
    // calculateTax(int income) -> double
    // Takes in the income as an integer and returns the tax owed as a double.
    static double calculateTax(int income) {
        double taxOwed = 0.0;

        // Check income ranges and calculate tax progressively
        if (income > 70000) {
            taxOwed += (income - 70000) * 0.35;  // 35% tax for income over 70,000
            income = 70000;
        }
        if (income > 40000) {
            taxOwed += (income - 40000) * 0.25;  // 25% tax for income over 40,000
            income = 40000;
        }
        if (income > 20000) {
            taxOwed += (income - 20000) * 0.15;  // 15% tax for income over 20,000
            income = 20000;
        }
        if (income > 10000) {
            taxOwed += (income - 10000) * 0.10;  // 10% tax for income over 10,000
        }

        return taxOwed;  // Return the calculated tax
    }

    // Question 3
    // isPalindrome(String text) -> boolean
    // Takes in a string and returns a boolean indicating if it's a palindrome.
    static boolean isPalindrome(String text) {
        // Convert the string to lowercase to make the check case-insensitive 
        text = text.toLowerCase();

        // Create a character array from the input string
        char[] ch = text.toCharArray();
        int n = ch.length;

        // Create a new array to store the reversed characters
        char[] reversed = new char[n];

        // Populate the reversed array with characters from the original array in reverse order
        for (int i = 0; i < n; i++) {
            reversed[i] = ch[n - 1 - i];
        }

        // Compare the original and reversed arrays
        return Arrays.equals(reversed, ch);
    }


    // Question 4
    // calculateSumDifference(int[] numbers) -> int
    // Takes in an array of integers and returns the difference between the sum of even and odd numbers.
    static int calculateSumDifference(int[] numbers) {
        int even_sum = 0;
        int odd_sum = 0;

        // Iterate through the array and sum even and odd numbers separately
        for (int num : numbers) {
            if (num % 2 == 0) {
                even_sum += num;  // Add to even_sum if the number is even
            } else {
                odd_sum += num;   // Add to odd_sum if the number is odd
            }
        }

        // Return the difference between the sum of even and odd numbers
        return even_sum - odd_sum;
    }

    public static void main(String[] args) {
        // Question 1: Shipping cost calculation
        System.out.println("Question 1: Shipping Cost");
        System.out.println("Please enter the weight: ");
        Scanner input1 = new Scanner(System.in);
        int weight_input = input1.nextInt();  // Read weight input from user
        double cost = calculateShippingCost(weight_input);  // Calculate shipping cost
        System.out.println("The shipping cost is: " + cost);

        // Question 2: Tax calculation
        System.out.println("\nQuestion 2: Tax Calculation");
        System.out.println("Please enter your income: ");
        Scanner input2 = new Scanner(System.in);
        int income = input2.nextInt();  // Read income input from user
        double tax = calculateTax(income);  // Calculate tax
        System.out.print("The tax owed is: " + tax);

        // Question 3: Palindrome check
        System.out.println("\nQuestion 3: Palindrome Check");
        System.out.println("Please enter your string: ");
        Scanner input3 = new Scanner(System.in);
        String inputString = input3.next();  // Read string input from user
        boolean palindrome = isPalindrome(inputString);  // Check if the string is a palindrome
        System.out.println("Is the string a palindrome? " + palindrome);

        // Question 4: Sum difference calculation
        System.out.println("\nQuestion 4: Sum Difference");
        int[] numbers = {1, 2, 3, 4, 5, 6};  // Example array
        int result = calculateSumDifference(numbers);  // Calculate sum difference
        System.out.println("The result is: " + result);

        // Close the scanners
        input1.close();
        input2.close();
        input3.close();
    }
}
