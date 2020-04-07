package user.marius;

import java.util.HashMap;

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
}
