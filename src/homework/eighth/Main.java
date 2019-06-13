package homework.eighth;

public class Main {
  public static void main(String[] args) {
    List<String> myArrayList = new MyArrayList<>();
    myArrayList.add("One");
    myArrayList.add("Two", 1);
    myArrayList.add("Three");
    myArrayList.add("Four");
    myArrayList.add("Five");
    myArrayList.add("Six");
    myArrayList.add("Seven");
    myArrayList.add("Eight", 7);
    System.out.println(myArrayList);
    System.out.println("get element by index 4: " + myArrayList.get(4));
    myArrayList.set("newSix", 5);
    System.out.println("remove elem by index 6: " + myArrayList.remove(6));
    System.out.println("remove \"Four\": " + myArrayList.remove("Four"));
    System.out.println(myArrayList);
    System.out.println("size = " + myArrayList.size());
    List<String> secondArrayList = new MyArrayList<>();
    secondArrayList.add("Dog");
    secondArrayList.add("Cat");
    myArrayList.addAll(secondArrayList);
    System.out.println(myArrayList);
    System.out.println("size = " + myArrayList.size());
  }
}
