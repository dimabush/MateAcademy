package homework.third;

public final class ComplexNumber {
  private final double re;
  private final double im;

  public ComplexNumber(double re, double im) {
    this.re = re;
    this.im = im;
  }

  public double getRe() {
    return re;
  }

  public double getIm() {
    return im;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj instanceof ComplexNumber) {
      return Double.compare(this.re, ((ComplexNumber) obj).re) == 0
              && Double.compare(this.im, ((ComplexNumber) obj).im) == 0;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return (int) (this.re * 10000 + this.im * 10000);
  }
}
