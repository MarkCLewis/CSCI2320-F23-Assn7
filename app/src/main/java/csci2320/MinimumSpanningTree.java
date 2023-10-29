package csci2320;

import java.util.List;

public class MinimumSpanningTree {
  /**
   * This represents a weighted edge in a graph.
   */
  public static record Edge(int v1, int v2, double weight) {}

  /**
   * Runs Kruskal's algorithm to find the minimum spanning tree is a weighted, undirected
   * graph. The input graph can be assumed to have vertices numbered from 0 to numVertices-1
   * and in every edge, v1 < v2.
   * 
   * To make sure your output agrees with the test output,
   * have the return edges go from lowest to highest weight. Note, that is the natural order
   * that will result from an implementation and shouldn't require extra work.
   * @param numVertices the number of vertices in the graph
   * @param graph the edges in the graph
   * @return a list of the edges in the minimum spanning tree
   */
  public static List<Edge> kruskals(int numVertices, List<Edge> graph) {
    // TODO: Implement
    throw new UnsupportedOperationException("Method not implemented.");
  }
}
