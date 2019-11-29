package binarysearch;

public class BinaryStringSearchRecur {


  private static boolean binarySearchRecursion(String[] array, String data, int left, int right) {

    if (left > right) {
      return false;
    }

    int mid = left + ((right - left) / 2);

    if (array[mid].equals(data)) {
      return true;
    }

    char c1 = array[mid].charAt(0);
    char c2 = data.charAt(0);

    int stringLength = Math.min(array[mid].length(), data.length());

    int i = 0;
    while (i < stringLength && c1 == c2) {
      i++;
      c1 = array[mid].charAt(i);
      c2 = data.charAt(i);
    }

    if (c2 > c1) {
      return binarySearchRecursion(array, data, mid + 1, right);
    } else {
      return binarySearchRecursion(array, data, left, mid - 1);
    }

  }

  public boolean binarySearch(String[] array, String data) {
    return binarySearchRecursion(array, data, 0, array.length - 1);
  }


}
