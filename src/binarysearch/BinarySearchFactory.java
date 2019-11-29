package binarysearch;

public class BinarySearchFactory {

  private static final String RECURSION = "RECURSION";

  public static BinarySearch getBinarySearchByType(String type) {
    String typeHigher = type.toUpperCase();
    if (typeHigher.equals(RECURSION)) {
      return new BinarySearchRecursion();
    } else {
      return new BinarySearchIteration();
    }

  }

}
