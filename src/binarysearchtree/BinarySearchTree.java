package binarysearchtree;

public class BinarySearchTree {

  private Node root;

  public static void main(String[] args) {

    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(5);
    bst.insert(10);
    bst.insert(1);
    bst.insert(100);
    bst.insert(20);
    bst.insert(22);

    bst.inorder();


  }

  public void insert(int data) {
    root = insertRec(root, data);
  }

  private Node insertRec(Node node, int data) {
    if (node == null) {
      node = new Node(data);
      return node;
    }

    if (data > node.data) {
      node.right = insertRec(node.right, data);
    } else {
      node.left = insertRec(node.left, data);
    }
    return node;

  }

  public void inorder() {
    inorderRec(root);
  }

  private void inorderRec(Node node) {
    if (node != null) {
      inorderRec(node.left);
      System.out.println(node.data);
      inorderRec(node.right);
    }
  }

  class Node {

    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      left = right = null;
    }
  }

}
