package School.CW.ObjectOriented.object_practice;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle one = new Rectangle();
        System.out.println("The dimensions of your rectangle are " + one);
        System.out.println("The area of the rectangle is " + one.area());
        System.out.println("The width is " + one.getWidth());
        int newwidth = IO.inputInt("\nWhat is the next rectangle's width?");
        int newheight = IO.inputInt("What is the next rectangle's height?");
        Rectangle two = new Rectangle(newwidth, newheight);
        System.out.println("The dimensions of your new rectangle are " + two);
        System.out.println("The area of the new rectangle is " + two.area());
        if (two.equals(one))
            System.out.println("\nThe two rectangles are equal.");
        else
            System.out.println("The two rectangles are not equal.");
        newwidth = IO.inputInt("\nEnter a new width?");
        two.setWidth(newwidth);
        System.out.println("The revised dimensions of your new rectangle are " + two);
    }
}
