package less_7;

import java.util.LinkedList;

public class Graph {
    private int vertexCount;
    private int edgeCount;
    private LinkedList<Integer>[] adjList;

    public int getVertexCount() {
        return vertexCount;
    }

    public int getEdgeCount() {
        return edgeCount;
    }

    public Graph(int vertexCount) {
        if (vertexCount < 0) {
            throw new IllegalArgumentException("не может быть меньше нуля");
        }
        this.vertexCount = vertexCount;
        adjList = new LinkedList[vertexCount];
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public LinkedList<Integer> getAdjeList(int vertex) {
        return (LinkedList<Integer>) adjList[vertex].clone();
    }

    public void addEdge(int v1, int v2) {
        if (v1 < 0 || v2 < 0 || v1 >= vertexCount || v2 >= vertexCount) {
            throw new IllegalArgumentException();
        }
        edgeCount++;
        if (v1 == v2) {
            adjList[v1].add(v1);
            return;
        }
        adjList[v1].add(v2);
        adjList[v2].add(v1);
    }


}
