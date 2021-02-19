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

class LinearSearch {
  static int LinearSearch(int array[], int key) {

    int i;

    for (i = 0; i < array.length; i++) {
      if (array[i] == key) return i;
    }

    // If the element is not found, the function simply returns -1
    return -1;
  }

  public static void main(String[] args) {
    // Array containing n number of elements
    int[] Array = new int[] {8, 2, 9, 4, 5, 1};

    // Key is the element to be searched in the given array
    int key = 4;

    // Linearsearch function called which will return the index of the key if found, else -1
    // Array along with the key passed as parameter
    int index = LinearSearch(Array, key);

    if (index != -1) System.out.print(key + " found at index " + index);
    else System.out.print(key + " not found in array");
  }
}
