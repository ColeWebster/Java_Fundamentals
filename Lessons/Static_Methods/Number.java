public class Number {

  int firstNumber;
  int secondNumber;

  public Number(int num1, int num2) {
    firstNumber = num1;
    secondNumber = num2;
  }

  // Non static method
  public int returnSum() {
    return firstNumber + secondNumber;
  }

  public static void main(String[] args) {
    // Create an object
    Number myNumbers = new Number(2, 5);
    // Call a non-static method on object
    int sum = myNumbers.returnSum();
    System.out.println(sum);
  }
}

/*
 * In the above code, we had to create an object of type Numbers in order to use the non-static method returnSum()
 * With non-static methods, if we dont create an obkject of this class (or one of its subclasses), we dont have access to its methods.
 * This isnt the case for static methods
 */