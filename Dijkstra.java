
public class Dijkstra {

    static final int V = 6; // number of vertices

    // Function to find the vertex with minimum distance
    int minDistance(int dist[], boolean visited[]) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int i = 0; i < V; i++) {
            if (!visited[i] && dist[i] <= min) {
                min = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Dijkstra Algorithm
    void dijkstra(int graph[][], int src) {
        int dist[] = new int[V];        // Output array
        boolean visited[] = new boolean[V];

        // Initialize all distances as INFINITE
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        // Distance of source vertex from itself is always 0
        dist[src] = 0;

        // Find shortest path for all vertices
        for (int count = 0; count < V - 1; count++) {

            int u = minDistance(dist, visited);

            visited[u] = true;

            // Update distance of adjacent vertices
            for (int v = 0; v < V; v++) {

                if (!visited[v] && graph[u][v] != 0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u] + graph[u][v] < dist[v]) {

                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        printSolution(dist);
    }

    // Print result
    void printSolution(int dist[]) {
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }

    public static void main(String[] args) {

        int graph[][] = {
            {0, 4, 0, 0, 0, 0},
            {4, 0, 8, 0, 0, 0},
            {0, 8, 0, 7, 2, 4},
            {0, 0, 7, 0, 9, 14},
            {0, 0, 2, 9, 0, 10},
            {0, 0, 4, 14, 10, 0}
        };

        Dijkstra d = new Dijkstra();
        d.dijkstra(graph, 0); // source vertex = 0
    }
}