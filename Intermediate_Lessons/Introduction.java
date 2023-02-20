package Intermediate_Lessons;

public class Introduction {

  public static void main(String[] args) {
    String name = "Cole";
    String hobbies = "Modeling making";
    int age = 35;

    System.out.println("My name is " + name);
    System.out.printf("I am %d years old\n", age);
    System.out.print("My hobbies are " + hobbies);
  }
}
/* 
System.out.printf() allows us to output strings that are formatted in the code using format specifiers. 
        
These begin with the % sign, followed by the type of variable we want to print. 
        
%s for a string, %c for a character and %d for an integer. 
        
\n will add a new line to what is being printed.
*/
