/*
 * Assignment: Assignment 1
 * Author: Syed Shayan Mazahir
 * Date of Last edit: September 17, 2024
*/

public class Assignment1Utility {

    //Question 1
    //welcome() -> void
    //purpose: prints "Welcome to ICS4U!"
    public static void welcome() {
        System.out.println("Welcome to ICS4U!");
    }

    //Question 2
    //stringCombiner(String, String) -> String
    //purpose: takes in 2 strings, appends them and then return them
    public static String stringCombiner(String string_1, String string_2) {
        StringBuilder str = new StringBuilder();
        str.append(string_1);
        str.append(string_2);
        return str.toString();
    }

    //Question 3
    //sumOfMultiples(int, int) -> int
    //purpose: checks for the multiple of a number between a given range
    public static int sumOfMultiples(int first, int mult) {
        int i = 1;
        int sum = 0;
        //looping through to ensure that all the values uptil "first" are counted and calculating the multiple
        while (i <= first) {
            int multiples = mult * i;
            int j = 1;
            //looping through to compare the multiple with all the numbers in the list
            while (j <= first) {
                if (multiples == j) {
                    sum += multiples;
                }
                j++;
            }
            i++;
        }
        return sum;
    }

    //Question 4
    //nthnFibNum(int) -> int
    //purpose: gives you the nthn fibinacio number
    //10 minutes at most; i had to read and recall what the fibonachi sequence was
    public static int nthFibNum(int n) {
        //comparing the base cases
        if (n < 1) {
            return -1;
        } if (n == 1) {
            return 0;
        } if (n == 2) {
            return 1;
        }
    
        int prev_2 = 0; 
        int prev_1 = 1; 
        int current = 0;
        int count = 2; 
        
        //looping and making sure that all the numbers are being counted and summed up
        while (count < n) {
            current = prev_1 + prev_2;
            prev_2 = prev_1;
            prev_1 = current;
            count ++;
        }
        return current;
    }

    //Question 5
    //longestStringLen(array) -> int
    //purpose: takes in an array of strings and tells the length of the longest string
    public static int longestStringLen(String[] strings) {
        int maxLength = 0;

        //looping through the length of the string and checking the length of each string
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > maxLength) {
                maxLength = strings[i].length();
            }
        }
        return maxLength;
    }
    
    public static void main(String[] args) {

    }
}
