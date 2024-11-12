package School.CW.ObjectOriented.object_practice;

public class Item {
    private double price;
    private String name;

    public Item() {
        price = 13.45;
        name = "t-shirt";
    }

    public Item(double p, String n) {
        this.price = p;
        this.name = n;
    }

    // Getters
    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "The " + this.name + " costs $" + this.price;
    }

    // Setters
    public void setPrice(double p) {
        this.price = p;
    }

    public void setName(String n) {
        this.name = n;
    }

    public boolean equals(Item other) {
        if (other.getName().equals(this.name) && other.getPrice() == this.price) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Item other) {
        //on the basis of price
        if (other.getPrice() > this.price) {
            return -1;
        } else if (other.getPrice() == this.price) {
            return 0;
        } else {
            return 1;
        }
    }
}
