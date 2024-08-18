package code.Chapter_8.Exercise;

/*

    Create a class Employee with the following properties and methods:

    Salary (property) (int)
    getSalary (method returning int)
    name (property) (String)
    getName (method returning String)
    setName (method changing name)
    */
//custom class
class Employee {
    //properties
    int salary;
    String name;
    
    //functions/methods
    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }   
    public void setname(String new_name) {
        name = new_name;
    
    }

}
    public class question1 {
    public static void main(String[] args) {
        Employee ahmed = new Employee();
        ahmed.salary = 100;
        ahmed.name = "Ahmed Afaq";
        System.out.println("Employee's old name: " + ahmed.getName() + "\nEmployee Salary: " + ahmed.getSalary());
        ahmed.setname("Ahmed Mustafa");
        System.out.println("Employee's new name: " + ahmed.getName() + "\nEmployee Salary: " + ahmed.getSalary());
    }
}
