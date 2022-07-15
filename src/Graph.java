import java.util.*;
//Implementing Unidirected graph using Adjacent Matrix
public class Graph {
    //undirected graph
    private int V; //no. of vertices
    private  int E; // no. of edges
    int[][] adjMatrix;
    public Graph(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adjMatrix = new int[nodes][nodes];
    }

    public void addEdge(int u,int v){
        this.adjMatrix[u][v] = 1;
        this.adjMatrix[v][u] = 1;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices," + E + " edges" + "\n");
        for(int v = 0; v< V; v++){
            sb.append(v + ": ");
            for(int w: adjMatrix[v]){
                sb.append(w +" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("No. of vertices for the graph:  ");
        int n = scanner.nextInt();
        Graph g = new Graph(n);
        g.V = n;
        System.out.println("How many edges you wish to add? : ");
        g.E = scanner.nextInt();
        int u, v;
        for (int i = 0; i < g.V; i++) {
            System.out.println("Enter coordinates " + (i + 1));
            u = scanner.nextInt();
            v = scanner.nextInt();
            g.addEdge(u, v);
        }
//        System.out.println(g);
        System.out.println("Following Adjacency Matrix is generated: ");
        System.out.println("------------");
        for (int i = 0; i < g.V; i++) {
            System.out.print("| ");
            for (int j = 0; j < g.V; j++) {
                System.out.print(g.adjMatrix[i][j] + " ");
            }
            System.out.println(" |");
        }
        System.out.println("------------");
//        System.out.println(g.adjMatrix);
        System.out.println(g);
    }
}



