package code.Chapter_8.code;

    class Employee {
        int id;
        int salary;
        String name;
        public void details(){
            System.out.print("My name is " + name);
            System.out.println();
            System.out.println("and my id is " + id);
        }
        public int getSalary() {
            return salary;
        }
    }
    public class Main {
        public static void main(String[] args) {
            System.out.println();
            System.out.println("This is the 'main' class");
            Employee raza = new Employee(); //Instantiating a new object of Employee
            Employee ahmed = new Employee();
            // Setting properties
            ahmed.id = 99;
            ahmed.name = "Ahmed Mustafa";
            ahmed.salary = 1000;
            raza.salary = 7000;
            raza.id = 14;
            raza.name = "Something";

            raza.details();
            ahmed.details();
            int salary = ahmed.getSalary();
            System.out.println(salary);
            //Printing the properties/attributes
            // System.out.println(raza.id);
            // System.out.println(raza.name);
        }
    }
    

