public class LinkedList {

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }

  }

  private Node head;
  private Node tail;

  public void append(int data) {
    if (tail == null) {
      head = new Node(data);
      tail = head;
    } else {
      tail.next = new Node(data);
      tail = tail.next;
    }
  }

  public void removeElement(int data) {
    Node temp = head;
    if (temp.data == data) {
      head = head.next;
      return;
    }
    Node prev = null;
    temp = temp.next;
    while (temp != null && temp.data != data) {
      prev = temp;
      temp = temp.next;
    }
    if (temp != null) {
      prev.next = temp.next;
    }
  }

  public void printAll() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }


}
