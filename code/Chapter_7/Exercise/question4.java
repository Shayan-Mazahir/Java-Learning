package code.Chapter_7.Exercise;

/*    Write a function to print the following pattern:

    ****

    ***

    **

    *
*/
public class question4 {
    static void pattern(int n) {
        for (int i = n; i > 0; i--) { // Start from 'n' and decrease
            for (int j = 0; j < i; j++) { // Print 'i' asterisks
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        pattern(4); // Example usage
    }
}
