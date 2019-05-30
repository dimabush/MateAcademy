package homework.third;

public class Palindrome {
  public static boolean isPalindrome(String text) {
    String newText = text.toLowerCase().replaceAll("[^a-z0-9]", "");
    StringBuilder sb = new StringBuilder(newText);
    return sb.reverse().toString().equals(newText);
  }
}
