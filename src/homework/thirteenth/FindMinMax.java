package homework.thirteenth;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class FindMinMax {
  public static <T> void findMinMax(
          Stream<? extends T> stream,
          Comparator<? super T> order,
          BiConsumer<? super T, ? super T> minMaxConsumer) {
    if (stream.count() == 0) {
      minMaxConsumer.accept(null, null);
    } else {
//      minMaxConsumer.accept(order::compare.get());
    }
  }
}
