package Distance_learning_Algorithum;

import java.util.*;

public class FloydWarshall {
    static final int INF = 99999;

    public static void floydWarshall(int[][] graph) {
        int V = graph.length;
        int[][] dist = Arrays.copyOf(graph, V);

        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        System.out.println("Shortest distances: " + Arrays.deepToString(dist));
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 3, INF, INF},
            {INF, 0, 1, INF},
            {INF, INF, 0, 2},
            {INF, INF, INF, 0}
        };

        floydWarshall(graph);
    }
}
