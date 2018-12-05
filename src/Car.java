/**
 * Class to generate object Car.
 * 
 * @author wramanand
 *
 */
public class Car {

  /**
   * Stores value for speed of Car.
   */
  private int speed;

  /**
   * Stores value for horsepower of Car.
   */
  private int horsepower;

  /**
   * Stores value for brand of Car.
   */
  private String brand;

  /**
   * Stores value for type of Car.
   */
  private String type;

  /**
   * Stores value for color of Car.
   */
  private String color;

  /**
   * Stores value for owner of Car.
   */
  private String owner;

  /**
   * Constructor for class Car automatically sets Bob as owner.
   */
  public Car() {
    this.owner = "Bob";
  }

  /**
   * Constructor for class Car sets value of owner based on user input.
   * 
   * @param owner name of owner of Car.
   */
  public Car(String owner) {
    this.owner = owner;
  }

  /**
   * Sets value of speed of Car.
   * 
   * @param speed value to which speed is set.
   */
  public void setSpeed(int speed) {
    this.speed = speed;
  }

  /**
   * Gets value of speed of Car.
   * 
   * @return speed of this Car.
   */
  public int getSpeed() {
    return speed;
  }

  /**
   * Sets value of horsepower of Car.
   * 
   * @param horsepower value to which horsepower is set.
   */
  public void setHorsepower(int horsepower) {
    this.horsepower = horsepower;
  }

  /**
   * Gets value of horsepower of Car.
   * 
   * @return horsepower of this Car.
   */
  public int getHorsepower() {
    return horsepower;
  }

  /**
   * Sets brand of Car.
   * 
   * @param brand value which brand is set to.
   */
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * Gets brand of Car.
   * 
   * @return brand of this Car.
   */
  public String getBrand() {
    return brand;
  }

  /**
   * Sets type of this Car.
   * 
   * @param type value of type of Car.
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Gets type of Car.
   * 
   * @return type of this Car.
   */
  public String getType() {
    return type;
  }

  /**
   * Sets color of Car.
   * 
   * @param color value to which color is set.
   */
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * Gets color of Car.
   * 
   * @return color of this Car.
   */
  public String getColor() {
    return color;
  }

  /**
   * Displays basic information about this Car.
   */
  public void displayInfo() {
    System.out.println("\n" + brand + " " + type + ":" + "\t\nColor: " + color + "\t\nOwner: "
        + owner + "\t\nHorsepower: " + horsepower + "\t\nSpeed: " + speed);
  }
}
