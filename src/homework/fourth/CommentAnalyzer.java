package homework.fourth;

public class CommentAnalyzer {

  public Label checkLabels(TextAnalyzer[] analyzers, String text) {
    for (TextAnalyzer analyzer : analyzers) {
      if (!analyzer.processText(text).equals(Label.OK)) {
        return analyzer.processText(text);
      }
    }
    return Label.OK;
  }

  interface TextAnalyzer {
    Label processText(String text);
  }

  enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
  }

  abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {
      for (String elem : getKeywords()) {
        if (text.contains(elem)) {
          return getLabel();
        }
      }
      return Label.OK;
    }
  }

  class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
      this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
      return keywords;
    }

    @Override
    protected Label getLabel() {
      return Label.SPAM;
    }
  }

  class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    private final String[] keywords = {":(", "=(", ":|"};

    @Override
    protected String[] getKeywords() {
      return keywords;
    }

    @Override
    protected Label getLabel() {
      return Label.NEGATIVE_TEXT;
    }
  }

  class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
      this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
      if (text.length() > maxLength) {
        return Label.TOO_LONG;
      }
      return Label.OK;
    }
  }
}
