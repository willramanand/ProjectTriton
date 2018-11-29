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

  @Override
  public void displayInfo() { // overriding a method is an example of polymorphism
    System.out.println("\nAn enemy emerges: \n" + "Name: " + name + "\t\nGender: " + gender
        + "\t\nHealth: " + health + "\t\nPower: " + power);
  }
}
