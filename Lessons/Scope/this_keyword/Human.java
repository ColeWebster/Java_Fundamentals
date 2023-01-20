public class Human(){
    public String name;

    public Human(String inputName){
        this.name = inputName;
    }

    public void sayName(String name){
        System.out.println("My name is " + name);
    }

    public static void main(String[] args){
        Human hero = new Human("Clark Kent");
        hero.sayName("Superman");
    }
}

// sayName is a void method but it still prints something. In this case since we're not using this.name, the local variable will be printed. Superman is the local variable passed as a parameter. 