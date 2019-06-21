package homework.twelve;

import java.util.function.Function;
import java.util.function.Predicate;

public class ConditionCheck {
  public static <T, U> Function<T, U> ternaryOperator(
          Predicate<? super T> condition,
          Function<? super T, ? extends U> ifTrue,
          Function<? super T, ? extends U> ifFalse) {
    return value -> condition.test(value) ? ifTrue.apply(value) : ifFalse.apply(value);
  }
}
