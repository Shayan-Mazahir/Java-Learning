package School.CW.ObjectOriented.linked_lists;

import java.util.*;

public class LinkedListExample2 {
    public static void main(String[] args) {
        System.out.println("Linked List Example!");
        LinkedList list = new LinkedList();
        int num1 = 11, num2 = 22, num3 = 33, num4 = 44;
        int size;
        Iterator iterator;
        // Adding data in the list
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(4));
        size = list.size();
        System.out.print("Linked list data: ");
        // Create a iterator
        iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        // Check list empty or not
        if (list.isEmpty()) {
            System.out.println("Linked list is empty");
        } else {
            System.out.println("Linked list size: " + size);
        }
        System.out.println("Adding data at 1st location: 55");
        // Adding first
        list.addFirst(new Integer(55));
        System.out.print("Now the list contain: ");
        iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Now the size of list: " + list.size());
        System.out.println("Adding data at last location: 66");
        // Adding last or append
        list.addLast(new Integer(66));
        System.out.print("Now the list contain: ");
        iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Now the size of list: " + list.size());
        System.out.println("Adding data at 3rd location: 55");
        // Adding data at 3rd position
        list.add(2, new Integer(99));
        System.out.print("Now the list contain: ");
        iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Now the size of list: " + list.size());
        // Retrieve first data
        System.out.println("First data: " + list.getFirst());
        // Retrieve lst data
        System.out.println("Last data: " + list.getLast());
        // Retrieve specific data
        System.out.println("Data at 4th position: " + list.get(3));
        // Remove first
        Integer first = (Integer) list.removeFirst();
        System.out.println("Data removed from 1st location: " + first);
        System.out.print("Now the list contain: ");
        iterator = list.iterator();
        // After removing data

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Now the size of list: " + list.size());
        // Remove last
        Integer last = (Integer) list.removeLast();
        System.out.println("Data removed from last location: " + last);
        System.out.print("Now the list contain: ");
        iterator = list.iterator();
        // After removing data

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Now the size of list: " + list.size());
        // Remove 2nd data
        Integer second = (Integer) list.remove(1);
        System.out.println("Data removed from 2nd location: " + second);
        System.out.print("Now the list contain: ");
        iterator = list.iterator();
        // After removing data

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Now the size of list: " + list.size());
        // Remove all
        list.clear();
        if (list.isEmpty()) {
            System.out.println("Linked list is empty");
        } else {
            System.out.println("Linked list size: " + size);
        }
    }
}
