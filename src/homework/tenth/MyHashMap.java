package homework.tenth;

import java.util.Arrays;

public class MyHashMap<K, V> implements MyMap<K, V> {
  private int size;
  private Node<K, V>[] nodes;

  public MyHashMap() {
    nodes = new Node[16];
  }

  private static class Node<K, V> {
    private K key;
    private V value;
    private Node<K, V> next;

    public Node(K key, V value) {
      this.key = key;
      this.value = value;
    }

    @Override
    public String toString() {
      return "(" +
              "" + key +
              ", " + value +
              ") " + (next != null ? next : "");
    }
  }

  @Override
  public V put(K key, V value) {
    checkCapacity();
    return putNode(key, value, nodes);
  }

  private V putNode(K key, V value, Node<K, V>[] nodes) {
    int index = key.hashCode() % nodes.length;
    if (nodes[index] == null) {
      nodes[index] = new Node(key, value);
    } else {
      Node<K, V> currentNode = nodes[index];
      do {
        if (currentNode.key.equals(key)) {
          currentNode.value = value;
          return value;
        }
        if (currentNode.next != null) {
          currentNode = currentNode.next;
        }
      } while (currentNode.next != null);
      currentNode.next = new Node(key, value);
    }
    size++;
    return value;
  }

  private void checkCapacity() {
    if (size >= (nodes.length * 3 / 4)) {
      size = 0;
      Node[] newNodes = new Node[nodes.length * 2];
      for (int i = 0; i < nodes.length; i++) {
        if (nodes[i] != null) {
          putNode(nodes[i].key, nodes[i].value, newNodes);
          Node<K, V> currentNode = nodes[i].next;
          while(currentNode != null){
            putNode(currentNode.key, currentNode.value, newNodes);
            currentNode = currentNode.next;
          }
          nodes[i] = null;
        }
      }
      this.nodes = newNodes;
    }
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public V get(K key) {
    int index = key.hashCode() % nodes.length;
    Node<K, V> currentNode = nodes[index];
    while (currentNode != null) {
      if (currentNode.key.equals(key)) {
        return currentNode.value;
      }
      currentNode = currentNode.next;
    }
    return null;
  }

  @Override
  public V remove(K key) {
    int index = key.hashCode() % nodes.length;
    V removedValue = null;
    Node<K, V> currentNode = nodes[index];
    while (currentNode != null) {
      if (currentNode.key.equals(key)) {
        removedValue = currentNode.value;
        nodes[index] = nodes[index].next;
        size--;
        return removedValue;
      }
      currentNode = currentNode.next;
    }
    return removedValue;
  }

  @Override
  public void clear() {
    for (int i = 0; i < nodes.length; i++) {
      nodes[i] = null;
    }
    size = 0;
  }

  @Override
  public String toString() {
    return "MyHashMap{"
            + Arrays.toString(nodes)
            + '}';
  }
}
