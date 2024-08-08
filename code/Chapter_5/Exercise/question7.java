package code.Chapter_5.Exercise;

//Usoing for loop repeat question 1 of pringint stars
public class question7 {
    public static void main(String[] args) {
        int lines = 4;

        for (int i = 0; i < lines; i++) {
            int stars = lines - i;

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
