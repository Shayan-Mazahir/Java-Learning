package code.Chapter_1.Exercise;
//Program to calculate the avg 
public class Main2 {
    public static void main(String[]args){ //this main() is a function, its not related to the file name, its java builtin
		
        int marks_1 = 90;
        int marks_2 = 50;
        int marks_3 = 100;
        int sum = marks_1 + marks_2 + marks_3;
        float avg = sum / 3;
        System.out.print("The average marks are: ");
        System.out.print(avg);
        
    }
}
