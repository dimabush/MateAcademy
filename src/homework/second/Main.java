package homework.second;

public class Main {
  public static void main(String[] args) {

    // Task 2.1 -  checking for two truths
    System.out.println(TwoTruths.booleanExpression(true, false,
            false, true));
    System.out.println(TwoTruths.booleanExpression(true, false,
            true, true));

    // Task 2.2
    System.out.println("Leap years till 805 was: " + LeapYear.leapYearCount(805));
    System.out.println("Leap years till 2019 was: " + LeapYear.leapYearCount(2019));

    // Task 2.3
    System.out.println(CheckingAddition.doubleExpression(0.1, 0.2, 0.3));

    // Task 2.4
    System.out.println(BitReplace.flipBit(42, 7));
  }
}
