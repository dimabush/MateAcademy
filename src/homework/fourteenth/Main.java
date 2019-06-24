package homework.fourteenth;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in, "UTF-8");
    String string = scanner.nextLine();
    Stream.of(string.toLowerCase().split("[\\p{Punct}\\s]+"))
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet()
        .stream()
        .sorted(Map.Entry.<String, Long>comparingByValue()
            .reversed()
            .thenComparing(Map.Entry.comparingByKey()))
        .limit(10)
        .map(Map.Entry::getKey)
        .forEachOrdered(System.out::println);
  }
}
