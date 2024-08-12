package code.Chapter_6.Exercise;

//Write a Java program to find the minimum element in an array.

public class question7 {
    public static void main(String[] args) {
        int [] array = {2, 4, 5, 6, 7, 8, 9, 123, 10, 11, 12, 13};
        int min_num = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i ++) {
            if (min_num > array[i]) {
                min_num = array[i];
            }
        }
        System.out.println(min_num);
    }
}
