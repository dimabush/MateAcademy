package homework.eighth;

public class Main {
  public static void main(String[] args) {
    List<String> myArrayList = new MyArrayList<>();
    myArrayList.add("One");
    myArrayList.add("Two", 1);
    myArrayList.add("Three");
    System.out.println(myArrayList);
    System.out.println(myArrayList.size());
  }
}
