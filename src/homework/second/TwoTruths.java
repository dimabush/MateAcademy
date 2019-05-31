package homework.second;

public class TwoTruths {
  public static boolean booleanExpression(
          boolean firstExpression, boolean secondExpression,
          boolean thirdExpression, boolean fourthExpression) {
    return (firstExpression ^ secondExpression) & (thirdExpression ^ fourthExpression)
            || (firstExpression ^ thirdExpression) & (secondExpression ^ fourthExpression);
  }
}
