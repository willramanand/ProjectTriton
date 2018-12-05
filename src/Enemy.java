
/**
 * Enemy is and extension of class Character. Used to generate enemies in program.
 * 
 * @author wramanand
 *
 */
// Inheritance allows a developer to use the same code in many different ways
// Essentially it reduces the amount of work that needs to be done due to reusability of code.
public class Enemy extends Character {
  /**
   * Stores value for health of Enemy.
   */
  int health;

  /**
   * Stores value for power of Enemy.
   */
  int power;

  /**
   * Constructor for enemy extends constructor for Character. Automatically sets value for name,
   * gender, health, and power of Enemy.
   * 
   * @param newName value for name.
   * @param newGender value for gender.
   * @param newHealth value for health.
   * @param newPower value for power.
   */
  public Enemy(String newName, String newGender, int newHealth, int newPower) { // super and this
    super(newName, newGender);
    this.health = newHealth;
    this.power = newPower;
  }

  /**
   * Displays basic information about this Enemy. Overrides Character displayInfo method.
   */
  @Override
  public void displayInfo() { // overriding a method is an example of polymorphism
    System.out.println("\nAn enemy emerges: \n" + "Name: " + name + "\t\nGender: " + gender
        + "\t\nHealth: " + health + "\t\nPower: " + power);
  }
}
