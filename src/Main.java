import java.awt.Canvas;
import java.awt.Frame;
import java.util.Random;
import java.util.Scanner;

/*
 * @WillRam 
 * 
 * A sweet program to show off all I learned in COP 2006.
 */

public class Main extends Canvas {
  
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  static final int HEIGHT = 480;
  static final int WIDTH = 640;
  final static double VERSION = 1.0; // This is a final variable which means it has a constant value
   
  
  public static void main(String[] args) {
    
//    Frame frame = new Frame();
//    
//    frame.setVisible(false);
//    frame.setSize(WIDTH, HEIGHT);
//    frame.setResizable(false);
//    frame.setTitle("Integration Project");
//    frame.setVisible(true);
    printIntro();
    }

  public static void printIntro() {
    
    int mainMenuSelection = 0;

    Scanner sc = new Scanner(System.in);
    MathOps mo = new MathOps();
    StringOps so = new StringOps();
    Arrays arrayClass = new Arrays();
  
    System.out.println("Welcome user to Project Triton\n" + "This is version " + VERSION); // Introduction
    
    while (mainMenuSelection != 5) {
      
      System.out.println("\n_______Main Menu_______" + "\n1. Create a character!"
          + "\n2. Print random mathematical processes to prove my math skills!"
          + "\n3. Compare two inputted words!"
          + "\n4. Do some array operations!"
          + "\n5. Exit Program");
      
      System.out.println("Please enter a selection: ");
      mainMenuSelection = sc.nextInt();
      
        switch (mainMenuSelection) {
          case 1:
            getCharacterInfo();
            break;
          case 2:
            System.out.println(
                "The integer " + mo.getICastUp() + " casted to a double is " + mo.castIntToDouble()); 
                // castIntToDouble is a method call and
                // iCastUp is an argument within this method
                // call
            System.out.println(
                "The double " + mo.getDCastDown() + " cast to an integer is " + mo.castDoubleToInt());
            System.out.println(mo.squareNum());
            mo.mathOperations();
            break;
          case 3:
            so.strComp();
            break;
          case 4:
            arrayClass.arrayOps();
            break;
          case 5:
            System.out.println("Goodbye!");
            break;
          default:
            System.out.println("That is not a valid choice!");
            break;
        }
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

}
