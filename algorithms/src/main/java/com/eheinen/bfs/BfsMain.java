package com.eheinen.bfs;

public class BfsMain {

    public static void main(String[] args) {
        Vertex vertex1 = new Vertex("Vertex 1");
        Vertex vertex2 = new Vertex("Vertex 2");
        Vertex vertex3 = new Vertex("Vertex 3");
        Vertex vertex4 = new Vertex("Vertex 4");
        Vertex vertex5 = new Vertex("Vertex 5");
        Vertex vertex6 = new Vertex("Vertex 6");

        vertex1.addVertex(vertex2);
        vertex1.addVertex(vertex3);
        vertex3.addVertex(vertex4);
        vertex3.addVertex(vertex5);
        vertex5.addVertex(vertex6);
        vertex2.addVertex(vertex4);
        vertex4.addVertex(vertex2);

        Bfs bfs = new Bfs();
        bfs.bfs(vertex1);
    }
}
