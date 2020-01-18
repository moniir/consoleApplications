package com.circularQueue;

public class ArrayQueue  implements Queue
{
    /* ==========================================
       Node "inner class"
       ========================================== */
   /* public class Node
    {
        double value;
        Node   next;

        public Node( double x )
        {
            value = x;
            next  = null;
        }

        public String toString()
        {
            return "" + value;
        }
    }*/

    public double[] buf;          // Circular buffer
    public int      read, write;  // read and write pointers

    // Constructor
    public ArrayQueue(int size)
    {
        buf = new double[size];    // Create array for circular buffer

        read = 0;                  // Initialized read & write pointers
        write = 0;
    }

    /* ====================================================
        enqueue(x ):
       ==================================================== */
    public void enqueue( double x )   throws Exception
    {
        if ( read == ( write + 1 ) % (buf.length) )
        {
            throw new Exception("Queue is full");
        }

        buf[write] = x;                 // Store x in buf at write pointer
       int p = buf.length;
        write = (write+1)%(buf.length); // Advance the write pointer
    }

    /* ====================================================
        dequeue():
       ==================================================== */
    public double dequeue( ) throws Exception
    {
        double r;   // Variable used to save the return value

        if ( read == write )
        {
            throw new Exception("Queue is empty");
        }

        r = buf[read];                 // Save return value
        read = (read+1)%(buf.length);  // Advance the read pointer

        return r;
    }

    /* ====================================================
       Convert all elems in the list into a string:

        Format:"v1,v2,v3,..."
       ==================================================== */
    public String toString()
    {
        String out;
        int i;

        out = "[";

        for ( i = read; ((i)%buf.length) != write; i++ )
        {
            out += buf[i];       // Concat next list element

            if ( ((i+1)%buf.length) != write )
                out += " , ";     // Not last elem: add a ","
        }

        out += "]";
        return out;
    }
}