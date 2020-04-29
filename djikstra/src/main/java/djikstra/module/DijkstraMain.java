package user.marius;

import main.java.djikstra.module.Edge;
import main.java.djikstra.module.Vertex;

public class DijkstraMain {
    public static void main(String[] args){
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");
        Vertex vertexF = new Vertex("F");

        vertexA.addNeighbor(new Edge(vertexA, vertexB, 10));
        vertexA.addNeighbor(new Edge(vertexA, vertexC, 5));
        vertexA.addNeighbor(new Edge(vertexA, vertexD, 9999));
        vertexA.addNeighbor(new Edge(vertexA, vertexE, 3));
        vertexA.addNeighbor(new Edge(vertexA, vertexF, 12));

        vertexB.addNeighbor(new Edge(vertexB, vertexA, 10));
        vertexB.addNeighbor(new Edge(vertexB, vertexC, 17));
        vertexB.addNeighbor(new Edge(vertexB, vertexD, 9));
        vertexB.addNeighbor(new Edge(vertexB, vertexE, 17));
        vertexB.addNeighbor(new Edge(vertexB, vertexF, 12));

        vertexC.addNeighbor(new Edge(vertexC, vertexA, 5));
        vertexC.addNeighbor(new Edge(vertexC, vertexB, 17));
        vertexC.addNeighbor(new Edge(vertexC, vertexD, 35));
        vertexC.addNeighbor(new Edge(vertexC, vertexE, 3));
        vertexC.addNeighbor(new Edge(vertexC, vertexF, 12));

        vertexD.addNeighbor(new Edge(vertexD, vertexA, 9999));
        vertexD.addNeighbor(new Edge(vertexD, vertexB, 9));
        vertexD.addNeighbor(new Edge(vertexD, vertexC, 35));
        vertexD.addNeighbor(new Edge(vertexD, vertexE, 9999));
        vertexD.addNeighbor(new Edge(vertexD, vertexF, 12));
        
        vertexE.addNeighbor(new Edge(vertexE, vertexA, 3));
        vertexE.addNeighbor(new Edge(vertexE, vertexB, 17));
        vertexE.addNeighbor(new Edge(vertexE, vertexC, 3));
        vertexE.addNeighbor(new Edge(vertexE, vertexD, 9999));
        vertexE.addNeighbor(new Edge(vertexE, vertexF, 12));
        
        vertexF.addNeighbor(new Edge(vertexF, vertexA, 12));
        vertexF.addNeighbor(new Edge(vertexF, vertexB, 12));
        vertexF.addNeighbor(new Edge(vertexF, vertexC, 12));
        vertexF.addNeighbor(new Edge(vertexF, vertexD, 12));
        vertexF.addNeighbor(new Edge(vertexF, vertexE, 12));
    }
}
/**
 * Hello world!
 *
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

    public void addNeighbors(){
        
        HashMap an = new HashMap<String, Int>();
        HashMap bn = new HashMap<String, Int>();
        HashMap cn = new HashMap<String, Int>();
        HashMap dn = new HashMap<String, Int>();
        HashMap en = new HashMap<String, Int>();
        HashMap fn = new HashMap<String, Int>();

        an.put("B", 10);
        an.put("C", 5);
        an.put("D", 9999);
        an.put("E", 3);
        an.put("F", 12);

        bn.put("A", 10);
        bn.put("C", 17);
        bn.put("D", 9);
        bn.put("E", 17);
        bn.put("F", 12);

        cn.put("A", 5);
        cn.put("B", 17);
        cn.put("D", 35);
        cn.put("E", 3);
        cn.put("F", 12);

        dn.put("A", 9999);
        dn.put("B", 9);
        dn.put("C", 35);
        dn.put("E", 9999);
        dn.put("F", 12);

        en.put("A", 3);
        en.put("B", 17);
        en.put("C", 3);
        en.put("D", 9999);
        en.put("F", 12);

        fn.put("A", 12);
        fn.put("B", 12);
        fn.put("C", 12);
        fn.put("D", 12);
        fn.put("E", 12);

        
    }
} */
