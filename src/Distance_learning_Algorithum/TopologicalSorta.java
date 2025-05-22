package Distance_learning_Algorithum;

import java.util.*;

public class TopologicalSorta {

    static void topologicalSort(int V, List<List<Integer>> adj) {
        int[] inDegree = new int[V];
        for (int u = 0; u < V; u++)
            for (int v : adj.get(u))
                inDegree[v]++;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++)
            if (inDegree[i] == 0)
                queue.add(i);

        List<Integer> topoOrder = new ArrayList<>();
        while (!queue.isEmpty()) {
            int u = queue.poll();
            topoOrder.add(u);
            for (int v : adj.get(u)) {
                if (--inDegree[v] == 0)
                    queue.add(v);
            }
        }

        if (topoOrder.size() != V)
            System.out.println("Graph contains a cycle. No topological ordering possible.");
        else
            System.out.println("Topological Sort: " + topoOrder);
    }

    static void runTopologicalTests() {
        // Test Case 1: Simple DAG
        List<List<Integer>> adj1 = Arrays.asList(
            Arrays.asList(1, 2), // 0
            Arrays.asList(3),    // 1
            Arrays.asList(3),    // 2
            new ArrayList<>()    // 3
        );
        System.out.println("Test Case 1: Simple DAG");
        topologicalSort(4, adj1);

        // Test Case 2: DAG with multiple sources
        List<List<Integer>> adj2 = Arrays.asList(
            Arrays.asList(2, 3), // 0
            Arrays.asList(3),    // 1
            Arrays.asList(4),    // 2
            Arrays.asList(4),    // 3
            new ArrayList<>()    // 4
        );
        System.out.println("\nTest Case 2: DAG with multiple sources");
        topologicalSort(5, adj2);

        // Test Case 3: Graph with a cycle
        List<List<Integer>> adj3 = Arrays.asList(
            Arrays.asList(1),    // 0
            Arrays.asList(2),    // 1
            Arrays.asList(0)     // 2
        );
        System.out.println("\nTest Case 3: Cyclic graph");
        topologicalSort(3, adj3);
    }

    public static void main(String[] args) {
        runTopologicalTests();
    }
}
