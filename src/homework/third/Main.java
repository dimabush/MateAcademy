package homework.third;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    // Task 3.1 Merge two sorting arrays
    int[] firstArr = {6, 9};
    int[] secondArr = {1, 5, 10, 12};
    System.out.println(Arrays.toString(MergeSort.mergeArrays(firstArr, secondArr)));

    // Task 3.2 Scenario
    String[] rolesArray = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
    String[] scriptArray = {
        "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное "
                + "известие: к нам едет ревизор.",
        "Аммос Федорович: Как ревизор?",
        "Артемий Филиппович: Как ревизор?",
        "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
        "Аммос Федорович: Вот те на!",
        "Артемий Филиппович: Вот не было заботы, так подай!",
        "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
    };
    System.out.println(RedactorScript.groupLinesByRoles(rolesArray, scriptArray));

    // Task 3.4 Equals & hachcode
    ComplexNumber complOne = new ComplexNumber(0.005,0.0006);
    ComplexNumber complTwo = new ComplexNumber(0.005,0.0008);
    System.out.println("equals: " + complOne.equals(complTwo));
    System.out.println("hashcode One: " + complOne.hashCode());
    System.out.println("hashcode Two: " + complTwo.hashCode());

    // Task 3.5 Palindrome
    System.out.println(Palindrome.isPalindrome("Madam, I'm Adam!"));

    // Task 3.6 Factorial
    System.out.println("Factorial: " + Factorial.factorial(5));
  }
}
