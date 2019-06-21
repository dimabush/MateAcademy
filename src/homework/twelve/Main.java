package homework.twelve;

public class Main {
  public static void main(String[] args) {

    // Task 1. Integral
    System.out.println(Integral.integrate(x -> 1, 0, 10));
    System.out.println(Integral.integrate(x -> x + 2, 0, 10));
    System.out.println(Integral.integrate(x -> Math.sin(x) / x, 1, 5));

    // Task 3. RandomStream
    RandomStream.pseudoRandomStream(13).limit(10).forEach(System.out::println);
  }
}
