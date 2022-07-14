package less_7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEdge(0,3);
        graph.addEdge(2,6);
        graph.addEdge(1,8);
        graph.addEdge(8,2);
        graph.addEdge(9,0);
        graph.addEdge(0,4);
        graph.addEdge(7,3);
        graph.addEdge(2,6);
        graph.addEdge(8,0);
        graph.addEdge(3,5);
//        graph.addEdge(8,9);

        System.out.println(graph.getAdjeList(2));

        BreadthPath bp = new BreadthPath(graph,2);
        System.out.println(bp.hasPathTo(9));
        System.out.println(bp.pathTo(9));
    }
}
