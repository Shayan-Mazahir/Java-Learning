package code.Chapter_1.Exercise;
//Write a program which takes the name of a person and then greets them
import java.util.Scanner;

public class Main3 {
    public static void main(String[]args){
        //copying the object for input
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        //asking for input
        String name = input.nextLine();
        //making sure the whole text an read and is not stopped at the spaces
        System.out.println("Hello " + name + ", have a great day!"); 
        input.close();
    }
}
