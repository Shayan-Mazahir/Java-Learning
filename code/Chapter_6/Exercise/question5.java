package code.Chapter_6.Exercise;

//Write a Java program to reverse an array.

public class question5 {
    public static void main(String[] args) {
        int [] array = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(array.length); //debugging
        for (int i = array.length; i > array.length; i --) {
            System.out.println(array[i] - 1);
        }
    }
}
