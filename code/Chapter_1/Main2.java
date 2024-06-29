package code.Chapter_1;

public class Main2 {
    public static void main(String[] args) {
        byte age = 34;
        int age_2 = 40;
        short age_3 = 30;
        //byte int and short are the only 3 types of integers
        long age_4 = 34444443333L;
        //long is basically an integer but with more storage, it can not store a decimanl number
        float number = 34.877565F;
        double number_2 = 3.444444444444444444444444444444444444444444444444;
        //by default u dont need to write d/D after double
        char name = 'R';
        //character only needs to have 1 '' not 2 "", 2 is used in string not a character
        String name_2 = "Java";
        //and for some reason String needs to be defined as String.... 
        System.out.println(age);
        System.out.println(age_2);
        System.out.println(age_3);
        System.out.println(age_4);
        System.out.println(number);
        System.out.println(number_2);
        System.out.println(name);
        System.out.println(name_2);
    }
}
