package Graph;

import java.util.ArrayList;

public class AdjacencyMatrix {
    private static int v=5;
    private static int e=4;
    static int adj[][]=new int[v][v];
    public static void main(String[] args) {


        //int a[][] = new int[v+1][v+1];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=v;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 0, 3);
        addEdge(adj, 0, 4);
        boolean visited[]= new boolean[v];
        dfs(0, visited);

    }
    static void addEdge(int a[][], int source, int dest){
        a[source][dest] =1;
        a[dest][source]=1;
    }
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int source, int dest){
        adj.get(source).add(dest);
        adj.get(dest).add(source);
    }
    public static void dfs(int src, boolean[] visited){
        System.out.println(src+ " ");
        visited[src]=true;
        for(int i=0;i<adj[src].length;i++){
            if(adj[src][i] == 1 && (!visited[src]))
                dfs(i, visited);
        }
    }
}
