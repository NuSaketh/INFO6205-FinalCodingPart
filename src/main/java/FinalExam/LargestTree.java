package FinalExam;

import java.util.LinkedList;
import java.util.*;
public class LargestTree {
    static void addEdge(LinkedList<Integer> adj[], int u, int v) {
        //TO-DO:

        adj[u].add(v);
        adj[v].add(u);
    }

    static int DFS(int u, LinkedList<Integer> adj[], Vector<Boolean> visited) {
        visited.add(u, true);
        int size = 1;

        // Iterate through all the nodes and perform DFS if the node is not yet visited
        //TO-DO:

        for (int i = 0; i < adj[u].size(); i++) {
            if (visited.get(adj[u].get(i)) == false) {
                size = size + DFS(adj[u].get(i),
                        adj, visited);
            }
        }
        return size;

    }

    public int largestTree(LinkedList<Integer> adj[], int V) {
        //TO-DO:
        Vector<Boolean> visited = new Vector<>();
        for(int i = 0; i < V; i++)
        {
            visited.add(false);
        }
        int result = 0;

        for (int j = 0; j < V; j++)
        {
            if (visited.get(j) == false)
            {
                result = Math.max(result,
                        DFS(j, adj, visited));
            }
        }
        return result;

    }
}




























































