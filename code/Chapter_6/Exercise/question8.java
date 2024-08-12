package code.Chapter_6.Exercise;

//Write a Java program to find whether an array is sorted or not.

public class question8 {
    public static void main(String[] args) {
        int [] array = {2, 4, 6, 8, 0, 1, 3, 5, 7, 9};
        boolean yes_no = true;
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] > array[i + 1]) {
                yes_no = false;
                break;
            }
        }
        if (yes_no) {
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The array is not sorted");
        }
        
    }
}
