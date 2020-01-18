package com.circularQueue;

public interface Queue
{
    public void   enqueue(double x) throws Exception; // Full queue
    public double dequeue()         throws Exception; // Empty queue
}