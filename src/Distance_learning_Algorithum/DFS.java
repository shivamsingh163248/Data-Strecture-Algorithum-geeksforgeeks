package Distance_learning_Algorithum;

import java.util.*;

import java.util.*;

public class DFS {
    public static void dfsTraversal(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited) {
        if (visited.contains(node)) return;
        
        visited.add(node);
        System.out.print(node + " ");

        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            dfsTraversal(graph, neighbor, visited);
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(3, 4));
        graph.put(2, Arrays.asList(5, 6));

        System.out.println("DFS Traversal: ");
        dfsTraversal(graph, 0, new HashSet<>());
    }
}

