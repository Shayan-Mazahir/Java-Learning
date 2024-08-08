package code.Chapter_5.Exercise;

public class question4 {
    public static void main(String[] args) {
        int initial_num = 10;
        int i = 10;
        while (i >= 0) {
            int multiplication = initial_num * i;
            System.out.println(i + " * " + initial_num + " = " + multiplication);
            i -= 1;
        }
    }
}
