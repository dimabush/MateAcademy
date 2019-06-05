package homework.sixth.carclone;

public class Car implements Cloneable {
  private String model;
  private String vehicleType;
  private int power;
  private Engine engine;

  public Car(String model, String vehicleType, int power, Engine engine) {
    this.model = model;
    this.vehicleType = vehicleType;
    this.power = power;
    this.engine = engine;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  public void setPower(int power) {
    this.power = power;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  @Override
  public Car clone() {
    return new Car(this.model, this.vehicleType, this.power, engine.clone());
  }

  @Override
  public String toString() {
    return "Car{"
            + "model='" + model + '\''
            + ", vehicleType='" + vehicleType + '\''
            + ", power=" + power
            + ", engine=" + engine
            + '}';
  }
}
