

public class Character {

  /*
   * Java has 8 primitive data types: 
   * byte use to store numerical values from -128 to 127 
   * short - use to store numerical values from -32768 to 32767 
   * int - use to store numerical values from -2,147,483,648 to 2,147,483,647 
   * long - use to store numerical values from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,808 
   * float - a data type use to store numbers with a fractional value 
   * double - a data type that stores a numerical data type that can have a decimal 
   * boolean - a data type that stores a value of true or false 
   * char - a data type that stores a single character
   */

  private String name;
  private int currentPower;
  private int maxPower;
  private double currentHealth;
  private double maxHealth;
  private char gender;
  private String item;

  public void setName(String newName) {
    name = newName.substring(0, 1).toUpperCase() + newName.substring(1); // substring is one of
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

  public void setMaxHealth(double newMaxHealth) {
    maxHealth = newMaxHealth;
  }

  public double getMaxHealth() {
    return maxHealth;
  }

  public double changeCurrentHealth(double changeCurHealth) {
    currentHealth = currentHealth + changeCurHealth;

    // This ternary operator insures that the currentHealth does not exceed the maxHealth
    currentHealth = (currentHealth > maxHealth) ? maxHealth : currentHealth;
    return currentHealth;
  }

  public double changeMaxHealth(double changeMaxHealth) {
    maxHealth = maxHealth + changeMaxHealth;
    return maxHealth;
  }


  public void setCurrentPower(int newCurrentPower) {
    currentPower = newCurrentPower;
  }

  public int getCurrentPower() {
    return currentPower;
  }

  public void setMaxPower(int newMaxPower) {
    maxPower = newMaxPower;
  }

  public int getMaxPower() {
    return maxPower;
  }

  public int changeCurrentPower(int changeCurPower) {
    currentPower = currentPower + changeCurPower;

    currentPower = (currentPower > maxPower) ? maxPower : currentPower;
    return currentPower;
  }

  public int changeMaxPower(int changeMaxPower) {
    maxPower = maxPower + changeMaxPower;
    return maxPower;
  }

  public void setGender(String newGender) {
    gender = newGender.toUpperCase().charAt(0);
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


}
