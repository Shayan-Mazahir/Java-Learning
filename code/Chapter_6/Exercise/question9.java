package code.Chapter_6.Exercise;

import java.util.Scanner;
import java.util.Arrays;

//Write a program that asks for 5 numbers. Create a list from those 5 numbers and then sort that list. Print the sorted list.

public class question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;
        int [] array = new int[5];
        while (i < 5) {
            System.out.println("Please enter a number: ");
            int number = input.nextInt();
            array[i] = number;
            i ++;
        }

        Arrays.sort(array);
       System.out.println("Printing using Arrays.toString()" + Arrays.toString(array));
       
       int j = 0;
       System.out.println("Printing using a loop:");
       while (j < array.length) {

        System.out.print(array[j] + " ");

        j ++;
       }

       input.close();

    }
}
