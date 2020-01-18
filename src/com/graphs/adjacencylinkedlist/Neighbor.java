package com.graphs.adjacencylinkedlist;

public class Neighbor {
    public int vertexNum;
    public Neighbor next;

    public Neighbor(int num, Neighbor nbr){
        this.vertexNum=num;
        this.next=nbr;
    }
}
