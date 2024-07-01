package code.Chapter_2.Exercise;
// Using characters; write a java program to encrypt a grade by adding 8 to it, decrypt it to show the original result
import java.util.Scanner;

public class question2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Encrypting the grade
        System.out.print("Please enter your grade: ");
        String grade_input = input.next(); // Java will always read the input as string
        // So, now reading the string as a list and then taking it form the character at index 0
        char grade = grade_input.charAt(0);
        char encrypted = (char)(grade + 8);
        System.out.println("Encrypted grade: " + encrypted);

        // Decrypting the grade
        System.out.print("Enter the grade you want to decrypt: ");
        String grade_input_decrypt = input.next();
        char decrypted_grade = grade_input_decrypt.charAt(0);
        char decrypted_grade_final = (char)(decrypted_grade - 8);
        System.out.println("Decrypted grade: " + decrypted_grade_final);

        input.close();
    }
}
