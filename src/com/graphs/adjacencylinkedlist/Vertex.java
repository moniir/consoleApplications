package com.graphs.adjacencylinkedlist;

public class Vertex {
String name;
Neighbor adjList;

public Vertex(String name, Neighbor neighbor){
    this.name=name;
    this.adjList=neighbor;
}
}
