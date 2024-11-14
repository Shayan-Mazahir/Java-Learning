package School.CW.ObjectOriented.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arrays_List {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("SUZUKIIIIIIIIII");
        cars.add(0, "McLaren");
        cars.set(0, "RedBull");
        // System.out.println("\n" + cars);
        // System.out.println("\n" + cars.get(0));
        // System.out.println("\n" + cars);
        // for (int i = 0; i < cars.size(); i++) {
        // System.out.println("\n" + cars.get(i));
        // }
        Collections.sort(cars); // Sort cars
        for (String i : cars) {
            System.out.println("\n" + i);
        }
        System.out.println("\n" + cars.size());
    }
}
