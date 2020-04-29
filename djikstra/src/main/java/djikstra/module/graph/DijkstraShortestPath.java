package main.java.djikstra.module.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import main.java.djikstra.module.Edge;
import main.java.djikstra.module.Vertex;

public class DijkstraShortestPath {

    public void computeShortestPaths(Vertex sourceVertex){
        sourceVertex.setDistance(0);
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<>();
        vertexQueue.add(sourceVertex);
        sourceVertex.setVisited(true);

        while(!vertexQueue.isEmpty()){
            Vertex currentVertex = vertexQueue.poll();

            for(Edge edge : currentVertex.getNeighbors()){
                Vertex nextVertex = edge.getDestination();
                if(!nextVertex.isVisited()){
                    double newDistance = currentVertex.getDistance() + edge.getLength();
                    if(newDistance < nextVertex.getDistance()){
                        vertexQueue.remove(nextVertex);
                        nextVertex.setDistance(newDistance);
                        nextVertex.setPredecessor(currentVertex);
                        vertexQueue.add(nextVertex);
                    }
                }
            }
            currentVertex.setVisited(true);
        }
    }

    public List<Vertex> getShortestPathTo(Vertex targetVertex){
        List<Vertex> path = new ArrayList<>();

        for(Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPredecessor()){
            path.add(vertex);
        }

        Collections.reverse(path);
        return path;
    }
}