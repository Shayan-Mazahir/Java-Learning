package code.Chapter_9.Exercise;

// Create a class Cylinder and use getter and setters to set its radius and height 
public class Cylinder {
    //attributes
    private double radius;
    private double height;

    //constructors
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    } 

    //getters and setters
    public double getRadius(){
       return this.radius;
    }

    public double getHeight(){
        return this.height;
    }

    //setters
    public void setRadius(double new_radius) {
        this.radius = new_radius;
    }
    public void setHeight(double new_height){
        this.height = new_height;
    }

    // other methods/functions
    public double surfaceArea(){
        double surface_area = (2 * 3.14 * radius * height) + (2 * 3.14 * radius * radius);
        return surface_area;
    }
    public double volume(){
        double volume = (3.14 * radius * radius * height);
        return volume;
    }

}
