package homework.seventh;

import java.util.Objects;

public class Pair<T, K> {
  private T firstValue;
  private K secondValue;

  private Pair(T firstValue, K secondValue) {
    this.firstValue = firstValue;
    this.secondValue = secondValue;
  }

  public static <T, K> Pair<T, K> of(T firstValue, K secondValue) {
    return new Pair<>(firstValue, secondValue);
  }

  public T getFirst() {
    return firstValue;
  }

  public K getSecond() {
    return secondValue;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj instanceof Pair) {
      Pair<?, ?> pair = (Pair<?, ?>) obj;
      return Objects.equals(firstValue, pair.firstValue)
              && Objects.equals(secondValue, pair.secondValue);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return this.firstValue.hashCode() + this.secondValue.hashCode();
  }
}
