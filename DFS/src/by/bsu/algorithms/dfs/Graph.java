package by.bsu.algorithms.dfs;

public class Graph {
    private int vertices;
    private int[][] adjacency;

    public Graph(int vertices, int[][] adjacency) {
        this.vertices = vertices;
        this.adjacency = adjacency;
    }

    public int getVertices() {
        return vertices;
    }

    public int[][] getAdjacency() {
        return adjacency;
    }

}
