package binarysearch;

public class BinarySearchIteration implements BinarySearch {


  private static boolean binarySearchIteration(int[] array, int data) {

    int left = 0, right = array.length - 1;
    while (left <= right) {
      int mid = left + ((right - left) / 2);

      if (array[mid] == data) {
        return true;
      }

      if (data > array[mid]) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }

    }

    return false;

  }

  public boolean binarySearch(int[] array, int data) {
    return binarySearchIteration(array, data);
  }


}
