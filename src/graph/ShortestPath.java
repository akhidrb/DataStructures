package graph;

import java.util.Arrays;
import java.util.LinkedList;

public class ShortestPath {

  private static final int EDGE_DISTANCE = 6;

  private Graph graph;

  public ShortestPath(Graph graph) {
    this.graph = graph;
  }

  public int[] getDistances(int startId) {

    LinkedList<Integer> queue = new LinkedList<>();
    queue.add(startId);

    int numberOfNodes = graph.getNumberOfNodes();
    int[] distances = new int[numberOfNodes];
    Arrays.fill(distances, -1);

    distances[startId] = 0;
    while (!queue.isEmpty()) {
      int node = queue.poll();
      for (int neigbor : graph.getNode(node)) {
        if (distances[neigbor] == -1) {
          distances[neigbor] = distances[node] + EDGE_DISTANCE;
          queue.add(neigbor);
        }
      }
    }

    return distances;
  }

  public int getShortestDistance(int start, int finish) {
    int[] distances = getDistances(start);
    return distances[finish];
  }


  public static void main(String[] args) {
    Graph graph = new Graph(10);
    graph.addEdge(1, 2);
    graph.addEdge(1, 3);
    graph.addEdge(3, 9);
    graph.addEdge(3, 4);
    graph.addEdge(3, 6);
    graph.addEdge(0, 9);
    graph.addEdge(0, 4);
    graph.addEdge(0, 5);
    graph.addEdge(4, 5);
    graph.addEdge(7, 8);

    ShortestPath shortestPath = new ShortestPath(graph);

    int[] distances = shortestPath.getDistances(1);

    for (int i = 0; i < 9; i++) {
      System.out.println(i + ": " + distances[i]);
    }

    System.out.println("Shortest Distance: " + shortestPath.getShortestDistance(6, 5));

  }


}
