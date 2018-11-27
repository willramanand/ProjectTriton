
public class Character {

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
  protected String name;
  private int level;
  private int maxLevel = 50;
  private int currentPower;
  private static int baseMaxPower = 10;
  private double currentHealth;
  private static double baseMaxHealth = 50.0;
  protected char gender;
  private String item;
  private String genderFull;

  public Character(String newName, String newGender) {
    this.name = newName.substring(0, 1).toUpperCase() + newName.substring(1);
    this.gender = newGender.toUpperCase().charAt(0); // charAt is the last of three methods from
                                                     // String class

    // This line capitalizes the M or F and converts from String
    // to char

    // Below is the if/else statement
    if (gender == 'M') { // == Operator compares both sides to see if they are the same, if they are
                         // its
                         // value is true, if not then false.
      this.genderFull = "Male";
    } else if (gender == 'F') {
      this.genderFull = "Female";
    }
  }

  public String getName() {
    return name;
  }

  // All Health methods for getting and setting current and max health
  public void setCurrentHealth(double newCurrentHealth) {
    currentHealth = newCurrentHealth;
  }

  public double getCurrentHealth() {
    return currentHealth;
  }

  public double getMaxHealth() {
    return baseMaxHealth * level;
  }

  public void setCurrentPower(int newCurrentPower) {
    currentPower = newCurrentPower;
  }

  public int getCurrentPower() {
    return currentPower;
  }

  public int getMaxPower() {
    return baseMaxPower * level;
  }

  public int changeCurrentPower(int changeCurPower) {
    currentPower += changeCurPower;

    currentPower = (currentPower > this.getMaxPower()) ? this.getMaxPower() : currentPower;
    return currentPower;
  }

  public char getGender() {
    return gender;
  }

  public void setItem(String newItem) {
    item = newItem;
  }

  public String getItem() {
    return item;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getLevel() {
    level = (level > maxLevel) ? maxLevel : level;
    return level;
  }

  public double healing(double healthHeal) {
    currentHealth += healthHeal;

    // This ternary operator insures that the currentHealth does not exceed the
    // maxHealth
    currentHealth = (currentHealth > this.getMaxHealth()) ? this.getMaxHealth() : currentHealth;
    return currentHealth;
  }

  public double damage(double damageDealt) {
    currentHealth -= damageDealt;

    if (currentHealth < 0) {
      return currentHealth = 0.0;
    } else {
      return currentHealth;
    }
  }

  public void displayInfo() {
    System.out.printf(
        "\n%s: \n" + "\tGender: %s\n" + "\tHealth: %s/%s HP \n" + "\tPower: %s/%s Power \n",
        getName(), getGender(), getCurrentHealth(), getMaxHealth(), getCurrentPower(),
        getMaxPower());
  }
}
