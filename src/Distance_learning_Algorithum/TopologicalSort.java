package Distance_learning_Algorithum;

import java.util.*;

public class TopologicalSort {
    public static void topologicalSort(Map<Integer, List<Integer>> graph, int vertices) {
        int[] inDegree = new int[vertices];
        for (List<Integer> edges : graph.values()) {
            for (int node : edges) {
                inDegree[node]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < vertices; i++) {
            if (inDegree[i] == 0) queue.add(i);
        }

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                if (--inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(3));
        graph.put(2, Arrays.asList(3));

        System.out.println("Topological Sort: ");
        topologicalSort(graph, 4);
    }
}
