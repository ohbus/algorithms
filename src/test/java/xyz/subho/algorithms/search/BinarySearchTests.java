package xyz.subho.algorithms.search;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.function.DoubleFunction;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class BinarySearchTests {

  private static Logger log = LoggerFactory.getLogger(BinarySearchTests.class);

  @Test
  void binarySearchSquareRootTest() {
    double lo = 0.0;
    double hi = 875.0;
    double target = 875.0;

    DoubleFunction<Double> function = (x) -> (x * x);

    double sqrtVal = BinarySearch.binarySearch(lo, hi, target, function);
    log.info("sqrt(", target, ") = ", sqrtVal, ", x^2 = ", sqrtVal * sqrtVal);

    assertNotEquals(target, sqrtVal);
  }

  @Test
  void binarySearchSphereRadiusTest() {
    double radiusLowerBound = 0;
    double radiusUpperBound = 1000;
    double volume = 100.0;
    DoubleFunction<Double> sphereVolumeFunction = (r) -> ((4.0 / 3.0) * Math.PI * r * r * r);

    double sphereRadius =
        BinarySearch.binarySearch(radiusLowerBound, radiusUpperBound, volume, sphereVolumeFunction);

    log.info("Sphere radius = ", sphereRadius);

    assertNotEquals(volume, sphereRadius);
  }
}
