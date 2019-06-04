package homework.sixth.carclone;

public class Car implements Cloneable {
  private String model;
  private String fuelType;
  private int power;
  private Human owner;

  public Car(String model, String fuelType, int power, Human owner) {
    this.model = model;
    this.fuelType = fuelType;
    this.power = power;
    this.owner = owner;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }

  public void setPower(int power) {
    this.power = power;
  }

  public void setOwner(Human owner) {
    this.owner = owner;
  }

  @Override
  public Car clone() {
    return new Car(this.model, this.fuelType, this.power, owner.clone());
  }

  @Override
  public String toString() {
    return "Car{"
            + "model='" + model + '\''
            + ", fuelType='" + fuelType + '\''
            + ", power=" + power
            + ", owner=" + owner
            + '}';
  }
}
