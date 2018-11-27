
public class Car {
  private int speed;
  private int horsepower;
  private String brand;
  private String type;
  private String color;
  private String owner;
  
  public Car() {
    this.owner = "Bob";
  }
  
  public Car(String owner) {
    this.owner = owner;
  }
  
  public void setSpeed(int speed) {
    this.speed = speed;
  }
  
  public int getSpeed() {
    return speed;
  }
  
  public void setHorsepower(int horsepower) {
    this.horsepower = horsepower;
  }
  
  public int getHorsepower() {
    return horsepower;
  }
  
  public void setBrand(String brand) {
    this.brand = brand;
  }
  
  public String getBrand() {
    return brand;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  public String getType() {
    return type;
  }
  
  public void setColor(String color) {
    this.color = color;
  }
  
  public String getColor() {
    return color;
  }
  
  public void displayInfo() {
    System.out.println(brand + " " + type + ":" + "\t\nColor: " + color + "\t\nOwner: " + owner + "\t\nHorsepower: " + horsepower + "\t\nSpeed: " + speed);
  }
}
