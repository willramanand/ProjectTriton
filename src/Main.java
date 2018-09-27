import java.util.Random;
import java.util.Scanner;

/* William Ramanand 
 * A sweet program to show off all I learned in COP 2006.*/

public class Main {

	public static void main(String[] args) {
		int iCastUp = 5;
		double dCastDown = 5.6;


		printIntro();
		getCharacterInfo();
		System.out.println(castIntToDouble(iCastUp)); // castIntToDouble is a method call and iCastUp is an argument within this method call
		System.out.println(castDoubleToInt(dCastDown));
		System.out.println(squareNum());
	}

	public static void getCharacterInfo() {
		Person newChar = new Person();

		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter your age: ");
		newChar.setAge(sc.nextInt());

		System.out.println("Enter your gender as M or F: ");
		sc.nextLine();

		// This line capitalizes the M or F and converts from String to char
		newChar.setGender(sc.nextLine());

		System.out.println("Enter your height as a decimal: ");
		newChar.setHeight(sc.nextDouble());

		System.out.println("Are you married, true or false: ");
		newChar.setMarried(sc.nextBoolean());

		sc.nextLine();
		System.out.println("Enter your name: ");
		newChar.setName(sc.nextLine());
		
		sc.close();

		// This line makes sure the first letter of the person's name is capitalized
		// It takes the first letter, capitalizes it, then adds the second letter
		// and since there is no end index in the substring the rest of the String

		System.out.printf("\n%s:\n" + "\tAge: %s\n" + "\tGender: %s\n" + "\tHeight: %s\n" + "\tMarried: %s\n",
				newChar.getName(), newChar.getAge(), newChar.getGender(), newChar.getHeight(), newChar.getMarried());

	}
	// This method takes in int ICastUp and Cast it up to a double and returns double dCastUp
	public static double castIntToDouble(int iCastUp) { // This entire line is a header and int ICastUp is a parameter
		double dCastUp = iCastUp;
		return dCastUp;
	}
	// This method accepts double dCastDown and cast it down to an int
	public static int castDoubleToInt(double dCastDown) {
		int iCastDown = (int) dCastDown; // Here I am casting a double to an integer, which means I am converting it from a larger data type to a smaller one
		return iCastDown;
	}
	// This method generates a random number then squares it
	public static double squareNum() {
		System.out.println("Here is a randomly generated square of a number between 1 and 10: ");
		Random rand = new Random();
		int ranNum = rand.nextInt(10) + 1;
		double sqre = Math.pow(ranNum, 2);
		return sqre;
	}
	
	public static double squareNum(double numToSquare) {
		double sqre = Math.pow(numToSquare, 2);
		return sqre;
	}

	public static void printIntro() {
		final double VERSION = 1.0; // This is a final variable which means it has a constant value
		System.out.println("Welcome user to Project Triton\n" + "This is version " + VERSION);
	}

}
