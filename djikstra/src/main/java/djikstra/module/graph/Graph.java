package main.java.djikstra.module.graph;

import java.util.Iterator;
import java.util.LinkedList;

import main.java.djikstra.module.Edge;
import main.java.djikstra.module.Vertex;

public class Graph {
    public LinkedList<Vertex> vertexList;
    public LinkedList<Edge> paths;
    
    public Graph(){
        vertexList = new LinkedList<Vertex>();
    }

    public void addVertex(String a){
        vertexList.add(Vertex(a));
    }

    public void returnVertexNames(){
        for(i = 0; i < vertexList.length; i++){
            vertexList(i).getName();
        }
    }

    public void makeEdge(Vertex source, Vertex dest, Int length){
        if (!paths.contains(Edge(source, dest, length)))
            paths.add(source, dest, length);
    }

    public void linkVerts(){
        for(i = 0; i < vertexList.length; i++){
            Vertex currentVert = vertexList(i);
            for(Map.Entry<Vertex, Int> currentNeighbor : currentVert.neighborMap.currentNeighborSet()){
                makeEdge(currentVert, currentNeighbor.getKey(), currentNeighbor.getValue());
            }
        }

    }
}