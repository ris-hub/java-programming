package Graph.dfs;


import java.util.Stack;

class Vertex{
    public char label;
    public boolean wasVisited;

    public Vertex(char lab){
        label =lab;
        wasVisited=true;
    }
}

class Graph{
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private Stack<Integer> s;

    public Graph(){
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts =0;
        s = new Stack<>();
    }

    public void addVertex(char lab){
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end){
        adjMat[start][end] =1;
        adjMat[end][start] =1;
    }

    public void displayVertex(int v){
        System.out.print(vertexList[v].label+ " ");
    }

    public int getAdjUnivisitedVertex(int v){
        for(int j=0;j<nVerts;j++){
            if(adjMat[v][j] == 1 && vertexList[j].wasVisited ==false){
                return j;
            }
        }
        return -1;
    }

    public void dfs(){
        vertexList[0].wasVisited = true;
        displayVertex(0);
        s.push(0);

        while(!s.isEmpty()){
            int v= getAdjUnivisitedVertex(s.peek());

            if(v== -1)
                s.pop();
            else{
                vertexList[v].wasVisited = true;
                displayVertex(v);
                s.push(v);
            }
        }
    }
}

public class DFSApp {
    public static void main(String[] args) {

        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(1, 3);

        System.out.println("Visits: ");
        graph.dfs();
        System.out.println();
    }
}
