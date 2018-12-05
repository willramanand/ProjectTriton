import java.util.Scanner;

/**
 * A sweet program to show off all I learned in COP 2006.
 * 
 * @author wramanand
 */
public class Main {

  /**
   * The version number for the program.
   */
  static final double VERSION = 1.0;

  /**
   * The variable for the selection in the main menu.
   */
  private static int mainMenuSelection;

  /**
   * This is the default main method which runs the program.
   * 
   * @param args Documents command-line arguments.
   */
  public static void main(String[] args) {
    printIntro();
  }

  /**
   * Prints the introduction to the program and allows the user to select which part of the program
   * they are using.
   */
  public static void printIntro() {

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    MathOps mo = new MathOps();
    StringOps so = new StringOps();
    Arrays arrayClass = new Arrays();

    System.out.println("Welcome user to Project Triton\n" + "This is version " + VERSION);

    do { // do-while loop

      System.out.println("\n_______Main Menu_______" + "\n1. Create a character!"
          + "\n2. Print random mathematical processes to prove my math skills!"
          + "\n3. Compare two inputted words!" + "\n4. Do some array operations!"
          + "\n5. Exit Program");

      System.out.println("Please enter a selection: ");

      try {
        mainMenuSelection = sc.nextInt();
      } catch (Exception ex) {
        sc.next();
      }

      switch (mainMenuSelection) {
        case 1:
          getCharacterInfo();
          break; // Exits the switch statement so the cases do not continue
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
    } while (mainMenuSelection != 5);
  }

  /**
   * Used to get user input for a custom character and then creates an object with that information.
   */
  public static void getCharacterInfo() {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter your character's name: ");

    /**
     * Stores user inputed name for Character.
     */
    String newName = "";

    newName = sc.nextLine();

    System.out.println("Please enter your character's gender as M or F: ");

    /**
     * Stores user inputed gender for Character.
     */
    String newGender = "";

    newGender = sc.nextLine();

    Character[] ch = new Character[2]; // Polymorphism example

    ch[0] = new Player(newName, newGender, 50, 10, 0);
    ch[1] = new Enemy("Bob", "M", 5000, 1000);

    for (Character characters : ch) {
      characters.displayInfo();
    }

    System.out.println("\nNow its time to make a car for " + ch[0].getName());

    Car[] car = new Car[2];
    car[0] = new Car(ch[0].getName());

    System.out.println("\nWhat is the color of " + ch[0].getName() + "'s car?");
    String newColor = sc.nextLine();
    car[0].setColor(newColor);

    System.out.println("What is the brand of " + ch[0].getName() + "'s car?");
    String newBrand = sc.nextLine();
    car[0].setBrand(newBrand);

    System.out.println("What is the model of " + ch[0].getName() + "'s car?");
    String newType = sc.nextLine();
    car[0].setType(newType);

    System.out.println("What is the speed of " + ch[0].getName() + "'s car?");
    int newSpeed = sc.nextInt();
    car[0].setSpeed(newSpeed);

    System.out.println("What is the horsepower of " + ch[0].getName() + "'s car?");
    int newHorsepower = sc.nextInt();
    car[0].setHorsepower(newHorsepower);

    System.out.println("\n\n" + ch[1].getName() + " approaches with his car!");
    car[1] = new Car();
    car[1].setColor("Black");
    car[1].setBrand("Bugatti");
    car[1].setType("Veyron");
    car[1].setSpeed(324);
    car[1].setHorsepower(1000);

    for (Car cars : car) {
      cars.displayInfo();
    }
  }
}
