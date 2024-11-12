package School.CW.ObjectOriented.object_practice;

public class Rectangle {
    // two instance variables, one for height and another for width.
    private int width;
    private int height;
    private String name;

    public Rectangle() {
        this.width = this.width;
        this.height = this.height;
    }

    public Rectangle(int w, int l) {
        this.width = w;
        this.height = l;
    }

    public int area() {
        int area = this.height * this.height;
        return area;
    }

    public int perimeter(int w, int h) {
        this.width = w;
        this. height = h;
        int perimeter = 2 * (this.height * this.width);
        return perimeter;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int w) {
        this.width = w;
    }

    public int getLength() {
        return this.height;
    }

    public void setLength(int l) {
        this.height = l;
    }

    public boolean equals(Rectangle r) {
        if (r.getLength() == height && r.getWidth() == width)
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
        return "width=" + width + ", length=" + height;
    }
}
