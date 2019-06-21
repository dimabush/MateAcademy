package homework.twelve;

import java.util.function.DoubleUnaryOperator;

public class Integral {
  public static double integrate(DoubleUnaryOperator f, double a, double b) {
    double result = 0;
    double index = a;
    double h = 0.000001;
    while (index < b) {
      result += h * f.applyAsDouble(index);
      index += h;
    }
    return result;
  }
}
