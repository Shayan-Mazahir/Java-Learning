package code.Chapter_10.code;
// Base class
class Base1 {
    // Default constructor
    Base1() {
        System.out.println("Base1: Default constructor called");
    }

    // Overloaded constructor with an integer parameter
    Base1(int x) {
        System.out.println("Base1: Overloaded constructor called with x = " + x);
    }
}

// Derived class that extends Base1
class Derived1 extends Base1 {
    // Default constructor
    Derived1() {
        System.out.println("Derived1: Default constructor called");
    }

    // Overloaded constructor with two integer parameters
    Derived1(int x, int y) {
        super(x); // Calls the overloaded constructor of Base1
        System.out.println("Derived1: Overloaded constructor called with y = " + y);
    }
}

// Child class that extends Derived1
class ChildOfDerived extends Derived1 {
    // Default constructor
    ChildOfDerived() {
        System.out.println("ChildOfDerived: Default constructor called");
    }

    // Overloaded constructor with three integer parameters
    ChildOfDerived(int x, int y, int z) {
        super(x, y); // Calls the overloaded constructor of Derived1
        System.out.println("ChildOfDerived: Overloaded constructor called with z = " + z);
    }
}

// Main class to test the constructors
public class Main1 {
    public static void main(String[] args) {
        // Uncomment one line at a time to see the output

        // Create a ChildOfDerived object with no parameters
        // ChildOfDerived cd = new ChildOfDerived();

        // Create a ChildOfDerived object with three parameters
        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
        
    }
}

