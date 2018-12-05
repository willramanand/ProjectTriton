/**
 * Abstract class character used to create base class for all characters within program.
 * 
 * @author wramanand
 *
 */
public abstract class Character {

  /*
   * Java has 8 primitive data types: byte use to store numerical values from -128 to 127 short -
   * use to store numerical values from -32768 to 32767 int - use to store numerical values from
   * -2,147,483,648 to 2,147,483,647 long - use to store numerical values from
   * -9,223,372,036,854,775,808 to 9,223,372,036,854,775,808 float - a data type use to store
   * numbers with a fractional value double - a data type that stores a numerical data type that can
   * have a decimal boolean - a data type that stores a value of true or false char - a data type
   * that stores a single character
   */

  /*
   * All variables below establish the data type for each and makes them private. Private means
   * their scope is kept within this class and to access the variables you must use the getter or
   * setter below.
   */

  /**
   * Stores value for name of Character.
   */
  protected String name;

  /**
   * Stores value for level of Character.
   */
  protected int level;

  /**
   * Stores value for max level of Character.
   */
  private int maxLevel = 50;

  /**
   * Stores value for current power level of Character.
   */
  protected int currentPower;

  /**
   * Stores value for base max power of Character.
   */
  private static int baseMaxPower = 10;

  /**
   * Stores value for current health of Character.
   */
  protected double currentHealth;

  /**
   * Stores value for base max health of Character.
   */
  private static double baseMaxHealth = 50.0;

  /**
   * Stores value for Gender of Character as char.
   */
  protected char gender;

  /**
   * Stores value for item Character has. Currently unused.
   */
  private String item;

  /**
   * Stores full gender as String. Currently unused.
   */
  @SuppressWarnings("unused")
  private String genderFull;

  /**
   * Constructor for class Character. Automatically sets name and gender.
   * 
   * @param newName used to set value of name for this Character.
   * @param newGender used to set value of gender for this Character.
   */
  public Character(String newName, String newGender) {
    this.name = newName.substring(0, 1).toUpperCase() + newName.substring(1);
    this.gender = newGender.toUpperCase().charAt(0);
    // charAt is the last of three methods from String class

    // This line capitalizes the M or F and converts from String
    // to char

    // Below is the if/else statement
    if (gender == 'M') { // == Operator compares both sides to see if
      this.genderFull = "Male"; // they are the same, if they are its value
    } else if (gender == 'F') { // is true, if not then false.
      this.genderFull = "Female";
    }
  }

  /**
   * Gets name of Character.
   * 
   * @return name of this Character.
   */
  public String getName() {
    return name;
  }

  /**
   * Sets current health of Character.
   * 
   * @param newCurrentHealth uses this value to set current health.
   */
  public void setCurrentHealth(double newCurrentHealth) {
    currentHealth = newCurrentHealth;
  }

  /**
   * Gets current health of Character.
   * 
   * @return current health of this Character.
   */
  public double getCurrentHealth() {
    return currentHealth;
  }

  /**
   * Gets max health of Character.
   * 
   * @return product of base max health and level.
   */
  public double getMaxHealth() {
    return baseMaxHealth * level;
  }

  /**
   * Sets current power of Character.
   * 
   * @param newCurrentPower uses this value to set current power.
   */
  public void setCurrentPower(int newCurrentPower) {
    currentPower = newCurrentPower;
  }

  /**
   * Gets current power of Character.
   * 
   * @return current power of this Character.
   */
  public int getCurrentPower() {
    return currentPower;
  }

  /**
   * Gets max power of Character.
   * 
   * @return product of base max power and level.
   */
  public int getMaxPower() {
    return baseMaxPower * level;
  }

  /**
   * Used for when Character uses a power to decrease or regenerate power.
   * 
   * @param changeCurPower value to change current power by.
   * @return new value of current power.
   */
  public int changeCurrentPower(int changeCurPower) {
    currentPower += changeCurPower;

    currentPower = (currentPower > this.getMaxPower()) ? this.getMaxPower() : currentPower;
    return currentPower;
  }

  /**
   * Gets gender of Character.
   * 
   * @return Gender of this Character.
   */
  public char getGender() {
    return gender;
  }

  /**
   * Sets Character's item.
   * 
   * @param newItem used to set value of Character's item.
   */
  public void setItem(String newItem) {
    item = newItem;
  }

  /**
   * Gets item of Character.
   * 
   * @return item of this Character.
   */
  public String getItem() {
    return item;
  }

  /**
   * Sets level of Character.
   * 
   * @param level of this Character.
   */
  public void setLevel(int level) {
    this.level = level;
  }

  /**
   * Get value of level and makes sure level does not exceed max value.
   * 
   * @return level of this Character.
   */
  public int getLevel() {
    level = (level > maxLevel) ? maxLevel : level;
    return level;
  }

  /**
   * Adds amount of health to current health.
   * 
   * @param healthHeal Health to heal.
   * @return new value of health.
   */
  public double healing(double healthHeal) {
    currentHealth += healthHeal;

    // This ternary operator insures that the currentHealth does not exceed the
    // maxHealth
    currentHealth = (currentHealth > this.getMaxHealth()) ? this.getMaxHealth() : currentHealth;
    return currentHealth;
  }

  /**
   * Removes amount of health from current health.
   * 
   * @param damageDealt Health to damage.
   * @return new value of health.
   */
  public double damage(double damageDealt) {
    currentHealth -= damageDealt;

    if (currentHealth < 0) {
      return currentHealth = 0.0;
    } else {
      return currentHealth;
    }
  }

  /**
   * Displays all basic information of this Character.
   */
  public void displayInfo() {
    System.out.printf(
        "\n%s: \n" + "\tGender: %s\n" + "\tHealth: %s/%s HP \n" + "\tPower: %s/%s Power \n",
        getName(), getGender(), getCurrentHealth(), getMaxHealth(), getCurrentPower(),
        getMaxPower());
  }
}
