public class Main {

  public static void main(String[] args) {
    MinHeap minHeap = new MinHeap(10);
    minHeap.insert(17);
    minHeap.insert(15);
    minHeap.insert(20);
    minHeap.insert(14);
    minHeap.insert(10);
    minHeap.insert(21);
    minHeap.insert(1);
    minHeap.insert(2);
    minHeap.print();
    printElement(minHeap.pop());
    minHeap.print();
    printElement(minHeap.pop());
    minHeap.print();
  }


  private static void printElement(int element) {
    System.out.println("Element: " + element);
  }


}
