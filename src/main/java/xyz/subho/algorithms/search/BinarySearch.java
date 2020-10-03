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
    // Array provided to perform Binary Search should be ordered
    int arr[] = {10, 20, 30, 40, 50};
    // Key is the element to be found
    int key = 30;
    int last = arr.length - 1;
    // call the binarysearch funtion by passing the array , starting and endin index and key as
    // parameter
    binarySearch(arr, 0, last, key);
  }
}
