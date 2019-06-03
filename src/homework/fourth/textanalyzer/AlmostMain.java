package homework.fourth.textanalyzer;

public class AlmostMain {
  public Label checkLabels(TextAnalyzer[] analyzers, String text) {
    for (TextAnalyzer analyzer : analyzers) {
      if (!analyzer.processText(text).equals(Label.OK)) {
        return analyzer.processText(text);
      }
    }
    return Label.OK;
  }
}
