package xyz.subho.algorithms.utils;

public class DelayedFormatterUtil {

  public static Object format(String format, Object... args) {
    return new Object() {
      @Override
      public String toString() {
        return String.format(format, args);
      }
    };
  }
}
