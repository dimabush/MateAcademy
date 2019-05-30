package homework.second;

public class TwoTruths {
  public static boolean booleanExpression(
          boolean firstExpression, boolean secondExpression,
          boolean thirdExpression, boolean fourthExpression) {
    return (firstExpression & secondExpression & (!thirdExpression) & (!fourthExpression))
            ^ (firstExpression & thirdExpression & (!secondExpression) & (!fourthExpression))
            ^ (firstExpression & fourthExpression & (!secondExpression) & (!thirdExpression))
            ^ (secondExpression & thirdExpression & (!firstExpression) & (!fourthExpression))
            ^ (secondExpression & fourthExpression & (!firstExpression) & (!thirdExpression))
            ^ (thirdExpression & fourthExpression & (!firstExpression) & (!secondExpression));
  }
}
