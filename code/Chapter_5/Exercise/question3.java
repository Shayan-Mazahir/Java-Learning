package code.Chapter_5.Exercise;

import java.util.Scanner;

//Write a program to print the multiplication table of a number

public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for tha table: ");
        int number = scanner.nextInt();
        int i = 0;
        while (i <= 10) {
            int multiply = number * i;
            System.out.println(number + "*" + i + "=" + multiply);
            i += 1;
            scanner.close();
        }
        
    }
}
