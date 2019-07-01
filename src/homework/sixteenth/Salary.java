package homework.sixteenth;

public class Salary implements DataPattern<Integer> {
  private String place;
  private String name;
  private int sum;

  public Salary(String place, String name, int sum) {
    this.place = place;
    this.name = name;
    this.sum = sum;
  }

  @Override
  public String getTo() {
    return name;
  }

  @Override
  public String getFrom() {
    return place;
  }

  @Override
  public Integer getContent() {
    return sum;
  }
}
