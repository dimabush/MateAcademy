package homework.eighth;

import java.util.Arrays;

public class MyArrayList<T> implements List<T> {
  private int size;
  private T[] array;
  private final static int CAPACITY = 10;

  public MyArrayList() {
    array = (T[]) new Object[CAPACITY];
  }

  public MyArrayList(T[] array) {
    this.array = array;
    this.size = array.length;
  }

  @Override
  public void add(T value) {
    if (size >= array.length) {
      array = Arrays.copyOf(array, array.length * 3 / 2);
    }
    array[size] = value;
    size++;
  }

  @Override
  public void add(T value, int index) {
    if (index == size) {
      add(value);
    } else if (index > 0 && index < size) {
      if(size >= array.length){
        array = Arrays.copyOf(array, array.length * 3 / 2);
      }
      System.arraycopy(array, index + 1, array, index, size - index);
      array[index] = value;
      size++;
    } else {
      throw new IndexOutOfBoundsException();
    }
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public T get(int index) {
    if (index >= 0 && index < size) {
      return array[index];
    } else {
      throw new IndexOutOfBoundsException();
    }
  }

  @Override
  public void addAll(List<T> list) {
    if (list.isEmpty()) {
      return;
    }
    if ((size + list.size()) > array.length) {
      array = Arrays.copyOf(array, size + list.size());
    }
    for (int i = 0; i < list.size(); i++) {
      array[size++] = list.get(i);
    }
  }

  @Override
  public void set(T value, int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    array[index] = value;
  }

  @Override
  public T remove(int index) {
    if (index < 0 || index > size - 1) {
      throw new IndexOutOfBoundsException("Index is out of range");
    }
    T result = array[index];
    System.arraycopy(array, index + 1, array, index, size - index - 1);
    array[size - 1] = null;
    size--;
    return result;
  }

  @Override
  public T remove(T value) {
    T result = null;
    for (int i = 0; i < size; i++) {
      if (array[i].equals(value)) {
        result = remove(i);
        break;
      }
    }
    return result;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
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
