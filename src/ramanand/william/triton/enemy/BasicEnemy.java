package ramanand.william.triton.enemy;

import java.util.Random;

/*
 * Ignore these classes for Integration PSI 1
 */
public abstract class BasicEnemy {


  private String[] name = { "Maris", "Marcellus", "Ike", "Rodney", "Kyung", "Rana", "Vernell", "Cruz", 
      "Abigail", "Tawny", "Mellie", "Genevieve", "Caron", "Berta", "Denae", "Amos"};

  private int maxPower;
  private int currentPower;
  private double maxHealth;
  private double currentHealth;
  
  Random r = new Random();
  
  public String grabRandomName(int nameArrayInt) {
    return name[r.nextInt(name.length)];
  }

  public void setEnemyPower(int rPower) {
    maxPower = r.nextInt(rPower);
    currentPower = maxPower;
  }

  public int getEnemyCurrentPower() {
    return currentPower;
  }

  public int getEnemyMaxPower() {
    return maxPower;
  }

  public int changeEnemyPower(int powerChange) {
    currentPower = (maxPower < currentPower + powerChange ? maxPower : currentPower + powerChange);
    return currentPower;
  }

  public void setEnemyHealth(double rHealth) {
    maxHealth = r.nextDouble();
    currentHealth = maxHealth;
  }

  public double getEnemyCurrentHealth() {
    return currentHealth;
  }

  public double getEnemyMaxHealth() {
    return maxHealth;
  }

  public double changeEnemyHealth(double healthChange) {
    currentHealth =
        (maxHealth < currentHealth + healthChange ? maxHealth : currentHealth + healthChange);
    return currentHealth;
  }
}
