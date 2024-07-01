package code.Chapter_3.Exercise;
//write a ajava program to detect triple and double spaces in a string
public class question4 {
    public static void main(String[] args) {
        String name = "This string contains double and  triple spaces";
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));
    }
}
