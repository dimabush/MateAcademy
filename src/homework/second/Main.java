package homework.second;

public class Main {
  public static void main(String[] args) {

    // Task 2.1 -  checking for two truths
    System.out.println("tttt: " + TwoTruths.booleanExpression(true,true,true,true));
    System.out.println("tttf: " + TwoTruths.booleanExpression(true,true,true,false));
    System.out.println("ttff: " + TwoTruths.booleanExpression(true,true,false,false));
    System.out.println("tfff: " + TwoTruths.booleanExpression(true,false,false,false));
    System.out.println("ffff: " + TwoTruths.booleanExpression(false,false,false,false));
    System.out.println("fttt: " + TwoTruths.booleanExpression(false,true,true,true));
    System.out.println("tftt: " + TwoTruths.booleanExpression(true,false,true,true));
    System.out.println("tftf: " + TwoTruths.booleanExpression(true,false,true,false));
    System.out.println("fftt: " + TwoTruths.booleanExpression(false,false,true,true));
    System.out.println("ftft: " + TwoTruths.booleanExpression(false,true,false,true));

    // Task 2.2
    System.out.println("Leap years till 805 was: " + LeapYear.leapYearCount(805));
    System.out.println("Leap years till 2019 was: " + LeapYear.leapYearCount(2019));

    // Task 2.3
    System.out.println(CheckingAddition.doubleExpression(0.1, 0.2, 0.3));

    // Task 2.4
    System.out.println(BitReplace.flipBit(42, 7));
  }
}
