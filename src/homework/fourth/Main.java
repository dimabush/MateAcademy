package homework.fourth;

import homework.fourth.textanalyzer.*;

public class Main {
  public static void main(String[] args) {
    // Task SquareRoot
    System.out.println("square root of a 324 is - " + SquareRoot.sqrt(324));

    // Task Builder Pattern - PizzaBuilder
    Pizza myPizza = new Pizza.PizzaBuilder("Chicago", "BBQ sauce", "Mozzarella")
            .addTomatos("Cherry")
            .addBacon("Regular bacon")
            .addMushrooms("Portobello")
            .build();
    System.out.println(myPizza);

    // Task AsciiCharSequence
    byte[] example = {72, 101, 108, 108, 111, 33};
    AsciiCharSequence answer  = new AsciiCharSequence(example);
    System.out.println("Sequence - " + answer.toString());
    System.out.println("Length is - " + answer.length());
    System.out.println("Char at index '1' is - " + answer.charAt(1));
    System.out.println("sub sequence - " + answer.subSequence(1, 5));

    // Task CommentAnalyzer
    String[] spamKeywords = {"spam", "bad"};
    int commentMaxLength = 40;
    TextAnalyzer[] textAnalyzers1 = {
            new SpamAnalyzer(spamKeywords),
            new NegativeTextAnalyzer(),
            new TooLongTextAnalyzer(commentMaxLength)
    };
    TextAnalyzer[] textAnalyzers2 = {
            new SpamAnalyzer(spamKeywords),
            new TooLongTextAnalyzer(commentMaxLength),
            new NegativeTextAnalyzer()
    };
    TextAnalyzer[] textAnalyzers3 = {
            new TooLongTextAnalyzer(commentMaxLength),
            new SpamAnalyzer(spamKeywords),
            new NegativeTextAnalyzer()
    };
    TextAnalyzer[] textAnalyzers4 = {
            new TooLongTextAnalyzer(commentMaxLength),
            new NegativeTextAnalyzer(),
            new SpamAnalyzer(spamKeywords)
    };
    TextAnalyzer[] textAnalyzers5 = {
            new NegativeTextAnalyzer(),
            new SpamAnalyzer(spamKeywords),
            new TooLongTextAnalyzer(commentMaxLength)
    };
    TextAnalyzer[] textAnalyzers6 = {
            new NegativeTextAnalyzer(),
            new TooLongTextAnalyzer(commentMaxLength),
            new SpamAnalyzer(spamKeywords)
    };
    // testing comments
    String[] tests = new String[8];
    tests[0] = "This comment is so good.";                            // OK
    tests[1] = "This comment is so Loooooooooooooooooooooooooooong."; // TOO_LONG
    tests[2] = "Very negative comment !!!!=(!!!!;";                   // NEGATIVE_TEXT
    tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;";    // NEGATIVE_TEXT or TOO_LONG
    tests[4] = "This comment is so bad....";                          // SPAM
    tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";  // SPAM or TOO_LONG
    tests[6] = "Negative bad :( spam.";                               // SPAM or NEGATIVE_TEXT
    tests[7] = "Very bad, very neg =(, very ..................";      // SPAM or NEGATIVE_TEXT or TOO_LONG
    TextAnalyzer[][] textAnalyzers = {textAnalyzers1, textAnalyzers2, textAnalyzers3,
            textAnalyzers4, textAnalyzers5, textAnalyzers6};
    AlmostMain testObject = new AlmostMain();
    int numberOfAnalyzer;
    int numberOfTest = 0;
    for (String test : tests) {
      numberOfAnalyzer = 1;
      System.out.print("test #" + numberOfTest + ": ");
      System.out.println(test);
      for (TextAnalyzer[] analyzers : textAnalyzers) {
        System.out.print(numberOfAnalyzer + ": ");
        System.out.println(testObject.checkLabels(analyzers, test));
        numberOfAnalyzer++;
      }
      numberOfTest++;
    }

  }
}
