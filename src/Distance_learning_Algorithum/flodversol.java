package Distance_learning_Algorithum;

public class flodversol {

    static void floydWarshall(int[][] graph) {
        int V = graph.length;
        int[][] dist = new int[V][V];

        for (int i = 0; i < V; i++)
            System.arraycopy(graph[i], 0, dist[i], 0, V);

        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE &&
                        dist[k][j] != Integer.MAX_VALUE &&
                        dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }

        System.out.println("Floyd-Warshall Output:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (dist[i][j] == Integer.MAX_VALUE)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void runFloydTests() {
        // Test Case 1: Small graph
        int[][] graph1 = {
            {0, 3, Integer.MAX_VALUE, 5},
            {2, 0, Integer.MAX_VALUE, 4},
            {Integer.MAX_VALUE, 1, 0, Integer.MAX_VALUE},
            {Integer.MAX_VALUE, Integer.MAX_VALUE, 2, 0}
        };
        System.out.println("Test Case 1:");
        floydWarshall(graph1);

        // Test Case 2: Graph with unreachable node
        int[][] graph2 = {
            {0, 1, Integer.MAX_VALUE},
            {Integer.MAX_VALUE, 0, 1},
            {Integer.MAX_VALUE, Integer.MAX_VALUE, 0}
        };
        System.out.println("\nTest Case 2:");
        floydWarshall(graph2);
    }

    public static void main(String[] args) {
        runFloydTests();
    }
}
