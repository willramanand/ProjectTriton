package ramanand.william.triton.enemy;

import java.util.Random;

/*
 * Ignore these classes for Integration PSI 1
 */
public class BossEnemy extends BasicEnemy {
  
  private String name;
  
  public BossEnemy() {
    Random r = new Random();
    name = grabRandomName(r.nextInt(17)) + " the ";
    setEnemyPower(r.nextInt(1000) + 1);
    setEnemyHealth(r.nextInt(5000) + 1);
  }
  
}
