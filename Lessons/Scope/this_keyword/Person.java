public class Person {

  public int age;
  public int wisdom;
  public int fitness;

  public Person(int inputAge) {
    this.age = inputAge;
    this.wisdom = inputAge * 5;
    this.fitness = 100 - inputAge;
  }

  public void setAge(int newAge) {
    this.age = newAge;
  }

  public void setWisdom(int newWisdom) {
    this.wisdom = newWisdom;
  }

  public void setFitness(int newFitness) {
    this.fitness = newFitness;
  }

  public void hasBirthday() {
    //Complete this method
    this.age += 1;
    this.wisdom += 5;
    this.fitness -= 3;
  }

  public static void main(String[] args) {
    Person emily = new Person(20);
    emily.hasBirthday();
    System.out.println("New age is: " + emily.age);
    System.out.println("New wisdom is: " + emily.wisdom);
    System.out.println("New fitness is: " + emily.fitness);
  }
}

// We are using the this on methods this time.
// We've given a Person class with three instance variables, age - wisdom - fitness. They get initalized to different values when the constructor is called.
// When completeing the hasBirthday( method ) we will manipulate age to increase by 1, wisdom increase by 5 and decrease fitness by 3;
// 

/*
- Explain this method in simple terms

class myDemoClass(){
  
  int demoInstanceVariable;
  
  public void methodOne(){
    this.methodTwo(this);
  }
  
  public void methodTwo(myDemoClass a){
    System.out.println(a.demoInstanceVariable);
  }
  
}

- Whatever object(this) that called methodOne() proceeds to call methodTwo(). 
- methodTwo() takes a myDemoClass object as a parameter, so in addition to calling the method, this passes itself as aparameter to methodTwo().

 */

 // Encapsulation =  The concept of separating methods and variables into distinct bundles of logic.

 // Not true about Mutator Methods = return the value of an instance variable. 