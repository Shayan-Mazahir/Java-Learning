package School.CW.ObjectOriented.object_practice;


public class A2_Rectangle {
    // two instance variables, one for height and another for width.
    // attributes
    private int width;
    private int length;

    public A2_Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public A2_Rectangle(int w, int l) {
        this.width = w;
        this.length = l;
    }

    public int area() {
        int area = this.length * this.width;
        return area;
    }

    public int perimeter() {
        int permineter = 2 * (this.length * this.width);
        return permineter;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int w) {
        this.width = w;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int l) {
        this.length = l;
    }

    public boolean equals(Rectangle r) {
        if (r.getLength() == this.length && r.getWidth() == this.width)
            return true;
        else
            return false;
    }

    public int compareTo(Rectangle r) {
        // if they are equal return 0, otherwise return based on relative areas
        if (r.equals(this))
            return 0;
        else if (r.area() > this.area())
            return -1;
        else
            return 1;
    }

    public String toString() {
        return "width=" + this.width + ", length=" + this.length;
    }
}
