package code.Chapter_9.Exercise;

//create a class sphere and use getter and setters to set its radius and find volume 

class Sphere {
    private double radius;
    private double volume;

    // Constructor
    public Sphere(double radius) {
        this.radius = radius;
        calculateVolume(); // Calculate volume during object creation
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
        calculateVolume(); // Recalculate volume whenever radius is set
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Getter for volume
    public double getVolume() {
        return volume;
    }

    // Method to calculate volume
    private void calculateVolume() {
        this.volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }
}

public class question5 {
    public static void main(String[] args) {
        // Create a sphere with an initial radius
        Sphere new_sphere = new Sphere(10);

        // Output the radius and volume
        System.out.println("Radius of the sphere: " + new_sphere.getRadius());
        System.out.println("Volume of the sphere: " + new_sphere.getVolume());

        // Modify the radius
        new_sphere.setRadius(10);

        // Output the updated radius and volume
        System.out.println("Updated radius of the sphere: " + new_sphere.getRadius());
        System.out.println("Updated volume of the sphere: " + new_sphere.getVolume());
    }
}
