package code.Chapter_8.Exercise;

//Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
class TommyVecetti{
    public void Hitting() {
        System.out.println("Hitting");
    }
    public void Running() {
        System.out.println("Running");
    }
    public void Firing() {
        System.out.println("Firing");;
    }
}

public class question5 {
    public static void main(String[] args) {
        TommyVecetti Vice_city = new TommyVecetti();
        Vice_city.Running();
        Vice_city.Firing();
        Vice_city.Hitting();
    }
}
