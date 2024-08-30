package code.Chapter_10.code;
//ake class animal and derive another class dog from it
class animal {
    public String cat;
    public String getCat(){
        return cat;
    }
    public String setCat(String cat) {
        this.cat = cat;
        return cat;
    }
}
class dog extends animal {
    public String dog = "Woof"; 
    public String setDog(){
        return dog;
    }
    public String returnDog(String dog){
        this.dog = dog;
        return dog;
    }
}
public class quiz {
    public static void main(String[] args) {
        animal a = new animal();
        a.setCat("Meow");
        System.out.println(a.getCat());

        dog d = new dog();
        d.setDog();
        System.out.println(d.returnDog("woof"));
    }
}
