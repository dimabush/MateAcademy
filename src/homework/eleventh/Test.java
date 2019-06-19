package homework.eleventh;

public class Test {
  public static void main(String[] args) {
    System.out.println(getCallerClassAndMethodName());
    anotherMethod();
  }

  private static void anotherMethod() {
    System.out.println(getCallerClassAndMethodName());
  }

  public static String getCallerClassAndMethodName() {
    StackTraceElement[] stackTrace = new Throwable().getStackTrace();
    if (stackTrace.length > 2) {
      return stackTrace[2].getClassName() + "#" + stackTrace[2].getMethodName();
    }
    return null;
  }
}
