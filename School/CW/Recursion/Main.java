package School.CW.Recursion;

public class Main {
    //function
    static public int recursion(int n) {
        //base case
        if (n == 0 || n ==1 ) {
            return 1;
        }
        return n * recursion(n - 1);
    }

    public static void main(String[] args) {
        // String name = IO.inputString("Please enter your name: ");
        // System.out.println("HOLA, " + name + "!");

        int number = IO.inputInt("Please enter a number for a factorial caculation: ");
        double result = 1;

        //for loop
        // for (int i = 1; i <= number; i++){
        //     result *= i;
        // }

        result = recursion(number);
        System.out.println("The factorial solution for " + number + "is " + result);


    }
}
