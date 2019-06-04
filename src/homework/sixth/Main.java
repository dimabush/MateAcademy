package homework.sixth;

import homework.sixth.carclone.Car;
import homework.sixth.carclone.Human;

public class Main {
  public static void main(String[] args) {

    // Task 6.1 deep clone
    Human andriy = new Human("Andriy", 31);
    Human ivan = new Human("Ivan", 25);
    Car carOrigin = new Car("volvo", "diesel", 150, andriy);
    Car carClone = carOrigin.clone();
    System.out.println(carOrigin);
    System.out.println(carClone);
    carOrigin.setModel("audi");
    carOrigin.setPower(108);
    carOrigin.setOwner(ivan);
    System.out.println("After changing carOrigin:");
    System.out.println(carOrigin);
    System.out.println(carClone);
  }
}
