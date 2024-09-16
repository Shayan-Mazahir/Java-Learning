package code.Chapter_1.Exercise;

//area of rectangle
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the width of the rectange: " );
        float width = input.nextFloat();
        System.out.print("Please enter the height of the rectangle: ");
        float height = input.nextFloat();
        float area = width * height;
        System.out.print("The area of the rectangle is: " + area);
        input.close();
    }
}
