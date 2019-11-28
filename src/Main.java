public class Main {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.append(5);
    linkedList.append(10);
    linkedList.append(1);
    linkedList.append(100);
    linkedList.append(20);
    linkedList.printAll();
    linkedList.removeElement(1);
    linkedList.printAll();
    linkedList.removeElement(5);
    linkedList.printAll();
  }


  private static void printElement(int element) {
    System.out.println("Element: " + element);
  }


}
