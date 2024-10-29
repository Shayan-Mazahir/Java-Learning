package School.CW.ObjectOriented;

public class Animal {
    //attributes
    private int age;
    private int weight;
    private String color;
    private String size;
    private String name;
    private String type;

    //constructors
    public Animal(int age, int weight, String color, String size, String name, String type) {
        this.age = age;
        this.color = color;
        this.size = size;
        this.weight = weight;
        this.name = name;
        this.type = type;

    }

    public Animal(String name, String type){
        this.age = 0;
        this.color = "Red";
        this.size = "cute";
        this.weight = 8;
        this.name = name;
        this.type = type;

    }
    //getters and setters
    public int getAge() {
        return this.age;
    }

    public String getSize() {
        return this.size;
    }
    public String getColor(){
        return this.color;
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public int getWeight(){
        return this.weight;
    }
    //setters
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setColor(String newColor) {
        this.color = newColor;
    }
    public void setSize(String newSize) {
        this.size = newSize;
    }
    public void setWeight(int newWeight){
        this.weight = newWeight;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setType(String newType){
        this.type = newType;
    }
    //these 3 are already built-in
    //no comment needed
    public String toString() {
        return "\n" + this.name + " is a catformer who is " + this.age + " years old";
    }

    //"other" is consistent... i think...
    public boolean equals(Animal other) {
        return this.age == other.age && this.name.equals(other.name) && this.weight == other.weight;
    }

    public int compareTo(Animal other){
        if (this.age > other.age) {
            return 1;
        } else if (this.age < other.age) {
            return -1;
        } else {
            return 0;
        }
    }

    //other methods
    public void birthday(){
        this.age = this.age + 1;
    }
    public void talk() {
        System.out.println("\n We were once brothers! Used to fight side by side " + this.name + " and by the way, i weight " + toKg() + " kilos");
    }
    public void eat(String food) {
        if(food.equals("human")) {
            this.weight = this.weight + 5;
        } else if (food.equals("oil") || food.equals("car lubricant")) {
            this.weight = this.weight + 1;
        }
    }

    private double toKg() {
        return this.weight/2.2;
    }

}
