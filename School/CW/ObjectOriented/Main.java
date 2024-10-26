package School.CW.ObjectOriented;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal(100, 25, "red", "Extra Large", "Optimus Prime", "cat");
        Animal a2 = new Animal(100, 25, "grey", "Extra Large", "Megatron", "cat");
        Animal a3 = new Animal("Jerry", "mouse");
        Animal a4 = new Animal("Tom", "cat");

//        int x = 6;
//        float y = 70.4f;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        //== works for primitive data type .equals() works for the non-primitve data types
        if (a1.equals(a1)) {
            System.out.println("Those are the same catformers");
        }

//        if (a1.compareTo()) {
        a1.talk();
        a2.talk();
        a3.talk();
    }
}
