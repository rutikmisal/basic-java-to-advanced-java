import java.util.*;

public class GraphTraversal 
{

    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    // Add edge (undirected)
    static void addEdge(int u, int v) 
    {
        graph[u].add(v);
        graph[v].add(u);
    }

    // -------- DFS (Recursive) --------
    static void DFS(int node) 
    {
        visited[node] = true;
        System.out.print(node + " ");

        for (int i : graph[node]) 
	{
            if (!visited[i]) 
	    {
                DFS(i);
            }
        }
    }

    // -------- BFS --------
    static void BFS(int start) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visitedBFS = new boolean[graph.length];

        visitedBFS[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int i : graph[node]) {
                if (!visitedBFS[i]) {
                    visitedBFS[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public static void main(String[] args) 
    {

        int V = 5; // number of vertices

        // Create graph
        graph = new ArrayList[V];
        visited = new boolean[V];

        for (int i = 0; i < V; i++) 
	{
            graph[i] = new ArrayList<>();
        }

        // Add edges
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 3);
        addEdge(2, 4);

        // DFS
        System.out.println("DFS:");
        DFS(0);

        // BFS
        System.out.println("\nBFS:");
        BFS(0);
    }
}