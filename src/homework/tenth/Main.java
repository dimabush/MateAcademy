package homework.tenth;

public class Main {
  public static void main(String[] args) {
    MyMap<Integer, String> map = new MyHashMap<>();
    map.put(5, "five");
    map.put(5, "NEWfive");
    map.put(21, "NEWnumb");
    map.put(4, "four");
    map.put(3, "three");
    map.put(2, "two");
    System.out.println(map.put(1, "one"));
    map.put(0, "zero");
    map.put(8, "numb8");
    map.put(9, "numb9");
    map.put(10, "numb10");
    map.put(11, "numb11");
    map.put(43, "numb43");
    map.put(13, "numb13");
    System.out.println(map);
    System.out.println("SIZE = " + map.size());
    System.out.println("get value by key=43 : " + map.get(43));
    System.out.println("removed value: " + map.remove(43));
    System.out.println("SIZE = " + map.size());
    map.clear();
    System.out.println(map);
    System.out.println("SIZE = " + map.size());
  }
}
