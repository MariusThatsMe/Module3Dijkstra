package main.java.djikstra.module;

import java.util.HashMap;

public class Vertex {
    //Hashmap gjør at man kan legge
    public HashMap neighborMap;
    private String name;

    public Vertex(String vName){
        this.name = vName;
        this.neighborMap = new HashMap<Vertex, Int>();
    }

    public void addNeighbor(Vertex v, int length){
        neighborMap.put(v, length);
    }

    public String getName(){
        return name;
    }
}