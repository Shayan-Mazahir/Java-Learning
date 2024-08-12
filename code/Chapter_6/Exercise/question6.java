package code.Chapter_6.Exercise;

//Write a Java program to find the maximum element in an array.

public class question6 {
    public static void main(String[] args) {
        int [] array = {2, 3, 4, 8, 12, 50, 99, 9, 10};
        int greatest_num = 0;
        for (int i = 0; i < array.length; i ++) {
            if (greatest_num < array[i]) {
                greatest_num = array[i];
            }
        }
        System.out.println(greatest_num);
    }
}
