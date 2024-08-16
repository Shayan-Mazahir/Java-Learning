package code.Chapter_7.Exercise;

public class question5 {

    // Recursive method to calculate the nth Fibonacci number
    static int fibonacci(int n) {
        if (n <= 1) {
            System.out.println("F(" + n + ") = " + n);
            return n; // Base cases: F(0) = 0, F(1) = 1
        }
        System.out.println("Calculating F(" + n + ")");
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        System.out.println("F(" + n + ") = " + result);
        return result; // Recursive case
    }

    public static void main(String[] args) {
        int n = 100; // Position of the Fibonacci number to find (reduced to 10 for clarity)
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}
