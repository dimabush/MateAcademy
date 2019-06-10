package homework.ninth;

public class Main {
  public static void main(String[] args) {
    List<String> myList = new MyLinkedList<>();
    myList.add("Hello");
    myList.add("World");
    myList.add("is easy");
    myList.add("program");
    System.out.println("List: " + myList);

    myList.add("qq", 3);
    System.out.println("Adding \"qq\": " + myList);

    System.out.println("Size: " + myList.size());

    System.out.println("Element by index 4 is: " + myList.get(4));

    MyLinkedList<String> mySecondList = new MyLinkedList<>();
    mySecondList.add("Second");
    mySecondList.add("Third");
    mySecondList.add("Fourth");
    mySecondList.add("Second");
    System.out.println("Second list: " + mySecondList);

    mySecondList.set("NEW Fourth", 2);
    System.out.println(mySecondList.remove(1));

    System.out.println(mySecondList.remove("Second"));

    myList.addAll(mySecondList);
    System.out.println("Added two lists: " + myList);
  }
}
