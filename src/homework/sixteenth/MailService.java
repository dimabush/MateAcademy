package homework.sixteenth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<DataPattern<T>> {

  Map<String, List<T>> mailBox = new HashMap(){
    @Override
    public Object get(Object key) {
      return getOrDefault(key, new ArrayList<>());
    }
  };

  public Map<String, List<T>> getMailBox() {
    return mailBox;
  }

  @Override
  public void accept(DataPattern<T> tDataPattern) {
    List<T> list = mailBox.get(tDataPattern.getTo());
    list.add(tDataPattern.getContent());
    mailBox.put(tDataPattern.getTo(), list);
  }
}
