package homework.eighth;

public class MyArrayList<T> implements List<T> {
  private int size;
  private T[] array;
  private static final int EXPANSE = 5;

  public MyArrayList() {
    array = (T[]) new Object[size];
  }

  public MyArrayList(T[] array) {
    this.array = array;
    this.size = array.length;
  }

  @Override
  public void add(T value) {
    if (size < array.length) {
      array[size] = value;
    } else {
      T[] newArray = (T[]) new Object[size + EXPANSE];
      for (int i = 0; i < size; i++) {
        newArray[i] = array[i];
      }
      newArray[size] = value;
      array = newArray;
    }
    size++;
  }

  @Override
  public void add(T value, int index) {
    if (index == (size - 1)) {
      add(value);
    } else {
      int sizeNewArray;
      if (size < array.length) {
        sizeNewArray = array.length;
      } else {
        sizeNewArray = size + EXPANSE;
      }
      T[] newArray = (T[]) new Object[sizeNewArray];
      int element = 0;
      for (int i = 0; i < size + 1; i++) {
        if (i == index) {
          newArray[i] = value;
        } else {
          newArray[i] = array[element];
          element++;
        }
      }
      array = newArray;
      size++;
    }
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public T get(int index) {
    return array[index];
  }

  @Override
  public void addAll(List<T> list) {
    for (int i = 0; i < list.size(); i++) {
      this.add(list.get(i));
    }
  }

  @Override
  public void set(T value, int index) {
    this.array[index] = value;
  }

  @Override
  public T remove(int index) {
    T result;
    if (index < 0 || index > size - 1) {
      throw new IndexOutOfBoundsException("Index is out of range");
    } else {
      result = array[index];
      for (int i = index; i < size - 1; i++) {
        array[i] = array[i + 1];
      }
      return result;
    }
  }

  @Override
  public T remove(T value) {
    T result = null;
    for (int i = 0; i < size; i++) {
      if (array[i] == value) {
        this.remove(i);
      }
    }
    return result;
  }

  @Override
  public boolean isEmpty() {
    return this.size == 0;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < size; i++) {
      result.append(array[i]);
      if (i != size - 1) {
        result.append(", ");
      }
    }
    return result.toString();
  }
}
