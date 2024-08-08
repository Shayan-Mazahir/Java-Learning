package code.Chapter_6.code;

public class Main1 {
    public static void main(String[] args) {
        int [] marks = {100, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.println(marks.length);
        System.out.println("Pring using normla method");
        System.out.println(marks[0]);
        
        System.out.println("printing using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("Printing using for loop in reverse order");
        for(int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println("Printing using for-each loop");
        for(int element: marks){
            System.out.println(element);
        }
    }
}
