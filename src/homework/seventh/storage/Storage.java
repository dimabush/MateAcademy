package homework.seventh.storage;

public class Storage<K, V> {

  private int capacity = 10;
  private Pair<K, V>[] pairArray;

  public Storage() {
    pairArray = new Pair[capacity];
  }

  public void put(K key, V value) {
    for (int i = 0; i < pairArray.length; i++) {
      if (pairArray[i] == null) {
        pairArray[i] = new Pair<>(key, value);
        return;
      }
    }
  }

  public V get(K key) {
    for (Pair<K, V> element : pairArray) {
      if (element != null && element.getKey() == key) {
        return element.getValue();
      }
    }
    return null;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }
}
