package com.linkedList;

public class QueueUsingLinkedList {

    private Node head, tail;
    private int currentSize;

private class Node {
    int data;
    Node next;

    public Node(){}
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public QueueUsingLinkedList(){
    this.head = null;
    this.tail = null;
    this.currentSize = 0;
}

public boolean isEmpty(){
    return currentSize == 0;
}

//add data to the end of the list
public void enqueue(int data){
    Node oldTail = tail;
    tail = new Node(data);

    if(isEmpty()){
        head = tail;
    } else {
        oldTail.next = tail;
    }
    currentSize++;
}

public int dequeue(){
    if(isEmpty())
        tail = null;
   int data = head.data;
   head = head.next;
    currentSize--;
   return data;
}


    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(6);
        queue.dequeue();
        queue.enqueue(3);
        queue.enqueue(99);
        queue.enqueue(56);
//        queue.dequeue();
        queue.enqueue(43);
//        queue.dequeue();
        queue.enqueue(89);
        queue.enqueue(77);
//        queue.dequeue();
        queue.enqueue(32);
        queue.enqueue(232);
    }

}
