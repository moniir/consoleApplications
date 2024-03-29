package com.linkedList;

public class Node {

    private int data;
    private Node link;

    public Node() {
        data =0;
        link = null;
    }
    public Node(int d) {
        data = d;
        link = null;
    }
    public Node(int data, Node link) {
        this.data = data;
        this.link = link;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
