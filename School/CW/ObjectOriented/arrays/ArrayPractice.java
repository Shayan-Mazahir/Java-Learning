package School.CW.ObjectOriented.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayPractice {

    // Method to find the length of the longest word in an ArrayList of Strings
    public int findMax(ArrayList<String> words) {
        int maxLength = 0;

        // Using a normal for loop
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() > maxLength) {
                maxLength = words.get(i).length();
            }
        }

        return maxLength;
    }

    // Method to reverse an ArrayList of integers
    public ArrayList<Integer> reverse(ArrayList<Integer> numbers) {
        ArrayList<Integer> reversedList = new ArrayList<>();

        // Iterate from the end of the list to the beginning
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reversedList.add(numbers.get(i));
        }

        return reversedList;
    }

}
