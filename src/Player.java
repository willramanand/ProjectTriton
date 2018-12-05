/**
 * Class is extension of Character abstract class. Used to create character from user inputed
 * values.
 * 
 * @author wramanand
 *
 */
public class Player extends Character {

  /**
   * Constructor for class player.
   * 
   * @param newName user inputed value for their name.
   * @param newGender user inputed value for their gender.
   * @param level automatically is set by program to 50.
   * @param currentHealth automatically set by program.
   * @param currentPower automatically set by program.
   */
  public Player(String newName, String newGender, int level, double currentHealth,
      int currentPower) {
    super(newName, newGender);
    setLevel(level);
    setCurrentHealth(currentHealth);
    setCurrentPower(currentPower);
  }

}
