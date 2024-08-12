package code.Chapter_6.Exercise;

//Create an array of 5 floats and calculate their sum.

public class question1 {
    public static void main(String[] args) {
        float [] numbers = {1.5f, 5.0f, 7.06f, 8.9f, 0.5f};
        float sum = 0;
        for (float element:numbers) {
            sum = sum + element;
            System.err.println(sum);
        }        
    }
}
