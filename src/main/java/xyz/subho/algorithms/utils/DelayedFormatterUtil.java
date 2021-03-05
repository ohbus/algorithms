package xyz.subho.algorithms.utils;

public class DelayedFormatterUtil {

  private DelayedFormatterUtil() {
    throw new IllegalStateException("Utility class");
  }

  public static Object format(String format, Object... args) {
    return new Object() {
      @Override
      public String toString() {
        return String.format(format, args);
      }
    };
  }
}
