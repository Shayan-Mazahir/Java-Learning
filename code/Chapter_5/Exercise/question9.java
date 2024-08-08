package code.Chapter_5.Exercise;

//Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.

public class question9 {
    public static void main(String[] args) {
        int i = 1;  // Start from 1
        int sum = 0;
        int num = 8;

        while (i <= 10) {  // The multiplication table typically goes from 1 to 10
            sum += num * i;  // Add the current multiplication result to sum
            i++;
        }

        System.out.println("The sum of the numbers in the multiplication table of 8 is: " + sum);
    }
}
