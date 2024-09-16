package code.Chapter_1.Exercise;
//kilometer into miles
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number in kilometers: ");
        float kilometer = input.nextFloat();
        double miles = kilometer / 1.609344;
        System.out.println(kilometer + "km to miles is: " + miles);
        input.close();
    }
}
