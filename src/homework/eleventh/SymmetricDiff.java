package homework.eleventh;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDiff {
  public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
    Set<T> resultSet = new HashSet<>(set1);
    resultSet.addAll(set2);
    if (Collections.disjoint(set1, set2)) {
      return resultSet;
    }
    Set<T> commonSet = new HashSet<>(set1);
    commonSet.retainAll(set2);
    resultSet.removeAll(commonSet);
    return resultSet;
  }
}
