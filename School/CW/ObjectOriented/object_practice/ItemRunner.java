package School.CW.ObjectOriented.object_practice;

public class ItemRunner {
    public static void main(String args[]) {
        new ItemRunner();
    }

    public ItemRunner() {
        // Creating four Item objects with different values
        Item item1 = new Item();
        Item item2 = new Item(25.99, "mug");
        Item item3 = new Item(10.50, "notebook");
        Item item4 = new Item(5.00, "pen");

        // Accessor calls for each item
        System.out.println(item1.getPrice());
        System.out.println(item1.getName());
        System.out.println(item1.toString());

        System.out.println(item2.getPrice());
        System.out.println(item2.getName());
        System.out.println(item2.toString());

        System.out.println(item3.getPrice());
        System.out.println(item3.getName());
        System.out.println(item3.toString());

        System.out.println(item4.getPrice());
        System.out.println(item4.getName());
        System.out.println(item4.toString());
    }
}
