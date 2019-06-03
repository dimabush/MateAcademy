package homework.fourth;

public class AsciiCharSequence implements CharSequence {
  private byte[] array;

  public AsciiCharSequence(byte[] array) {
    this.array = array;
  }

  @Override
  public int length() {
    int counter = 0;
    for (byte x : this.array) {
      counter++;
    }
    return counter;
  }

  @Override
  public char charAt(int index) {
    return (char) array[index];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    byte[] newArray = new byte[end - start];
    int k = 0;
    for (int i = start; i < end; i++) {
      newArray[k] = array[i];
      k++;
    }
    return new AsciiCharSequence(newArray);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (byte element : array) {
      sb.append((char) element);
    }
    return sb.toString();
  }
}
