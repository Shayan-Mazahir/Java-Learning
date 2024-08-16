package code.Chapter_7.code;

public class Main1 {
    static void foo(){
        System.out.println("Hi");
    }
    static void foo(int a) {
        System.out.println("Morning" + a);
    }
    static void change(int [] arr) {
        arr[0] = 98;
    }
    static void tellJoke() {
        System.out.println("This is a joke.");
    }
    public static void main(String[] args) {
        tellJoke();
        int [] marks = {12, 67, 89, 90};
        change(marks);
        System.out.println(marks[0]);
        foo();
        foo(20);
    }
}
