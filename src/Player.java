
public class Player extends Character {

  public Player(String newName, String newGender, int level, double currentHealth, int currentPower) {
    super(newName, newGender);
    setLevel(level);
    setCurrentHealth(currentHealth);
    setCurrentPower(currentPower);
  }

}
