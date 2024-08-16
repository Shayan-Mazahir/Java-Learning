package code.Chapter_7.Exercise;

//Write a function to find the average of a set of numbers passed as arguments.

public class question6 {

    static double function(int n, int ...ar) {
        int sum = 0;
        for (int num: ar) {
            sum += num;

        }
        return (double) sum / ar.length;
    }
    public static void main(String[] args) {
        function(2,5,987,585,5858,99);
    }
}
