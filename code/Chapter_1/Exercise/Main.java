package code.Chapter_1.Exercise;
//Write a program to sum 3 numbers


public class Main { //this class name should be the same as the name of the fle you are on
    public static void main(String[]args){ //this main() is a function, its not related to the file name, its java builtin
		
        System.out.print("The sum of the numbers are: "); //just like in py, the ln is acting as the f string
        int num_1 = 2;
        int num_2 = 8;
        int num_3 = 5;
        int sum = num_1 + num_2 + num_3;
        System.out.println(sum);
	}
}
