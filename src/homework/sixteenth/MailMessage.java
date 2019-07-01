package homework.sixteenth;

public class MailMessage implements DataPattern<String>{
  private String from;
  private String to;
  private String content;

  public MailMessage(String fromAddress, String toAddress, String content) {
    this.from = fromAddress;
    this.to = toAddress;
    this.content = content;
  }

  @Override
  public String getTo() {
    return to;
  }

  @Override
  public String getFrom() {
    return from;
  }

  @Override
  public String getContent() {
    return content;
  }
}
