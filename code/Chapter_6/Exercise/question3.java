package code.Chapter_6.Exercise;

//Calculate the average marks from an array containing marks of all students in physics using a for-each loop.

public class question3 {
    public static void main(String[] args) {
        float [] marks = {99.8f, 89.8f, 67.9f, 40.8f};
        float sum = 0;
        for (float element:marks) {
            sum = sum + element;
        }
        System.out.println("The average marks are: " + sum/marks.length);
    }
}