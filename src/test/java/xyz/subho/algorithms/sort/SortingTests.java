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

package xyz.subho.algorithms.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.EnumSet;
import org.junit.jupiter.api.Test;
import xyz.subho.algorithms.utils.TestUtils;

class SortingTests {

  enum SortingAlgorithm {
    SELECTION_SORT(new SelectionSort());

    private Sort algorithm;

    SortingAlgorithm(Sort algorithm) {
      this.algorithm = algorithm;
    }

    public Sort getSortingAlgorithm() {
      return algorithm;
    }
  }

  private static final EnumSet<SortingAlgorithm> sortingAlgorithms =
      EnumSet.of(SortingAlgorithm.SELECTION_SORT);

  @Test
  void verifySortingAlgorithms_smallPositiveIntegersOnly() {
    for (int size = 0; size < 2323; size++) {
      for (SortingAlgorithm algorithm : sortingAlgorithms) {
        Sort sorter = algorithm.getSortingAlgorithm();
        int[] values = TestUtils.randomIntegerArray(size, 0, 51);
        int[] copy = values.clone();

        Arrays.sort(values);
        sorter.sort(copy);

        assertArrayEquals(values, copy);
      }
    }
  }

  @Test
  void verifySortingAlgorithms_smallNegativeIntegersOnly() {
    for (int size = 0; size < 2323; size++) {
      for (SortingAlgorithm algorithm : sortingAlgorithms) {
        Sort sorter = algorithm.getSortingAlgorithm();
        int[] values = TestUtils.randomIntegerArray(size, -50, 51);
        int[] copy = values.clone();

        Arrays.sort(values);
        sorter.sort(copy);

        assertArrayEquals(values, copy);
      }
    }
  }
}
