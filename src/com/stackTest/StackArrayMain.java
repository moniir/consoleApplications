package com.stackTest;

public class StackArrayMain {

    public static void main(String[] args ) {
        StackExample stackExample = new StackExample(10);
        Students students1 = new Students("Monir", 28);
        Students students2 = new Students("Hossain", 28);
        Students students3 = new Students("Abul", 28);
        Students students4 = new Students("Kalam", 28);

        stackExample.push(students1);
        stackExample.push(students2);
        stackExample.push(students3);
        stackExample.push(students4);
        stackExample.printStack();

        System.out.println(stackExample.pop());

        System.out.println(stackExample.peek());
    }

}
