package School.CW.StringsWorking.CodeAnalysis;

public class Main {
    public static void main(String[] args) {
            String string1 = "Hubba";
            String string2 = "Bubba";

            //Question 1
            String string3 = (string1.concat(string2));
            System.out.println(string3);
            //HubbaBubba - remember exactly as it is; if no space then no space
            
            //Question 2
            System.out.println(string3.replace("b", "g"));
            //HuggaBugga

            //Question 3
            System.out.println(string1.toUpperCase( ));
            //HUBBA

            //Question 4
            System.out.println(string3.indexOf("ub"));
            //1 - remember; it starts from o and not 1

            //Question 5 
            System.out.println(string3.lastIndexOf("ub"));
            //no idea

            //Question 6
            System.out.println(string3.charAt(4));
            //HubbaBubba - a

            //Question 7
            System.out.println(string2.substring(1));
            //no idea

            //Question 8
            System.out.println(string3.substring(3,6));
            //no idea

            //Question 9
            System.out.println(string1.equals("HUBBA"));
            //false

            //Question 10
            System.out.println(string1.compareTo(string2));
            //again, how do i compare UNICODES?

            //Question 11
            System.out.println(string1.compareTo(string1));
            //again... unicodes?

            //Question 12
            System.out.println(string1.compareTo("HUBBA"));
            //UNICODES?!

            //Question 13
            System.out.println(string1.compareTo("Habba"));
            //UNICODES?
            

    }
}
