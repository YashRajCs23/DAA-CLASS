import java.util.*;
public class BFSExample {
    public static void main(String[] args) {
        // Create the graph using adjacency list
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "C", "D"));
        graph.put("C", Arrays.asList("A", "B", "D"));
        graph.put("D", Arrays.asList("B", "C"));
        bfs(graph, "A");
    }
    public static void bfs(Map<String, List<String>> graph, String start) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(start);
        visited.add(start);
        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            String node = queue.poll();
            System.out.print(node + " ");
            for (String neighbor : graph.get(node)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}