package School.CW.IntroToJava.September_11;

public class Main {
    public static int addTen(int x) {
        x = x + 10;
        return x;
    }

    //useless function, but for example
    //fooBar(double) -> double
    //purpose: check if num is above or below 10. Return 0.5; if below 1.5 if above
    public static double fooBar(double num) {
        if (num < 10) {
            return 0.5;
        } else {
            return 1.5;
        }
    }
    public static void main (String[] args) {
        int y = 20;
        // addTen(y);
        System.out.println(addTen(y));
    }
}
