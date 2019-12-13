package by.bsu.algorithms.dfs;

public class Main {
    public static void main (String[] args){
        int V = 4;
        int[][] a = {{0,1,1,1}, {0,0,0,0}, {0,1,0,0}, {0,0,0,0}};
       // int[][] a = {{0,1,0,1}, {0,0,0,4}, {0,1,0,4}, {0,0,0,0}};
        Graph G = new Graph(V, a);

        System.out.println("Порядок обхода вершин в поиске в глубину:\n" +Search.DepthFirstSearch(G));

        int[]search=Sort.topologicalSearch(G);
        System.out.println("Топологически отсортированный массив:");
        for (int i=0; i<V; i++)
            System.out.print(search[i]+" ");
    }
}
