package homework.fourth;

public class SquareRoot {
  public static double sqrt(double x) throws IllegalArgumentException {
    if (x < 0) {
      throw new IllegalArgumentException("Expected non-negative number, got " + x);
    }
    return Math.sqrt(x);
  }
}
