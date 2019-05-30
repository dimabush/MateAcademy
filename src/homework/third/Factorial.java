package homework.third;

import java.math.BigInteger;

public class Factorial {
  public static BigInteger factorial(int value) {
    BigInteger result = BigInteger.ONE;
    while (value >= 1) {
      result = result.multiply(BigInteger.valueOf(value));
      value--;
    }
    return result;
  }
}
