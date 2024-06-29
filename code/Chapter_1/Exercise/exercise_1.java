package code.Chapter_1.Exercise;
/*
Write a program to calculate the percentage of a given student in the 
Cambridge board exam. His marks from 5 subjects must be taken as input 
from the keyboard. (Marks are out of 100)
*/
import java.util.Scanner;
public class exercise_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the marks for subject 1: ");
        float subject_1 = input.nextFloat();

        System.out.print("Please enter the marks for subject 2: ");
        float subject_2 = input.nextFloat();

        System.out.print("Please enter the marks for subject 3: ");
        float subject_3 = input.nextFloat();

        System.out.print("Please enter the marks for subject 4: ");
        float subject_4 = input.nextFloat();

        System.out.print("Please enter the marks for subject 5: ");
        float subject_5 = input.nextFloat();

        double percentage = ((subject_1 + subject_2 + subject_3 + subject_4 + subject_5) / 500 ) * 100;

        System.out.print("Your final percentage is: " + percentage);

        input.close();
        
    }
}
