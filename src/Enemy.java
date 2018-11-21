// Inheritance allows a developer to use the same code in many different ways
// Essentially it reduces the amount of work that needs to be done due to reusability of code.
public class Enemy extends Character {
	int health;
	int power;

	public Enemy(String newName, String newGender, int newHealth, int newPower) { // super and this
		super(newName, newGender);
		this.health = newHealth;
		this.power = newPower;
	}

	public void displayInfo() {
		System.out.println("An enemy emerges: \n" + "Name: " + name + "\nGender: " + gender + "\nHealth: " + health
				+ "\nPower: " + power);
	}
}
