package com.algorithmTest.stack;

public class StackUsingLinkedList {

    private Node top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    private void push(int data){
        Node temp = new Node();
        if(temp == null){
            System.out.println("\nHeap Overflow");
            return;
        }
        temp.data = data;
        temp.link = top;
        top = temp;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int pop(){
        int popData=0;
        if(!isEmpty()){
            popData = top.data;
            top = top.link;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
        return popData;
    }

    public static void main(String[] args) {
        StackUsingLinkedList sull = new StackUsingLinkedList();
        sull.push(20);
        sull.push(50);
        sull.push(80);
        sull.push(40);
        sull.push(60);
        sull.push(75);
        System.out.println("Element removed from LinkedList: "+sull.pop());
        System.out.println("Element removed from LinkedList: "+sull.pop());
    }
}
