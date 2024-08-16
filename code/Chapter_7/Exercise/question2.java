package code.Chapter_7.Exercise;

/* Write a program using functions to print the following pattern:

*
**
***
****
*/

public class question2 {

    // Function to print the pattern
    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        int numberOfRows = 1000000000;  // You can change this number to print a larger pattern
        printPattern(numberOfRows);
    }
}
