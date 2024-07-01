/*
 * if a student is pass or fail.
 * 3 subjects to check
 * total 40% is pass
 * each subject should be 33% to pass
 */

 package code.Chapter_4.Exercise;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks for subject 1: ");
        int subject_1 = input.nextInt();

        System.out.print("enter marks for subject 2: ");
        int subject_2 = input.nextInt();

        System.out.print("Enter marks for subject 3: ");
        int subject_3 = input.nextInt();
        input.close();

        int total_percentage = subject_1 + subject_2 + subject_3;
        double percentage = total_percentage / 3.0;

        if (subject_1 >= 33 && subject_2 >= 33 && subject_3 >= 33 && percentage >= 40) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

    }
}
