package homework.first;

public class Exponentiation {
  protected static int square(int number) {
    return number * number;
  }

  protected static int cube(int number) {
    return number * number * number;
  }

  protected static double power(int baseNumber, int powerNumber) {
    double result = 1;
    if (powerNumber > 0) {
      for (int i = powerNumber; i > 0; i--) {
        result *= baseNumber;
      }
    } else if (powerNumber < 0) {
      for (int i = powerNumber; i < 0; i++) {
        result /= baseNumber;
      }
    }
    return result;
  }
}

