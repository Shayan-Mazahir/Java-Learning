package School.CW.ObjectOriented;

public class Transformers {
    //attributes
    private String name;
    private String color;
    private int weapons;
    private boolean mask;
    private int age;


    //constructors
    public Transformers(String name, String color, int weapons, boolean mask, int age) {
        this.name = name;
        this.color = color;
        this.weapons = weapons;
        this.mask = mask;
        this.age = age;
    }
    //getters and setters
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
    //setters
    public void setName(String newName){
        this.name = newName;
    }
    public void setWeapons(int newWeapons){
        this.weapons = newWeapons;
    }

    //methods
    public void talk() {
        System.out.println("I have witnessed their capacity for courage, and though we are worlds apart, like us, there's more to them than meets the eye. I am Optimus Prime, and I send this message to any surviving Autobots taking refuge among the stars. We are here. We are waiting.");
        System.out.println(friends());
    }
    private String friends() {
        String output = this.name + " is friends with " + this.name;
        return output;
    }
}
