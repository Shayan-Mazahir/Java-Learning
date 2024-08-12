package code.Chapter_6.Exercise;

//Create a Java program to add two matrices of size 2x3.

public class question4 {
    public static void main(String[] args) {
        int [][] array_1 = {{2, 5, 7}, {4, 5, 8}};
        int [][] array_2 = {{2, 3, 4}, {9, 8, 7}};
        int [][] sum = {{0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < array_1.length; i++) {
            for (int j = 0; j < array_1[i].length; j++) {
                sum[i][j] = array_1[i][j] + array_2[i][j];
            }
        }
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        
        }
    }

