package homework.fourth.textanalyzer;

public abstract class KeywordAnalyzer implements TextAnalyzer{
  protected abstract String[] getKeywords();
  protected abstract Label getLabel();

  @Override
  public Label processText(String text) {
    for (String elem : getKeywords()) {
      if(text.contains(elem)){
        return getLabel();
      }
    }
    return Label.OK;
  }
}
