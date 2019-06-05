package homework.seventh;

import homework.seventh.storage.Storage;

public class Main {
  public static void main(String[] args) {
    Storage<Integer, String> storage = new Storage<>();
    storage.put(22, "box1");
    storage.put(12, "box2");
    storage.put(5, "box3");

    System.out.println(storage.get(12));
  }
}
