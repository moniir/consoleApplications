package com.queue;

public class QueueUsingArrayMain {
    int arrQueue[];
    int rear, front, capacity;
    int currentSize = 0;

    public QueueUsingArrayMain(int size){
        arrQueue = new int[size];
        rear =0;
        front = 0;
        capacity = size;
    }
    public void enqueue(int data) {
        if(!isFull()){
            arrQueue[rear] = data;
            rear = (rear+1)%capacity;
            currentSize++;
        } else {
            System.out.println("Queue is Full!Cannot insert "+data+" into array.");
        }
    }
    public int dequeue(){
        int data = arrQueue[front];
        if(isEmpty()){
            System.out.println("Queue is Empty!!");
        } else {
            front = (front+1)%capacity;
            currentSize--;
        }
        System.out.println(data+" is Deleted");
        return data;
    }

    public boolean isFull(){
        if(currentSize == capacity)
            return true;
        else
            return false;
    }
    public boolean isEmpty() {
        return currentSize == 0;
    }
    public void show(){
        System.out.println("Element is: ");
        for(int i =0;i<currentSize;i++){
            System.out.print(arrQueue[(front+i)%capacity]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        QueueUsingArrayMain q = new QueueUsingArrayMain(5);
        q.enqueue(5);
        q.enqueue(2);
        q.enqueue(7);
        q.enqueue(3);
        q.show();
        q.dequeue();
        q.enqueue(9);
        q.enqueue(0);
        q.enqueue(1);
        q.enqueue(3);
        q.dequeue();
        q.show();
//        q.enqueue();
    }

}
