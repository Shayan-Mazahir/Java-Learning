package code.Chapter_7.code;

public class Main {

    int first_logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        }
        else {
            z = (x + y ) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        Main obj = new Main();

        int c = obj.first_logic(a, b);
        
        int a1 = 15;
        int b1 = 7;
        int c1 = obj.first_logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
