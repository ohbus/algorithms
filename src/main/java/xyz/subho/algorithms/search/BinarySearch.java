/*
 * algorithms - Algorithms for Practice
 * Copyright © 2020-2021 Subhrodip Mohanta (hello@subho.xyz)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package xyz.subho.algorithms.search;

import java.util.function.DoubleFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinarySearch {

  private static Logger log = LoggerFactory.getLogger(BinarySearch.class);

  // Comparing double values directly is bad practice.
  // Using a small epsilon value is the preferred approach
  private static final double EPS = 0.00000001;

  public static double binarySearch(
      double lo, double hi, double target, DoubleFunction<Double> function) {

    if (hi <= lo) throw new IllegalArgumentException("hi should be greater than lo");

    double mid;
    do {

      // Find the middle point
      mid = (hi + lo) / 2.0;

      // Compute the value of our function for the middle point
      // Note that f can be any function not just the square root function
      double value = function.apply(mid);

      if (value > target) {
        hi = mid;
      } else {
        lo = mid;
      }

    } while ((hi - lo) > EPS);

    return mid;
  }

  public static void main(String[] args) {

    // EXAMPLE #1
    // Suppose we want to know what the square root of 875 is and
    // we have no knowledge of the wonderful Math.sqrt() function.
    // One approach is to use a binary search because we know that
    // the square root of 875 is bounded in the region: [0, 875].
    //
    // We can define our function to be f(x) = x*x and our target
    // value to be 875. As we binary search on f(x) approaching
    // successively closer values of 875 we get better and better
    // values of x (the square root of 875)

    double lo = 0.0;
    double hi = 875.0;
    double target = 875.0;

    String out = "";

    DoubleFunction<Double> function = x -> (x * x);

    double sqrtVal = binarySearch(lo, hi, target, function);

    out = String.format("sqrt(%.2f) = %.5f, x^2 = %.5f", target, sqrtVal, sqrtVal * sqrtVal);
    log.info(out);

    // EXAMPLE #2
    // Suppose we want to find the radius of a sphere with volume 100m^3 using
    // a binary search. We know that for a sphere the volume is given by
    // V = (4/3)*pi*r^3, so all we have to do is binary search on the radius.
    //
    // Note: this is a silly example because you could just solve for r, but it
    // shows how binary search can be a powerful technique.

    double radiusLowerBound = 0;
    double radiusUpperBound = 1000;
    double volume = 100.0;
    DoubleFunction<Double> sphereVolumeFunction = r -> ((4.0 / 3.0) * Math.PI * r * r * r);

    double sphereRadius =
        binarySearch(radiusLowerBound, radiusUpperBound, volume, sphereVolumeFunction);

    out = String.format("Sphere radius = %.5fm", sphereRadius);
    log.info(out);
  }
}
