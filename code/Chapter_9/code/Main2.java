package code.Chapter_9.code;

//Quiz: Overload the employee constructor with salary 1000
class MyEmployee2 {
    private int id;
    private String name;
    private double salary = 1000;

    public MyEmployee2(String myName, int myid, double salary_person) {
        id = myid;
        name = myName;
        salary = salary_person;
    }
    public MyEmployee2(String myName, int myid) {
        id = myid;
        name = myName;
    }

    public double getSalary(){
        return this.salary;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i) {
        this.id = i;
    }
    public int getId() {
        return this.id;
    }

}

public class Main2 {
    public static void main(String[] args) {
        MyEmployee2 ahmed = new MyEmployee2("Ahmed", 20);
        System.out.println("\n" + ahmed.getId());
        System.out.println(ahmed.getName());
        System.out.println(ahmed.getSalary());
    }
}
