package homework02;

public class CheckingAddition {
    public static boolean doubleExpression(double firstNumber, double secondNumber, double sum){
        double measurementError = 0.0001;
        return Math.abs(firstNumber + secondNumber - sum) < measurementError;
    }
}
