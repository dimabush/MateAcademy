package homework.seventh;

public class Main {
  public static void main(String[] args) {
    // Task Storage
    Storage<Integer, String> storage = new Storage<>();
    storage.put(1, "box1");
    storage.put(2, "box2");
    storage.put(3, "box3");
    storage.put(4, "box4");
    storage.put(5, "box5");
    storage.put(6, "box6");
    storage.put(7, "box7");
    storage.put(8, "box8");
    storage.put(9, "box9");
    storage.put(10, "box10");
    storage.put(11, "box11");
    System.out.println(storage.get(10));
    System.out.println(storage.getSize());
    System.out.println();

    // Task Pair
    Pair<Integer, String> pair = Pair.of(1, "hello");
    Integer i = pair.getFirst();
    String s = pair.getSecond();
    System.out.println("Pair ONE: " + i + ",\t" + s);
    Pair<Integer, String> pair2 = Pair.of(1, "hello");
    boolean mustBeTrue = pair.equals(pair2);
    boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode();
    System.out.println("Is pair equal pair2? - " + mustBeTrue
            + "\n Is their hashcodes equal? - " + mustAlsoBeTrue);
  }
}
