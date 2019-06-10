package homework.seventh;

import java.util.Arrays;

public class Storage<K, V> {

  private static final int SIZE = 10;
  private Pair<K, V>[] pairArray = new Pair[SIZE];
  private int position = 0;

  private class Pair<K, V> {
    private K key;
    private V value;

    private Pair(K key, V value) {
      this.key = key;
      this.value = value;
    }
  }

  public void put(K key, V value) {
    if (position >= pairArray.length) {
      increaseSize();
    }
    pairArray[position] = new Pair<>(key, value);
    position++;
  }

  private void increaseSize() {
    pairArray = Arrays.copyOf(pairArray, pairArray.length * 3 / 2);
  }

  public V get(K key) {
    for (Pair<K, V> element : pairArray) {
      if (element != null && element.key == key) {
        return element.value;
      }
    }
    return null;
  }

  public int getSize() {
    return position;
  }
}
