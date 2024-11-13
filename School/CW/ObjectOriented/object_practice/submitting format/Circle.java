// package School.CW.ObjectOriented.object_practice;

public class Circle {
    // attributes
    private double radius;
    private double diameter;
    private double height;

    // constructors
    public Circle() {
        this.radius = 1;
        this.diameter = 2 * radius; // automatically set diameter
        this.height = 1;
    }

    public Circle(double radi, double diam) {
        this.radius = radi;
        this.diameter = diam;
        this.height = 1;
    }

    public Circle(double radi, double diam, double h) {
        this.radius = radi;
        this.diameter = diam;
        this.height = h;
    }

    // setters
    public void setRadius(double rdi) {
        this.radius = rdi;
        this.diameter = 2 * rdi; // update diameter based on radius
    }

    public void setDiameter(double diam) {
        this.diameter = diam;
        this.radius = diam / 2; // update radius based on diameter
    }

    public void setHeight(double h) {
        this.height = h;
    }

    // getters
    public double getRadius() {
        return this.radius;
    }

    public double getDiameter() {
        return this.diameter;
    }

    public double getHeight() {
        return this.height;
    }

    // overrides
    @Override
    public String toString() {
        return "Height = " + height + ", Radius = " + radius + ", Diameter = " + diameter;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            return this.radius == other.radius;
        }
        return false;
    }

    public int compareTo(double r) {
        if (this.radius == r) {
            return 0;
        } else if (this.radius < r) {
            return -1;
        } else {
            return 1;
        }
    }

    //other functions
    public double Area(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    public double Circumference(double radius){
        double circumference = 2 * Math.PI * radius;
        return circumference; 
    }

    public double Volume(double radius) {
        double volume = (4/3) * (Math.PI * radius * radius * radius);
        return volume; 
    }
}
