public class ExerciseOne {

  public static void main(String[] args) {
    int randomNum = (int) (Math.random() * 10) + 1;
    System.out.println(
      "Your random number between one and ten is " + randomNum
    );

    int negativeNum = -2;
    int absNum = Math.abs(negativeNum);
    System.out.println(
      "The absolute value of " + negativeNum + " is " + absNum
    );

    String myNewString = Integer.toString(1);
    System.out.println(myNewString);
  }
}

/*
* Math.random() = Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0. Returned values are chosen pseudorandomly with (approximately) uniform distribution from that range.

* Math.abs() = Returns the absolute value of an int value. If the argument is not negative, the argument is returned. If the argument is negative, the negation of the argument is returned.

* Integer.toString() = Returns a String object representing the specified integer. The argument is converted to signed decimal representation and returned as a string, exactly as if the argument and radix 10 were given as arguments to the toString(int, int) method.
 */