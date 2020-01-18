package com.circularQueue;

import java.util.Scanner;

public class QueueCtoJava {
    public static int front=-1,rear =-1;
    static int arr[];
   static Scanner sc = new Scanner(System.in);
    public static void enqueue() {

        System.out.println("Enter Element to Array: ");
        int element = sc.nextInt();
        int size = arr.length;
        if(front == rear + 1||rear == size-1) {
            System.out.println("Queue is full");
        } else if(front==-1 && rear==-1) {
            front=rear=0;
            arr[rear]= element;
            System.out.println("Element "+element+" inserted to Array: ");
        } else if(rear == size-1){
            rear = 0;
            arr[rear] = element;
            System.out.println("Element "+element+" inserted to Array: ");
        } else {
            rear++;
            arr[rear] = element;
            System.out.println("Element "+element+" inserted to Array: ");
        }
//        DisplayArray(arr);
    }

    public static void dequeue(){
        int size = arr.length;
        int element=0;
        if(front==-1 && rear==-1) {
            System.out.println("Queue is Empty");
        } else if(front==rear) {
            element = arr[front];
            System.out.println(element + " is deQueued from the Queue");
            front=rear=-1;
        } else if(front == size-1){
            element = arr[front];
            System.out.println(element + " is deQueued from the Queue");
            front = 0;
        } else {
            element = arr[front];
            System.out.println(element + " is deQueued from the Queue");
            front++;
        }
//        DisplayArray(arr);
    }

    public static void DisplayArray(){
//        for (int e: arr) {
        for ( int i = front; ((i)%arr.length) != rear; i++ ){
            System.out.printf(" "+arr[i]);
        }
    }

    public static void main(String []args){

        System.out.printf("Enter Size of Array: ");
        int size = sc.nextInt();
        arr = new int[size];
        System.out.printf("To Delete choose 1 \n To insert choose 2 \n To Display Press 3\n To Exit Press 4\n");
        int term = 0;
        while (term == 0) {
            System.out.printf("\nChoose Operation :\n");
            int decide = sc.nextInt();
            switch (decide) {
                case 1: {
                    dequeue();
                    break;
                }
                case 2: {
                    enqueue();
                    break;
                }
                case 3: {
                    DisplayArray();
                    break;
                }
                case 4: {
                    term = 1;
                    System.out.println("Thank you!");
                    break;
                }
                default:
                    break;

            }
        }
//        enqueue();
//        int ele = sc.nextInt();
    }
}
