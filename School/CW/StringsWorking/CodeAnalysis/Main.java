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
            //
            

    }
}
