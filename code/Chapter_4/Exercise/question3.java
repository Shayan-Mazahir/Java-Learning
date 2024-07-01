package code.Chapter_4.Exercise;
/*
 * calculate income tax to be paid:
 * Income           Tax
 * 2.5l - 5.0l      5%
 * 5.0l - 10.0L     20%
 * Above 10.0L      30%
 * no tax below 2.5
 */
import java.util.Scanner;

public class question3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter your income: ");
            float income = input.nextFloat();
            input.close();
    
            float tax = 0;
    
            if (income < 2.5f) {
                tax = 0; // No tax below 2.5 lakhs
            } else if (income >= 2.5f && income <= 5.0f) {
                tax = income * 0.05f; // 5% tax for income between 2.5L to 5.0L
            } else if (income > 5.0f && income <= 10.0f) {
                tax = income * 0.2f; // 20% tax for income between 5.0L to 10.0L
            } else if (income > 10.0f) {
                tax = income * 0.3f; // 30% tax for income above 10.0L
            }
    
            System.out.println("Income Tax to be paid: " + tax);
        }
    }