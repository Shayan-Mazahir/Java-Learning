package code.Chapter_10.code;

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an Object of base class
        Base a = new Base();
        a.setX(4);
        System.out.println(a.getX());

        // Creating an object of derived class
        Derived b = new Derived();
        b.setY(43);
        System.out.println(b.getY());
    }
}

