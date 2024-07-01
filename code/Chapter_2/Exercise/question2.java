package code.Chapter_2.Exercise;
//Using numbers; write a java program to encrypt a grade by adding 8 to it, decrypt it to show the original result
import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the grade you want to encrypt: ");
        float grade = input.nextFloat();
        float encrypted = grade + 8;
        float decrypt = encrypted - 8;
        System.out.println("The encrypted grade is: " + encrypted);
        System.out.print("The decrypted grade is: " + decrypt);

        input.close();
    }
}
