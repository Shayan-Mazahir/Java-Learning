package code.Chapter_9.code;

class MyEmployee {
    private int id;
    private String name;

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

public class Main {
    public static void main(String[] args) {
        MyEmployee ahmed = new MyEmployee();
        // ahmed.id = 90;
        // ahmed.name = "Ahmed Mustafa";

        ahmed.setName("AHmed Mustafa");
        System.out.println(ahmed.getName());
    }
}
