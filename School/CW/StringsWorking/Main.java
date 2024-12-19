package School.CW.StringsWorking;

public class Main {
    public static void main(String[] args) {
        //in the ppt it says it compares the UNICODE... are we supposed to learn the UNICODES? Or how are we supposed to know them?
        String greeting = "This is a very beautiful day";
        String response = "Enjoy the simple things in your life!";
        // System.out.println(greeting.equals(response));
        // System.out.println(response.compareTo(greeting));
       
        // System.out.println("\n Eephant" + greeting);
        // System.out.println(greeting.charAt(0));
        // System.out.println(greeting.equals("\n" + response));
        // System.out.println(greeting.concat("\n" + response));
        // System.out.println(greeting.concat("" + response));

        // System.out.println("\n" + greeting.length());
        // System.out.println(greeting.replace("This is", "Have"));
        System.out.println(greeting.indexOf("a"));
        // System.out.println("\n" + response.lastIndexOf("Life".toLowerCase()));

    }
}
