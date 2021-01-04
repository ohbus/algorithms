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
