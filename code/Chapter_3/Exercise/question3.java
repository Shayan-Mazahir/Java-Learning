package code.Chapter_3.Exercise;
//replace books_name with a name
import java.util.Scanner;;
public class question3 {
    public static void main(String[] args) {
        System.out.println("Please enter the name of the book: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        input.close();
        String line = "The books name is: book_name";
        String final_message = line.replace("book_name", name);
        System.out.println(final_message);
    }
}
