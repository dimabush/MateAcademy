package homework.twelve;

import java.util.function.DoubleUnaryOperator;

public class Integral {
  public static double integrate(DoubleUnaryOperator f, double a, double b) {
    double result = 0;
    double h = 0.000001;
    while (a < b) {
      result += h * f.applyAsDouble(a);
      a += h;
    }
    return result;
  }
}
