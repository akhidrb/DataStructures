package binarysearch;

public class BinarySearchRecursion implements BinarySearch {


  private static boolean binarySearchRecursion(int[] array, int data, int left, int right) {

    if (left > right) {
      return false;
    }

    int mid = left + ((right - left) / 2);

    if (array[mid] == data) {
      return true;
    }

    if (data > array[mid]) {
      return binarySearchRecursion(array, data, mid + 1, right);
    } else {
      return binarySearchRecursion(array, data, left, mid - 1);
    }

  }

  public boolean binarySearch(int[] array, int data) {
    return binarySearchRecursion(array, data, 0, array.length - 1);
  }


}
