package code.Chapter_1.Exercise;
/*
 * Asks you what is your favorite hobby, then when did you start doing it,
 *  then how good you are at it. After have the program print out the 3 responses
 *  that use the inputed value
 */
import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your favourite hobby?");
        String hobby = input.nextLine();

        System.out.println("When did you start this hobby?");
        String date = input.nextLine();

        System.out.println("How good are you at the hobby?");
        String good = input.nextLine();
        System.out.println("These were you response: ");
        System.out.println(hobby);
        System.out.println(date);
        System.out.print(good);
        input.close();
    }
}
