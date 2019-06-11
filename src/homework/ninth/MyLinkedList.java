package homework.ninth;

public class MyLinkedList<T> implements List<T> {

  private Node firstNode;
  private Node lastNode;
  private int size;


  private static class Node<T> {
    private Node prev;
    private Node next;
    private T value;

    public Node(Node<T> prev, Node<T> next, T value) {
      this.prev = prev;
      this.next = next;
      this.value = value;
    }
  }

  public Node getNode(int index) {
    if (index < 0 || index > size - 1) {
      throw new IndexOutOfBoundsException("Index is out of range");
    }
    Node currentNode = firstNode;
    for (int i = 0; i < index; i++) {
      currentNode = currentNode.next;
    }
    return currentNode;
  }

  @Override
  public void add(T value) {
    if (size == 0) {
      firstNode = new Node(null, null, value);
      lastNode = firstNode;
    } else {
      Node currentNode = new Node(lastNode, null, value);
      lastNode.next = currentNode;
      lastNode = currentNode;
    }
    size++;
  }

  @Override
  public void add(T value, int index) {
    Node currentNode = getNode(index);
    Node addedNode = new Node(currentNode.prev, currentNode, value);
    currentNode.prev.next = addedNode;
    currentNode.prev = addedNode;
    this.size++;
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public T get(int index) {
    return (T) getNode(index).value;
  }

  @Override
  public void addAll(List<T> list) {
    for (int i = 0; i < list.size(); i++) {
      this.add(list.get(i));
    }
  }

  @Override
  public void set(T value, int index) {
    getNode(index).value = value;
  }

  @Override
  public T remove(int index) {
    T removedValue;
    if (index == this.size - 1) {
      removedValue = (T) this.lastNode.value;
      this.lastNode = this.lastNode.prev;
      this.lastNode.next = null;
    } else if (index == 0) {
      removedValue = (T) this.firstNode.value;
      this.firstNode = this.firstNode.next;
      this.firstNode.prev = null;
    } else {
      Node currentNode = getNode(index);
      removedValue = (T) currentNode.value;
      currentNode.prev.next = currentNode.next;
      currentNode.next.prev = currentNode.prev;
    }
    this.size--;
    return removedValue;
  }

  @Override
  public T remove(T value) {
    T removedValue = null;
    Node currentNode = firstNode;
    for (int i = 0; i < this.size; i++) {
      if (currentNode.value == value) {
        removedValue = value;
        if (i == 0) {
          firstNode = firstNode.next;
          firstNode.prev = null;
        } else if (i == this.size - 1) {
          lastNode = lastNode.prev;
          lastNode.next = null;
        } else {
          currentNode.prev.next = currentNode.next;
          currentNode.next.prev = currentNode.prev;
        }
        this.size--;
        break;
      }
    }
    return removedValue;
  }

  @Override
  public boolean isEmpty() {
    return this.size == 0;
  }

  @Override
  public String toString() {
    Node currentNode = firstNode;
    StringBuilder result = new StringBuilder(currentNode.value.toString());
    while (currentNode.next != null) {
      currentNode = currentNode.next;
      result.append(", ").append(currentNode.value.toString());
    }
    return result.toString();
  }
}
