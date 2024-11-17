package School.CW.ObjectOriented.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Arrays_Practice {
    public static void main(String[] args) {
        // 1) Create and populate an ArrayList of 25 random integers
        ArrayList<Integer> random_numbers_list = new ArrayList<Integer>();
        int array_size = 24;
        int i = 0;
        while (i <= array_size) {
            random_numbers_list.add(ThreadLocalRandom.current().nextInt(1, array_size));
            i++;
        }

        // 2) Output the original ArrayList
        System.out.println("\nOriginal ArrayList: " + random_numbers_list);

        // 3) Create a reversed copy of the ArrayList
        ArrayList<Integer> reversed_list = new ArrayList<>();
        int j = random_numbers_list.size() - 1;
        while (j >= 0) {
            reversed_list.add(random_numbers_list.get(j));
            j--;
        }

        // Output the reversed ArrayList
        System.out.println("\nReversed ArrayList: " + reversed_list);

        // 4) Sort the ArrayList using Collections.sort() and output in ascending order
        Collections.sort(random_numbers_list);
        System.out.println("\nArrayList Sorted in Ascending Order: " + random_numbers_list);

        // 5) Sort the ArrayList in descending order and output it
        Collections.sort(random_numbers_list, Collections.reverseOrder());
        System.out.println("\nArrayList Sorted in Descending Order: " + random_numbers_list);

        // 6) Calculate and output the mean, median, and mode
        double mean = calculateMean(random_numbers_list);
        double median = calculateMedian(random_numbers_list);
        ArrayList<Integer> mode = calculateMode(random_numbers_list);

        System.out.println("\nMean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }

    // Method to calculate the mean of an ArrayList
    public static double calculateMean(ArrayList<Integer> list) {
        double sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum / list.size();
    }

    // Method to calculate the median of an ArrayList
    public static double calculateMedian(ArrayList<Integer> list) {
        Collections.sort(list); // Ensure the list is sorted for median calculation
        int size = list.size();
        if (size % 2 == 0) {
            // If even, return the average of the two middle numbers
            return (list.get(size / 2 - 1) + list.get(size / 2)) / 2.0;
        } else {
            // If odd, return the middle number
            return list.get(size / 2);
        }
    }

    // Method to calculate the mode of an ArrayList without using hash maps
    public static ArrayList<Integer> calculateMode(ArrayList<Integer> list) {
        ArrayList<Integer> modeList = new ArrayList<>();
        int maxCount = 0;

        for (int i = 0; i < list.size(); i++) {
            int count = 0;

            // Count the occurrences of list.get(i)
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(list.get(i))) {
                    count++;
                }
            }

            // Check if this count is the highest we've seen
            if (count > maxCount) {
                maxCount = count;
                modeList.clear(); // Clear the mode list and add the new mode
                modeList.add(list.get(i));
            } else if (count == maxCount && !modeList.contains(list.get(i))) {
                modeList.add(list.get(i));
            }
        }

        return modeList;
    }
}
