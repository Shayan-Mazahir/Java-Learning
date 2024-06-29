package code.Chapter_1;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner input = new Scanner(System.in);
        // this basically means that we are taking the template "Scanner" and then making a copy of that template and using 
       
       //Program # 1
       System.out.println("Enter number 1: ");
        int a = input.nextInt();
        System.out.println("Please enter number 2: ");
        int b = input.nextInt();
        int sum = b + a;
        System.out.println(sum);
        
        //Program # 2 
        
        boolean b1 = input.hasNextInt();
        // the has statement does exactly what it is called and checks if the input HAS that specific type of thing we want to see
        System.out.println(b1);
        
        //Program # 3

        String testing = input.nextLine();
        //if u do next() it will only read the first word, and wont read anything after the space, but with nextLine() it will read everything no matter the space or anything
        System.out.println(testing);
    }
}
