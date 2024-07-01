package code.Chapter_2.Exercise;
//write the following formula in java: v^2 - u_2 / 2as
import java.util.Scanner;

public class question4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the value of V: ");
        double v = input.nextDouble();

        System.out.print("Please enter the value of U: ");
        double u = input.nextDouble();

        System.out.print("Please enter the value of A: ");
        double a = input.nextDouble();

        System.out.print("Please enter the value of S: ");
        double s = input.nextDouble();

        input.close();
        
        double formula = ((v*v) - (u*u) ) / 2*a*s;
        System.out.print(formula);
    }
}
