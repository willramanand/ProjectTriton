import java.util.Random;

/**
 * Demonstrates a variety of mathematical operations.
 * 
 * @author wramanand
 *
 */
public class MathOps {

  /**
   * Stores value for integer that will be cast up.
   */
  private int icastUp = 2;

  /**
   * Stores value for double that will be cast down.
   */
  private double dcastDown = 5.6;

  /**
   * Gets value of integer cast up.
   * 
   * @return integer cast up.
   */
  public int getICastUp() {
    return icastUp;
  }

  /**
   * Gets value of double that will be cast down.
   * 
   * @return double cast down.
   */
  public double getDCastDown() {
    return dcastDown;
  }

  /**
   * Performs addition, subtraction, multiplication, division, remainder, and incrementing and
   * decrementing.
   */
  public void mathOperations() {
    int mathResult;

    /*
     * Operator precedence determines the grouping of terms in an expression. This affects how an
     * expression is evaluated. Certain operators have higher precedence than others; for example,
     * the multiplication operator has higher precedence than the addition operator
     */
    mathResult = 1 + 1;
    System.out.println("\n1 + 1 = " + mathResult);

    mathResult = 2 - 5;
    System.out.println("2 - 5 = " + mathResult);

    mathResult = 5 * 5;
    System.out.println("5 * 5 = " + mathResult);

    mathResult = 15 / 5;
    System.out.println("15 / 5 = " + mathResult);

    mathResult = 13 % 2;
    System.out.println("13 % 2 = " + mathResult);

    mathResult++;
    System.out.println("Incrementing the last result by 1 = " + mathResult);

    mathResult--;
    System.out.println("Decrementing the last result by 1 = " + mathResult);

    mathResult += 10;
    System.out.println("Adding 10 to the last value = " + mathResult);

    System.out.println("Adding 1 and 2: " + add(1, 2));
    System.out.println("Adding 1, 2 and 3: " + add(1, 2, 3));
  }

  /**
   * Takes the integer and cast it up to a double.
   * 
   * @return double of integer that was casted up.
   */
  public double castIntToDouble() { // This entire line is a header and int
    double dcastUp = (double) icastUp; // ICastUp is a parameter
    return dcastUp;
  }

  /**
   * Takes the double and casts it down to an integer.
   * 
   * @return integer of double that was cast down.
   */
  public int castDoubleToInt() {
    int icastDown = (int) dcastDown; // Here I am casting a double to an integer, which means I am
    return icastDown; // converting it from a larger data type to a smaller one
  }

  /**
   * Generates random number then squares it.
   * 
   * @return the square of random number.
   */
  public double squareNum() {
    System.out.println("Here is a randomly generated square of a number between 1 and 10: ");
    Random rand = new Random(); // Use of Random Class
    int ranNum = rand.nextInt(10) + 1;
    double sqre = Math.pow(ranNum, 2); // Use of Math Class
    return sqre;
  }

  /**
   * Adds two values together.
   * 
   * @param a First user inputed value.
   * @param b Second user inputed value.
   * @return sum of a and b.
   */
  public int add(int a, int b) {
    return a + b;
  }

  /**
   * Adds three values together.
   * 
   * @param a First user inputed value.
   * @param b Second user inputed value.
   * @param c Third user inputed value.
   * @return sum of a, b and c.
   */
  public int add(int a, int b, int c) { // method overload
    return a + b + c; // example of polymorphism
  }
}
