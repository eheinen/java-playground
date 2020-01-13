package com.eheinen.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

    public void bfs(Vertex rootVertex) {
        Queue<Vertex> vertexQueue = new LinkedList<>();
        vertexQueue.add(rootVertex);

        while(!vertexQueue.isEmpty()) {
            Vertex actualVertex = vertexQueue.remove();

            if (!actualVertex.isVisited()) {
                actualVertex.setVisited(true);

                System.out.println("Vertex: " + actualVertex.getName() + " --> " + actualVertex.getNeighbours());

                vertexQueue.addAll(actualVertex.getNeighbours());
            }
        }

    }
}
