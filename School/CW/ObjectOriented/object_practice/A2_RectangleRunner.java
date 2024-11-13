package School.CW.ObjectOriented.object_practice;

import java.util.Scanner;

public class A2_RectangleRunner {
    public static void main(String[] args) {
        Rectangle one = new Rectangle();
        System.out.println("The dimensions of your rectangle are " + one);
        System.out.println("The area of the rectangle is " + one.area());
        System.out.println("The width is " + one.getWidth());
        Scanner in = new Scanner(System.in);
        System.out.print("\nWhat is the next rectangle's width?");
        int newwidth = in.nextInt();
        in.nextLine();
        System.out.print("What is the next rectangle's height?");
        int newheight = in.nextInt();
        in.nextLine();
        Rectangle two = new Rectangle(newwidth, newheight);
        System.out.println("The dimensions of your new rectangle are " + two);
        System.out.println("The area of the new rectangle is " + two.area());
        if (two.equals(one))
            System.out.println("\nThe two rectangles are equal.");
        else
            System.out.println("The two rectangles are not equal.");
        System.out.print("\nEnter a new width?");
        newwidth = in.nextInt();
        in.nextLine();
        two.setWidth(newwidth);
        System.out.println("The revised dimensions of your new rectangle are " + two);
    }
}
