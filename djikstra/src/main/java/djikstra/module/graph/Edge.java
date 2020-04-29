package main.java.djikstra.module;

public class Edge {
    private Vertex source;
    private Vertex destination;
    private String name;
    private double length;

    public Edge(Vertex s, Vertex d, double eLength) {
        this.source = s;
        this.destination = d;
        this.name = source.getName() + " - " + destination.getName();
        this.length = eLength;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public Vertex getSource(){
        return source;
    }

    public void setSource(Vertex sourceVertex){
        this.source = sourceVertex;
    }

    public Vertex getDestination(){
        return destination;
    }

    public void setDestination(Vertex destination){
        this.destination = destination;
    }

    public String getName(){
        return name;
    }
}