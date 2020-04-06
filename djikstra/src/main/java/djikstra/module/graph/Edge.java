package main.java.djikstra.module;

public class Edge {
    private Vertex source;
    private Vertex destination;
    private String name;
    private Int length;

    public Edge(Vertex s, Vertex d, Int eLength){
        this.source = s;
        this.destination = d;
        this.name = source.getName() + " - " + destination.getName();
        this.length = eLength;
    }

    public Vertex returnSource(){
        return source;
    }

    public Vertex returnDestination(){
        return destination;
    }
}