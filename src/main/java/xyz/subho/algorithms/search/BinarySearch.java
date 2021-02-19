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

class BinarySearchExample {
  public static void binarySearch(int arr[], int first, int last, int key) {
    int mid = (first + last) / 2;
    while (first <= last) {
      if (arr[mid] < key) first = mid + 1;
      else if (arr[mid] == key) {
        System.out.println(key + " is found at index: " + mid);
        break;
      } else {
        last = mid - 1;
      }
      mid = (first + last) / 2;
    }
    if (first > last) System.out.println(key + " is not found!");
  }

  public static void main(String args[]) {
    int arr[] = {10, 20, 30, 40, 50}; // Array provided to perform Binary Search should be ordered
    int key = 30; // Key is the element to be found
    int last = arr.length - 1;
    binarySearch(
        arr, 0, last,
        key); // call the binarysearch funtion by passing the array , starting and ending index and
    // key
  }
}
