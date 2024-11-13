// package School.CW.ObjectOriented.object_practice;

public class MatrixRunner {
    public static void main(String[] args) {
        Mat2x2 m = new Mat2x2(4, 3, 2, 0);
        Mat2x2 n = new Mat2x2(4, -1, -6, 0);
        Mat2x2 ans = m.Multiply(n);
        System.out.println("\n" + ans);
    }
}
