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

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectionSort implements Sort {

  private static Logger log = LoggerFactory.getLogger(SelectionSort.class);

  @Override
  public void sort(int[] values) {
    SelectionSort.selectionSort(values);
  }

  public static void selectionSort(int[] array) {
    if (array == null) return;
    final int N = array.length;

    for (int i = 0; i < N; i++) {
      int swapIndex = i;
      for (int j = i + 1; j < N; j++) {
        if (array[j] < array[swapIndex]) {
          swapIndex = j;
        }
      }
      swap(array, i, swapIndex);
    }
  }

  private static void swap(int[] ar, int i, int j) {
    int tmp = ar[i];
    ar[i] = ar[j];
    ar[j] = tmp;
  }

  public static void main(String[] args) {
    Sort sorter = new SelectionSort();
    int[] array = {10, 4, 6, 8, 13, 2, 3};
    sorter.sort(array);

    String output = Arrays.toString(array);
    log.info(output);
  }
}
