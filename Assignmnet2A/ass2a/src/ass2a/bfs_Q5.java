package ass2a;
import java.util.*;

public class bfs_Q5 {

	public static void main(String[] args) {
		// First Row represent edges, and 1 in column represent if edges are connected 
		int[][] graph = new int[][]{
            {0, 1, 0, 0, 1}, 
            {1, 0, 1, 0, 0}, 
            {0, 1, 0, 1, 0}, 
            {0, 0, 1, 0, 1}, 
            {1, 0 ,0 ,1 ,0} 
        };
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        // Mark all the vertices as not visited 
        boolean[] visited = new boolean[graph.length];

        // Add the first vertex to the queue and mark it as visited 
        queue.add(0); 
        visited[0] = true; 

        while (!queue.isEmpty()) {

            // Dequeue a vertex from the queue and print it 
            int currentVertex = queue.remove(); 
            System.out.print(currentVertex + " "); 

            // Get all adjacent vertices of the dequeued vertex s 
            for (int i=0; i<graph[currentVertex].length; i++) {

                if (graph[currentVertex][i] == 1 && !visited[i]) {

                    // If an adjacent has not been visited then enqueue it and mark it as visited  
                    queue.add(i); 
                    visited[i] = true;  

                }  

            }  

        }  
    }  														  
}