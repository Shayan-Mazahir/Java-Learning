package code.Chapter_7.code;

public class Main3 {
    static int factorial(int n) {
        //factorial formula = n * n-1....
        //factorial (n) = n * factorial(n - 1)
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for (int i = 1; i <= n; i++){ // 1 to n
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println("The value of factorial x is: " + factorial(x));
        System.out.println("The value of factorial x is: " + factorial_iterative(x));
    }
}
