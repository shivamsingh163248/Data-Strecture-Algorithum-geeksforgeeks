package Distance_learning_Algorithum;

import java.util.*;

public class GraphAlgorithms {
    
    static class Edge {
        int src, dest, weight;
        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            weight = w;
        }
    }

    static class Graph {
        int V;
        List<Edge> edges;

        Graph(int v) {
            V = v;
            edges = new ArrayList<>();
        }

        void addEdge(int src, int dest, int weight) {
            edges.add(new Edge(src, dest, weight));
        }
    }

    // Dijkstra's Algorithm (Fails on negative weights)
    public static void dijkstra(int[][] graph, int src) {
        int V = graph.length;
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, visited);
            if (u == -1) break; // Unreachable node
            visited[u] = true;

            for (int v = 0; v < V; v++) {
                if (!visited[v] && graph[u][v] != 0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        System.out.println("Dijkstra from node " + src + ": " + Arrays.toString(dist));
    }

    private static int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int v = 0; v < dist.length; v++) {
            if (!visited[v] && dist[v] < min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    // Bellman-Ford Algorithm (Handles negative edges and detects cycles)
    public static void bellmanFord(Graph g, int src) {
        int V = g.V;
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int i = 1; i < V; i++) {
            for (Edge e : g.edges) {
                if (dist[e.src] != Integer.MAX_VALUE &&
                        dist[e.src] + e.weight < dist[e.dest]) {
                    dist[e.dest] = dist[e.src] + e.weight;
                }
            }
        }

        // Detect negative weight cycle
        for (Edge e : g.edges) {
            if (dist[e.src] != Integer.MAX_VALUE &&
                    dist[e.src] + e.weight < dist[e.dest]) {
                System.out.println("Graph contains negative weight cycle!");
                return;
            }
        }

        System.out.println("Bellman-Ford from node " + src + ": " + Arrays.toString(dist));
    }

    public static void main(String[] args) {
        // ====== Test Case 1: No Negative Edge ======
        int[][] g1 = {
            {0, 4, 0, 0, 0, 0},
            {0, 0, 8, 0, 0, 0},
            {0, 0, 0, 7, 0, 4},
            {0, 0, 0, 0, 9, 14},
            {0, 0, 0, 0, 0, 10},
            {0, 0, 0, 0, 0, 0}
        };

        System.out.println("===== Test Case 1: Dijkstra and Bellman-Ford on Positive Weights =====");
        dijkstra(g1, 0);

        Graph bf1 = new Graph(6);
        bf1.addEdge(0, 1, 4);
        bf1.addEdge(1, 2, 8);
        bf1.addEdge(2, 3, 7);
        bf1.addEdge(2, 5, 4);
        bf1.addEdge(3, 4, 9);
        bf1.addEdge(3, 5, 14);
        bf1.addEdge(4, 5, 10);

        bellmanFord(bf1, 0);

        // ====== Test Case 2: Negative Weights (no cycle) ======
        Graph bf2 = new Graph(5);
        bf2.addEdge(0, 1, -1);
        bf2.addEdge(0, 2, 4);
        bf2.addEdge(1, 2, 3);
        bf2.addEdge(1, 3, 2);
        bf2.addEdge(1, 4, 2);
        bf2.addEdge(3, 2, 5);
        bf2.addEdge(3, 1, 1);
        bf2.addEdge(4, 3, -3);

        System.out.println("\n===== Test Case 2: Bellman-Ford on Negative Weights (No Cycle) =====");
        bellmanFord(bf2, 0);

        // Dijkstra on this would give wrong result if tried.

        // ====== Test Case 3: Negative Weight Cycle ======
        Graph bf3 = new Graph(3);
        bf3.addEdge(0, 1, 1);
        bf3.addEdge(1, 2, -1);
        bf3.addEdge(2, 0, -1); // Negative cycle

        System.out.println("\n===== Test Case 3: Bellman-Ford on Negative Cycle =====");
        bellmanFord(bf3, 0);
    }
}
