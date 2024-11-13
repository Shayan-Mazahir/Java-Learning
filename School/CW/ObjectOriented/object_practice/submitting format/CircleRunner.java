// package School.CW.ObjectOriented.object_practice;

public class CircleRunner {
    public static void main(String[] args) {
        // Create a Circle object with default constructor
        Circle circle1 = new Circle();
        
        // Create another Circle object with specific radius and diameter
        Circle circle2 = new Circle(5.0, 10.0);
        
        // Create another Circle object with radius, diameter, and height
        Circle circle3 = new Circle(7.0, 14.0, 3.0);

        // Display the attributes of the circles using toString
        System.out.println("Circle 1: " + circle1);
        System.out.println("Circle 2: " + circle2);
        System.out.println("Circle 3: " + circle3);

        // Test accessors
        System.out.println("Circle 1 Radius: " + circle1.getRadius());
        System.out.println("Circle 2 Diameter: " + circle2.getDiameter());
        System.out.println("Circle 3 Height: " + circle3.getHeight());

        // Test mutators (setters)
        circle1.setRadius(4.0);
        circle2.setDiameter(8.0);
        circle3.setHeight(6.0);

        System.out.println("Updated Circle 1 Radius: " + circle1.getRadius());
        System.out.println("Updated Circle 2 Diameter: " + circle2.getDiameter());
        System.out.println("Updated Circle 3 Height: " + circle3.getHeight());

        // Test other methods
        System.out.println("Circle 1 Area: " + circle1.Area(circle1.getRadius()));
        System.out.println("Circle 2 Circumference: " + circle2.Circumference(circle2.getRadius()));
        System.out.println("Circle 3 Volume: " + circle3.Volume(circle3.getRadius()));

        // Test equals method
        System.out.println("Circle 1 equals Circle 2? " + circle1.equals(circle2));

        // Test compareTo method
        System.out.println("Circle 1 compared to radius 5.0: " + circle1.compareTo(5.0));
    }
}
