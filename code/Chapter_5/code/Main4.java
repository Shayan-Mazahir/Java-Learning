package code.Chapter_5.code;

public class Main4 {
    public static void main(String[] args) {
        //Break and continue
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Printing something");
            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
        }
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            System.out.println("While loop statements");
            if (i == 2) {
                System.out.println("Ending while loop");
                break;
            }
            i++;
        }
        System.out.println("Loop ends here");
    }
}
