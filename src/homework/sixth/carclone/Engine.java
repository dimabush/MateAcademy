package homework.sixth.carclone;

public class Engine {
  String fuelType;
  String transmission;
  int cubicCapacity;

  public Engine(String fuelType, String transmission, int cubicCapacity) {
    this.fuelType = fuelType;
    this.transmission = transmission;
    this.cubicCapacity = cubicCapacity;
  }

  @Override
  public Engine clone() {
    return new Engine(this.fuelType, this.transmission, this.cubicCapacity);
  }

  @Override
  public String toString() {
    return "Engine{"
            + "fuelType='" + fuelType + '\''
            + ", transmission='" + transmission + '\''
            + ", cubicCapacity=" + cubicCapacity
            + '}';
  }
}
