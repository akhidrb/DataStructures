package graph;

import java.util.LinkedList;

public class Graph {

  int numberOfNodes;
  LinkedList<Integer> node[];

  public Graph(int numberOfNodes) {
    this.numberOfNodes = numberOfNodes;
    this.node = new LinkedList[numberOfNodes];

    for (int i = 0; i < numberOfNodes; i++) {
      this.node[i] = new LinkedList<>();
    }
  }

  public void addEdge(int src, int dst) {
    node[src].add(dst);
    node[dst].add(src);
  }

  public void printGraph() {
    for (int i = 0; i < numberOfNodes; i++) {
      LinkedList<Integer> temp = (LinkedList<Integer>) node[i].clone();
      System.out.print(i + ": ");
      for (int j = 0; j < node[i].size(); j++) {
        System.out.print(temp.pop() + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Graph graph = new Graph(5);
    graph.addEdge(0, 1);
    graph.addEdge(0, 4);
    graph.addEdge(1, 2);
    graph.addEdge(1, 3);
    graph.addEdge(1, 4);
    graph.addEdge(2, 3);
    graph.addEdge(3, 4);

    graph.printGraph();
  }
}
