package code.Chapter_4.code;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String grade;

        System.out.print("Please enter your grade: ");

        Scanner input = new Scanner(System.in);
        grade = input.next();
        Character final_grade = grade.charAt(0);
        input.close();
        
        if (final_grade == 'A') {
            System.out.println("Your marks are in between 100% - 90%");
        }

        else if (final_grade == 'B') {
            System.out.println("Your marks are in between 90% - 80%");
        }

        else if (final_grade == 'C') {
            System.out.println("Your marks are in between 80% - 70%");
        }

        else if (final_grade == 'D') {
            System.out.println("Your marks are in between 60% - 50%");
        }

        else {
            System.out.println("You have failed this city!");
        }

    }
}
