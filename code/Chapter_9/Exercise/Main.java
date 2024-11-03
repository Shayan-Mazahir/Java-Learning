package code.Chapter_9.Exercise;

public class Main {
    public static void main(String[] args) {
        Cylinder my_Cylinder = new Cylinder(20, 8);
        System.out.println("\n" + my_Cylinder.getRadius());
        System.out.println(my_Cylinder.volume());
        my_Cylinder.setRadius(80);
        System.out.println(my_Cylinder.getRadius());
        System.out.println(my_Cylinder.volume());
    }
}
