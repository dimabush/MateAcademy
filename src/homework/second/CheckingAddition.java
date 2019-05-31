package homework.second;

public class CheckingAddition {
  public static final double MEASUREMENT_ERROR = 0.0001;

  public static boolean doubleExpression(double firstNumber, double secondNumber, double sum) {
    return Math.abs(firstNumber + secondNumber - sum) < MEASUREMENT_ERROR;
  }
}
