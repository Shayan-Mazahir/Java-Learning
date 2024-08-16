package code.Chapter_7.code;

public class Main2 {
    // static int sum(int a, int b) {
    //     return a + b;
    // }
    // static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }
    static int sum(int ... arr) {
        int result = 0;
        for (int a: arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome");
        System.out.println(sum(4, 6));
        System.out.println(sum(4, 6, 3));
    }
}
