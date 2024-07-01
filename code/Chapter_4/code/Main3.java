package code.Chapter_4.code;

import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a numnber: ");
        int number = input.nextInt();
        input.close();

        switch (number) {
            case 9:
                System.out.println("Number is 9");
                break;
                case 10:
                System.out.println("Number is 10");
                break;
            case 5:
                System.out.println("Number is 5");
                break;
            default:
                System.out.println("Number is none");
        }
        System.out.println("This is not in the switch");

        /*
        //this is a java specific switch case
        switch (number) {
            case 9 -> System.out.println("Number is 9");
            case 10 -> System.out.println("Number is 10");
            case 5 -> System.out.println("Number is 5");
            default -> System.out.println("Number is none");
        }
        System.out.println("This is not in the switch case");
        */
    }
}
