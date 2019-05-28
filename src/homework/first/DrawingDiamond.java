package homework.first;

public class DrawingDiamond {
  protected static void drawDiamond(int sizeOfTheDiamond) {
    if (sizeOfTheDiamond % 2 == 0) {
      System.out.println("Please enter an odd number");
    } else {
      int leftRange = sizeOfTheDiamond / 2;
      int rightRange = sizeOfTheDiamond / 2;
      for (int i = 0; i < sizeOfTheDiamond; i++) {
        for (int j = 0; j < sizeOfTheDiamond; j++) {
          if (i + j >= leftRange && i + j <= rightRange) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
        if (i < sizeOfTheDiamond / 2) {
          rightRange += 2;
        } else {
          leftRange += 2;
        }
        System.out.println();
      }
    }
  }
}
