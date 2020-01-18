package com.circularQueue;

public class testProg
{
    public static void main( String[] args )  throws Exception
    {
//        Queue  myQ = new ArrayQueue(10);
        Queue  myQ = new ArrayQueue(4);
        double x;

        myQ.enqueue(1.0);
        System.out.println("enqueue(1.0): " + "myQ = " + myQ);
        myQ.enqueue(2.0);
        System.out.println("enqueue(2.0): " + "myQ = " + myQ);
        myQ.enqueue(3.0);
        System.out.println("enqueue(3.0): " + "myQ = " + myQ);

        System.out.println("\nBefore dequeue:");
        System.out.println("myQ = " + myQ);

        x = myQ.dequeue();
        System.out.println("x = " + x + ", myQ = " + myQ);
        x = myQ.dequeue();
        System.out.println("x = " + x + ", myQ = " + myQ);
        myQ.enqueue(4.0);
        System.out.println("enqueue(3.0): " + "myQ = " + myQ);
        x = myQ.dequeue();
        System.out.println("x = " + x + ", myQ = " + myQ);
    }
}