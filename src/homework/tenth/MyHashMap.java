package homework.tenth;

import java.util.Arrays;
import java.util.Objects;

public class MyHashMap<K, V> implements MyMap<K, V> {
  private int size;
  private Node[] nodes;

  public MyHashMap() {
    nodes = new Node[16];
  }

  private static class Node<K, V> {
    K key;
    V value;
    Node next;

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

  private V putNode(K key, V value, Node[] nodes) {
    int index = Objects.hashCode(key) % nodes.length;
    if (nodes[index] == null) {
      nodes[index] = new Node(key, value);
    } else {
      Node currentNode = nodes[index];
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
          putNode((K) nodes[i].key, (V) nodes[i].value, newNodes);
          if (nodes[i].next != null) {
            putNode((K) nodes[i].next.key, (V) nodes[i].next.value, newNodes);
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
    int index = Objects.hashCode(key) % nodes.length;
    Node currentNode = nodes[index];
    while (currentNode != null) {
      if (currentNode.key.equals(key)) {
        return (V) currentNode.value;
      }
      currentNode = currentNode.next;
    }
    return null;
  }

  @Override
  public V remove(K key) {
    int index = Objects.hashCode(key) % nodes.length;
    V removedValue = null;
    Node currentNode = nodes[index];
    while (currentNode != null) {
      if (currentNode.key.equals(key)) {
        removedValue = (V) currentNode.value;
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
