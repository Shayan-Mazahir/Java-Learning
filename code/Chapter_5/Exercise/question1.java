package code.Chapter_5.Exercise;

public class question1 {
    public static void main(String[] args) {
        int lines = 4;
        int i = 0;
        while (i < lines) {
            int stars = lines - i;

            int j = 0;
            while (j < stars) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
