package binarysearch;

public class BinarySearchDemo {

  public static void main(String[] args) {

    int[] numbers = {1, 5, 66, 100, 230, 400, 560, 777};
    System.out.println("Implemenation using Factory Pattern:");
    System.out.println("Recursion Implementation:");
    BinarySearch binarySearch = BinarySearchFactory.getBinarySearchByType("Recursion");
    System.out.println(binarySearch.binarySearch(numbers, 560));
    System.out.println(binarySearch.binarySearch(numbers, 23));
    System.out.println("Iteration Implementation:");
    binarySearch = BinarySearchFactory.getBinarySearchByType("Iteration");
    System.out.println(binarySearch.binarySearch(numbers, 560));
    System.out.println(binarySearch.binarySearch(numbers, 23));

    System.out.println("Implemenation using Strategy Pattern:");
    System.out.println("Recursion Implementation:");
    BinarySearchContext binarySearchContext = new BinarySearchContext(new BinarySearchRecursion());
    System.out.println(binarySearchContext.executeStrategy(numbers, 560));
    System.out.println(binarySearchContext.executeStrategy(numbers, 23));
    System.out.println("Iteration Implementation:");
    binarySearchContext = new BinarySearchContext(new BinarySearchIteration());
    System.out.println(binarySearchContext.executeStrategy(numbers, 560));
    System.out.println(binarySearchContext.executeStrategy(numbers, 23));

    System.out.println("Implemenation BinarySearch on String:");
    String[] names = {"abdelgawad", "abdelrahman", "abraheem", "asmaa", "asmahan", "elsa", "ismail",
        "jack", "karmen", "kawthar", "lama", "lamis", "lobna", "zakaria"};
    BinaryStringSearchRecur binaryStringSearchRecur = new BinaryStringSearchRecur();
    System.out.println(binaryStringSearchRecur.binarySearch(names, "abraheem"));
    System.out.println(binaryStringSearchRecur.binarySearch(names, "ismail"));
    System.out.println(binaryStringSearchRecur.binarySearch(names, "lama"));

    System.out.println(binaryStringSearchRecur.binarySearch(names, "lamia"));
    System.out.println(binaryStringSearchRecur.binarySearch(names, "dajani"));
    System.out.println(binaryStringSearchRecur.binarySearch(names, "yusuf"));


  }

}
