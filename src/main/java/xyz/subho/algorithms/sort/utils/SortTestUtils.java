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

package xyz.subho.algorithms.sort.utils;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SortTestUtils {

  private SortTestUtils() {
    throw new IllegalStateException("Utility class");
  }

  public static int[] randomIntegerArray(int sz, int min, int max) {
    int[] ar = new int[sz];
    for (int i = 0; i < sz; i++) ar[i] = randValue(min, max);
    return ar;
  }

  public static long[] randomLongArray(int sz, long min, long max) {
    long[] ar = new long[sz];
    for (int i = 0; i < sz; i++) ar[i] = randValue(min, max);
    return ar;
  }

  public static List<Integer> randomIntegerList(int sz, int min, int max) {
    List<Integer> lst = new ArrayList<>(sz);
    for (int i = 0; i < sz; i++) lst.add(randValue(min, max));
    return lst;
  }

  public static List<Integer> randomUniformUniqueIntegerList(int sz) {
    List<Integer> lst = new ArrayList<>(sz);
    for (int i = 0; i < sz; i++) lst.add(i);
    Collections.shuffle(lst);
    return lst;
  }

  public static int randValue(int min, int max) {
    return min + new SecureRandom().nextInt(max - min);
  }

  public static long randValue(long min, long max) {
    return min + (long) new SecureRandom().nextLong() * max - min;
  }
}
