package homework.sixth;

import homework.sixth.carclone.Car;
import homework.sixth.carclone.Engine;

public class Main {
  public static void main(String[] args) {

    // Task 6.1 deep clone
    Engine diesel = new Engine("diesel", "manual gearbox", 1600);
    Engine petrol = new Engine("petrol", "automatic", 1800);
    Car carOrigin = new Car("volvo", "saloon", 115, diesel);
    Car carClone = carOrigin.clone();
    System.out.println(carOrigin);
    System.out.println(carClone);
    carOrigin.setModel("audi");
    carOrigin.setPower(108);
    carOrigin.setEngine(petrol);
    System.out.println("After changing carOrigin:");
    System.out.println(carOrigin);
    System.out.println(carClone);
  }
}
