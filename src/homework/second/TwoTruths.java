package homework.second;

public class TwoTruths {
  public static boolean booleanExpression(
          boolean firstBooleanExpression, boolean secondBooleanExpression,
          boolean thirdBooleanExpression, boolean fourthBooleanExpression) {
    int result = 0;
    boolean[] array = {firstBooleanExpression, secondBooleanExpression, thirdBooleanExpression,
            fourthBooleanExpression};
    for (boolean element : array) {
      if (element) {
        result++;
      }
    }
    return result == 2;
  }
}
