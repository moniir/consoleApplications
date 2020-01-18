package com.linkedList;

public class MyStack {

    Node head;
    int length;

    public MyStack() {
        head =null;
        length =0;
    }

    public void push(int data){
        Node temp = new Node(data,null);
        if(head==null)
            head =temp;
        else{
            temp.setLink(head);
            head =temp;
        }
        length++;
    }
    public int pop() {
//        Node temp = head;
        int popValue = head.getData();
        head = head.getLink();
//        temp = null;
        length--;
        return popValue;
    }
    public boolean isEmpty() {
        return (head == null);
    }

    public void display() {
        Node temp = head;
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            while (temp != null) {
                System.out.print(temp.getData() + "=>");
                temp = temp.getLink();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        System.out.println("--Pushing--");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.display();
        System.out.println("--Popping--");
        stack.pop();
        stack.pop();
        stack.display();
    }

}
