import java.util.Random;

public class MathOps {
  
  private int iCastUp = 2;
  private double dCastDown = 5.6;
  /*
   * Operator precedence determines the grouping of terms in an expression. This affects how an
   * expression is evaluated. Certain operators have higher precedence than others; for example, the
   * multiplication operator has higher precedence than the addition operator
   */
  
  public int getICastUp() {
    return iCastUp;
  }
  
  public double getDCastDown() {
    return dCastDown;
  }
  
  public void mathOperations() {
    int mathResult;

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
  }
  
  // This method takes in int ICastUp and Cast it up to a double and returns double dCastUp
  public double castIntToDouble() {            // This entire line is a header and int
                                                      // ICastUp is a parameter
    double dCastUp = (double)iCastUp;
    return dCastUp;
  }

  // This method accepts double dCastDown and cast it down to an int
  public int castDoubleToInt() {
    int iCastDown = (int)dCastDown;  // Here I am casting a double to an integer, which means I am
                                     // converting it from a larger data type to a smaller one
    return iCastDown;
  }

  // This method generates a random number then squares it
  public double squareNum() {
    System.out.println("Here is a randomly generated square of a number between 1 and 10: ");
    Random rand = new Random(); // Use of Random Class
    int ranNum = rand.nextInt(10) + 1;
    double sqre = Math.pow(ranNum, 2); // Use of Math Class
    return sqre;
  }
  
  public double power(int numTosqr, int exp) { 
    return (double) Math.pow(numTosqr, exp);
  }

  public double power(double numTosqr, double exp) { // method overload	
	  return Math.pow(numTosqr, exp);		         // example of polymorphism
  }
}
