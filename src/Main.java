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

		do {

			System.out.println("\n_______Main Menu_______" + "\n1. Create a character!"
					+ "\n2. Print random mathematical processes to prove my math skills!"
					+ "\n3. Compare two inputted words!" + "\n4. Do some array operations!" + "\n5. Exit Program");

			System.out.println("Please enter a selection: ");

			try {
				mainMenuSelection = sc.nextInt();
			} catch (Exception e) {
				sc.next();
			}

			switch (mainMenuSelection) {
			case 1:
				getCharacterInfo();
				break; // Exits the switch statement so the cases do not continue.
			case 2:
				System.out.println("The integer " + mo.getICastUp() + " casted to a double is " + mo.castIntToDouble());
				// castIntToDouble is a method call and
				// iCastUp is an argument within this method
				// call
				System.out
						.println("The double " + mo.getDCastDown() + " cast to an integer is " + mo.castDoubleToInt());
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

		System.out.printf("\n%s: \n" + "\tGender: %s\n" + "\tHealth: %s/%s HP \n" + "\tPower: %s/%s Power \n",
				newChar.getName(), newChar.getGender(), newChar.getCurrentHealth(), newChar.getMaxHealth(),
				newChar.getCurrentPower(), newChar.getMaxPower());

		Enemy newEnemy = new Enemy("Bob", "M", 5000, 100);
		newEnemy.displayInfo();
	}
}
