package code.Chapter_8.Exercise;

//Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.

class cellphone {
    public void rining() {
        System.out.println("Ringing");
    }
    public void vibrating() {
        System.out.println("Vibrating");
    }
    public void new_message() {
        System.out.println("You have a new message!");
    }
}
public class question2 {
    public static void main(String[] args) {
        cellphone nokia = new cellphone();
        nokia.rining();
        nokia.vibrating();
        nokia.new_message();
        
    }
}
