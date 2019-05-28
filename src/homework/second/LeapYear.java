package homework.second;

public class LeapYear {
  public static int leapYearCount(int year) {
    return year / 4 - year / 100 + year / 400;
  }
}
