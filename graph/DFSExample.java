import java.util.*;
public class DFSExample {
    public static void main(String[] args) {
        // Create the graph using adjacency list
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "C", "D"));
        graph.put("C", Arrays.asList("A", "B", "D"));
        graph.put("D", Arrays.asList("B", "C"));
        Set<String> visited = new HashSet<>();
        System.out.print("DFS Traversal: ");
        dfs(graph, "A", visited);
    }
    public static void dfs(Map<String, List<String>> graph, String node, Set<String> visited) {
        if (visited.contains(node))
            return;
        System.out.print(node + " ");
        visited.add(node);
        for (String neighbor : graph.get(node)) {
            dfs(graph, neighbor, visited);
        }
    }
}