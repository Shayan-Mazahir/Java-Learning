package code.Chapter_1.Exercise;
//check if the user entered number is an integer or not
import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        boolean check = input.hasNextInt();
        System.out.println(check);
    }
}
