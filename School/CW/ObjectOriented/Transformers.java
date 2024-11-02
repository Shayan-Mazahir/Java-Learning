package School.CW.ObjectOriented;

public class Transformers {
    // Attributes
    private String name;
    private String color;
    private int weapons;
    private boolean mask;
    private int age;

    // A single StringBuilder instance at the class level
    private StringBuilder my_string = new StringBuilder();

    // Constructor
    public Transformers(String name, String color, int weapons, boolean mask, int age) {
        this.name = name;
        this.color = color;
        this.weapons = weapons;
        this.mask = mask;
        this.age = age;
    }

    // Getters and Setters
    public int getAge() {
        return this.age;
    }

    public boolean getMask() {
        return this.mask;
    }

    public String getColor(){
        return this.color;
    }

    public int getWeapons(){
        return this.weapons;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setWeapons(int newWeapons){
        this.weapons = newWeapons;
    }

    // Methods
    public void talk(String other_name) {
        my_string.setLength(0); // Clear previous content
        my_string.append("\nI have witnessed their capacity for courage, and though we are worlds apart, like us, there's more to them than meets the eye. I am Optimus Prime, and I send this message to any surviving Autobots taking refuge among the stars. We are here. We are waiting.");
        System.out.println(my_string.toString() + " " + friends(other_name));
    }

    private String friends(String other_name) {
        my_string.setLength(0); // Clear previous content before appending
        my_string.append(this.name).append(" is friends with ").append(other_name);
        return my_string.toString();
    }
}
