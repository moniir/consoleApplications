package com.arrayTest;

public class stack {
    private int[] array;
    private int top;
    private int size;

    public stack(int size){
        this.size=size;
        this.array=new int[size];
        this.top=-1;
    }

    public boolean isFull(){
        if(this.size==this.size)
            return true;
        else
            return false;
    }

    public boolean isEmpty(){
        if(this.size==0)
            return true;
        else
            return false;
    }


    public  void push(int data){
        if(isFull())
        this.array[++top]=data;
    }
 /*   public static int pop(){
        int data=0;
        if(i>0)
            data = stackArraya[--i];
        stackArraya[i]=0;
        return data;
    }*/

    public static void main(String[] args) {

       /* push(5);
        push(10);
        push(15);
        push(20);

        for (int i1 : stackArraya) {
            System.out.printf(i1+" ");
        }
        System.out.println();
        System.out.println(pop());
        System.out.println(pop());
        System.out.printf("After POP: ");
        for (int i1 : stackArraya) {
            System.out.printf(i1+",");
        }*/
    }
}
