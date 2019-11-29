package binarysearch;

public class BinarySearchContext {

  private BinarySearch binarySearch;

  public BinarySearchContext(BinarySearch binarySearch) {
    this.binarySearch = binarySearch;
  }

  public boolean executeStrategy(int[] array, int data) {
    return binarySearch.binarySearch(array, data);
  }

}
