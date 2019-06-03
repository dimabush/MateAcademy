package homework.fourth.textanalyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

  private static final String[] KEYWORDS = {":(", "=(", ":|"};

  @Override
  protected String[] getKeywords() {
    return KEYWORDS;
  }

  @Override
  protected Label getLabel() {
    return Label.NEGATIVE_TEXT;
  }
}
