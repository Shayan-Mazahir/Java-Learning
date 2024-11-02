package School.CW.ObjectOriented;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arrays_List {
    ArrayList<String> transformers = new ArrayList<>();

    // Constructor to initialize the transformers list
    public Arrays_List() {
        transformers.add("Optimus Prime");
        transformers.add("Bumblebee");
        transformers.add("Megatron");
    }

    ArrayList<String> places = new ArrayList<>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));

    public static void main(String[] args) {
        // Create an instance of the Arrays_List class
        Arrays_List arraysInstance = new Arrays_List();

        // Get the size of the transformers list
        int size = arraysInstance.transformers.size();
        System.out.println("Number of elements in transformers: " + size);

        // Sort the transformers list and print it
        Collections.sort(arraysInstance.transformers);
        System.out.println("Sorted transformers list: " + arraysInstance.transformers);

        // Access the places list through the instance
        System.out.println("First place: " + arraysInstance.places.get(0));
    }
}
