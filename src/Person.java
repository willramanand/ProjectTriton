

public class Person {

	/*Java has 8 primitive data types: 
	 * byte use to store numerical values from -128 to 127
	 * short - use to store numerical values from -32768 to 32767
	 * int - use to store numerical values from -2,147,483,648 to 2,147,483,647
	 * long - use to store numerical values from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,808
	 * float - a data type use to store numbers with a fractional value
	 * double - a data type that stores a numerical data type that can have a decimal
	 * boolean - a data type that stores a value of true or false
	 * char - a data type that stores a single character
	 * */
	private int age;
	private char gender;
	private double height;
	private boolean married;
	private String name;
	
	// Set name value
	public void setName(String newName) {
		name = newName.substring(0, 1).toUpperCase() + newName.substring(1);
	}
	// Get name value
	public String getName() {
		return name;
	}
	// Set age value
	public void setAge(int newAge) {
		age = newAge;
	}
	// get age value
	public int getAge() {
		return age;
	}
	//set gender
	public void setGender(String newGender) {
		gender = newGender.toUpperCase().charAt(0);
	}
	// get gender
	public char getGender() {
		return gender;
	}
	
	public void setHeight(double newHeight) {
		height = newHeight;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setMarried(boolean newMarried) {
		married = newMarried;
	}
	
	public boolean getMarried() {
		return married;
	}
	
}
