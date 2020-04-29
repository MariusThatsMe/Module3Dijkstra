package main.java.djikstra.module;

import java.util.List;
import java.util.ArrayList;

public class Vertex implements Comparable<Vertex> {
    private List<Edge> neighborList;
    private String name;
    private boolean visited;
    private Vertex predecessor;
    private double distance = Double.MAX_VALUE;

    public Vertex(String vName) {
        this.name = vName;
        this.neighborList = new ArrayList<>();
    }

    public void addNeighbor(Edge edge) {
        neighborList.add(edge);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<Edge> getNeighbors(){
        return neighborList;
    }

    public void setNeighbors(List<Edge> neighborList){
        this.neighborList = neighborList;
    }

    public boolean isVisited(){
        return visited;
    }

    public void setVisited(boolean visited){
        this.visited = visited;
    }

    public Vertex getPredecessor(){
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor){
        this.predecessor = predecessor;
    }

    public double getDistance(){
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public int compareTo(Vertex o) {
        return Double.compare(this.distance, o.getDistance());
    }
}