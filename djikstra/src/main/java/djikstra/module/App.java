package user.marius;

import main.java.djikstra.module.graph.Graph;

/**
 * Hello world!
 */
    public final class App {
    private Graph graph;

    private App(int v) {
        graph = new Graph(v);
    }
    
    public static void main(String[] args) {
        
    }

    public void addVerts(){
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
    }

    
}
