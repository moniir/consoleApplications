package com.stackTest;

import java.util.EmptyStackException;

public class StackExample {

    private Students[] stack;
    private int top;

    public  StackExample(int size) {
        stack =new Students[size];
    }

    public void push(Students students) {
        if (top == stack.length) {
            Students[] newStudent = new Students[2*stack.length];
            System.arraycopy(stack, 0, newStudent, 0,stack.length);
            stack = newStudent;
        }
        stack[++top] = students;
    }

    public Students pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        Students stu =stack[--top];
        stack[top] = null;
        return stu;
    }

    public Students peek() {
        if(isEmpty()){
            throw  new EmptyStackException();
        }
        return stack[top-1];
    }

    public boolean isEmpty() {
        return top == 0;
    }
    public int size() {
        return top;
    }
    public void printStack() {
        for(Students st : stack) {
            System.out.println(st);
        }
    }
}
