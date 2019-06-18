package homework.eleventh;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Iterator;

// Task.3 about System.in
public class Main {
  public static void main(String[] args) {
    Integer number;
    int size = 0;

    Scanner sc = new Scanner(System.in);
    ArrayDeque<Integer> deque = new ArrayDeque<>();
    while (sc.hasNextInt()) {
      number = sc.nextInt();
      if (size % 2 != 0) {
        deque.add(number);
      }
      size++;
    }
    Iterator<Integer> iterator = deque.descendingIterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next().toString() + " ");
    }
  }
}
