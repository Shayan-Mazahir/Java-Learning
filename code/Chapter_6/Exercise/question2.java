package code.Chapter_6.Exercise;

import java.util.Scanner;

// Write a program to find out whether a given integer is present in an array or not.

public class question2 {
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] number = {12, 34, 56, 78, 90};
        boolean does_number_exist = false;

        for (int element : number) {
            if (num == element) {
                does_number_exist = true;
                break;  // Exit the loop once the number is found
            }
        }

        // The following lines should be outside of the loop
        if (does_number_exist) {
            System.out.println("Number does exist");
        } else {
            System.out.println("Number does not exist");
        }

        input.close();
    }
}
