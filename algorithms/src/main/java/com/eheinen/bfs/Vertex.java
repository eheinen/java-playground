package com.eheinen.bfs;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class Vertex {

    @NonNull
    private String name;

    private boolean visited;

    private List<Vertex> neighbours = new ArrayList<>();

    public void addVertex(Vertex vertex) {
        this.neighbours.add(vertex);
    }

    public String toString() {
        return this.name;
    }
}
