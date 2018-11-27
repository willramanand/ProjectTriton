import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * @WillRam
 * 
 * A sweet program to show off all I learned in COP 2006.
 */

public class Main {

  final static double VERSION = 1.0; // This is a final variable which means it has a constant value

  public static void main(String[] args) {
    printIntro();
  }

  public static void printIntro() {

    int mainMenuSelection = 0;

    Scanner sc = new Scanner(System.in);
    MathOps mo = new MathOps();
    StringOps so = new StringOps();
    Arrays arrayClass = new Arrays();

    System.out.println("Welcome user to Project Triton\n" + "This is version " + VERSION); // Introduction

    do { // do-while loop

      System.out.println("\n_______Main Menu_______" + "\n1. Create a character!"
          + "\n2. Print random mathematical processes to prove my math skills!"
          + "\n3. Compare two inputted words!" + "\n4. Do some array operations!"
          + "\n5. Exit Program");

      System.out.println("Please enter a selection: ");

      try {
        mainMenuSelection = sc.nextInt();
      } catch (Exception e) {
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

  public static void getCharacterInfo() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter your character's name: ");
    String newName = sc.nextLine();

    System.out.println("Please enter your character's gender as M or F: ");
    String newGender = sc.nextLine();

    Character newChar = new Character(newName, newGender);

    newChar.setLevel(50);

    newChar.setCurrentHealth(10);
    newChar.setCurrentPower(0);

    newChar.displayInfo();

    Enemy newEnemy = new Enemy("Bob", "M", 5000, 100);
    newEnemy.displayInfo();

    System.out.println("Now its time to make a car for " + newChar.getName());

    Car car1 = new Car(newChar.getName());

    System.out.println("What is the color of " + newChar.getName() + "'s car?");
    String newColor = sc.nextLine();
    car1.setColor(newColor);
    System.out.println("What is the brand of " + newChar.getName() + "'s car?");
    String newBrand = sc.nextLine();
    car1.setBrand(newBrand);
    System.out.println("What is the model of " + newChar.getName() + "'s car?");
    String newType = sc.nextLine();
    car1.setType(newType);
    System.out.println("What is the speed of " + newChar.getName() + "'s car?");
    int newSpeed = sc.nextInt();
    car1.setSpeed(newSpeed);
    System.out.println("What is the horsepower of " + newChar.getName() + "'s car?");
    int newHorsepower = sc.nextInt();
    car1.setHorsepower(newHorsepower);
    car1.displayInfo();

    System.out.println("\n\n" + newEnemy.getName() + " approaches with his car!");
    Car bobCar = new Car();

    bobCar.setColor("Black");
    bobCar.setBrand("Bugatti");
    bobCar.setType("Veyron");
    bobCar.setSpeed(324);
    bobCar.setHorsepower(1000);
    bobCar.displayInfo();
  }
}
