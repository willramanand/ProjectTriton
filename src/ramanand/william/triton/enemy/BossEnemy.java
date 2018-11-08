package ramanand.william.triton.enemy;

import java.util.Random;

/*
 * Ignore these classes for Integration PSI 1
 */
public class BossEnemy extends BasicEnemy {
  
  private String name;
  private String[] title = {"Great", "Towering", "Tank", "Invincible", "Beserk", "Wolf", "Lion",
      "Dead", "Malevolent"};
  
  public BossEnemy() {
    Random r = new Random();
    this.name = grabRandomName(r.nextInt(17)) + " the " + title[r.nextInt(10)];
    this.setEnemyPower(r.nextInt(1000) + 1);
    this.setEnemyHealth(r.nextInt(5000) + 1);
  }

  
}
