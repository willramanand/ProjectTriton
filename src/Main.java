import java.awt.Canvas;
import java.awt.Frame;
import java.util.Random;
import java.util.Scanner;

/*
 * William Ramanand A sweet program to show off all I learned in COP 2006.
 */

public class Main extends Canvas {
  
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  static final int HEIGHT = 480;
  static final int WIDTH = 640;
  final static double VERSION = 1.0; // This is a final variable which means it has a constant value
  static int iCastUp = 2;
  static double dCastDown = 5.6;
  
  
  public static void main(String[] args) {
    
    Frame frame = new Frame();
    
    frame.setVisible(false);
    frame.setSize(WIDTH, HEIGHT);
    frame.setResizable(false);
    frame.setTitle("Integration Project");
    frame.setVisible(true);
    
    
    
    
    System.out.println("Welcome user to Project Triton\n" + "This is version " + VERSION); // Introduction
    printIntro();

    }

  public static void printIntro() {
    
    int mainMenuSelection;

    Scanner sc = new Scanner(System.in);

    
    System.out.println("_______Main Menu_______" + "\n1. Create a character!"
          + "\n2. Print random mathematical processes to prove my math skills!"
          + "\n3. Compare two inputted words!"
          + "\n4. Exit Program");
  
    System.out.println("Please enter a selection: ");
    mainMenuSelection = sc.nextInt();
    
      switch (mainMenuSelection) {
        case 1:
          getCharacterInfo();
          break;
        case 2:
          System.out.println(
              "The integer " + iCastUp + " casted to a double is " + castIntToDouble(iCastUp)); 
              // castIntToDouble is a method call and
              // iCastUp is an argument within this method
              // call
          System.out.println(
              "The double " + dCastDown + " cast to an integer is " + castDoubleToInt(dCastDown));
          System.out.println(squareNum());
          mathOps();
          break;
        case 3:
          strComp();
          break;
        default:
          System.out.println("That is not a valid choice!");
          break;
      }
    sc.close();
  }

  public static void getCharacterInfo() {
    Character newChar = new Character();
    
    newChar.setLevel(50);

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your character's gender as M or F: ");
    newChar.setGender(sc.nextLine());

    System.out.println("Enter your character's name: ");
    newChar.setName(sc.nextLine());

    sc.close();

    newChar.setCurrentHealth(10);
    newChar.setCurrentPower(0);


    System.out.printf(
        "\n%s: \n" + "\tGender: %s\n" + "\tHealth: %s/%s HP \n" + "\tPower: %s/%s Power \n",
        newChar.getName(), newChar.getGender(), newChar.getCurrentHealth(), newChar.getMaxHealth(),
        newChar.getCurrentPower(), newChar.getMaxPower());

    
  }

  // This method takes in int ICastUp and Cast it up to a double and returns double dCastUp
  public static double castIntToDouble(int iCastUp) { // This entire line is a header and int
                                                      // ICastUp is a parameter
    double dCastUp = (double)iCastUp;
    return dCastUp;
  }

  // This method accepts double dCastDown and cast it down to an int
  public static int castDoubleToInt(double dCastDown) {
    int iCastDown = (int) dCastDown; // Here I am casting a double to an integer, which means I am
                                     // converting it from a larger data type to a smaller one
    return iCastDown;
  }

  // This method generates a random number then squares it
  public static double squareNum() {
    System.out.println("Here is a randomly generated square of a number between 1 and 10: ");
    Random rand = new Random(); // Use of Random Class
    int ranNum = rand.nextInt(10) + 1;
    double sqre = Math.pow(ranNum, 2); // Use of Math Class
    return sqre;
  }

  /*
<<<<<<< HEAD
   * Operator precedence determines the grouping of terms in an expression. This affects how an
   * Operator precedence determines the grouping of terms in an expression. \ This affects how an
   * expression is evaluated. Certain operators have higher precedence than others; for example, the
   * multiplication operator has higher precedence than the addition operator
   */

  public static void mathOps() {
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

  public static void strComp() {
    Scanner sc = new Scanner(System.in);

    String word1;
    String word2;

    System.out.println("Please enter a random word: ");
    word1 = sc.nextLine();
    System.out.println("Please enter another random word: ");
    word2 = sc.nextLine();


    if (word1.equals(word2) && word1.compareTo(word2) == 0) {
      System.out.println("You entered the same word!");
    } else if (word1.equalsIgnoreCase(word2) || word1.compareTo(word2) == 0) {
      System.out
          .println("You entered the same word but their letters are not all in the same case!");
    } else {
      System.out.println("You did not enter the same word!");
    }
    sc.close();
  }

}
