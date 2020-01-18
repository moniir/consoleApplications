package com.DS;

public class HelloWorld{

    Node root;

    public void add(int value){
        root = insert(root,value);
    }
    public Node insert(Node current, int value){
        Node temp = new Node(value);

        if(current==null){
            return current=temp;
        }
        if(current.data>value){
            current.left=insert(current.left,value);
        } else if(current.data<value) {
            current.right = insert(current.right,value);
        } else {
            return current;
        }
        return current;
    }
    public void traversePreOrder(Node node){
        if(node!=null){
            System.out.printf(node.data+", ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    public void traverseInOrder(Node node){
        if(node!=null){
            traverseInOrder(node.left);
            System.out.printf(node.data+", ");
            traverseInOrder(node.right);
        }
    }
    public void traversePostOrder(Node node){
        if(node!=null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.printf(node.data+", ");
        }
    }

    public Node find(Node node, int value){
        if(node==null)
            return null;

        if(node.data == value) {
            return node;
        }

        if(node.data>value)
            return find(node.left,value);
        else if(node.data<value)
            return find(node.right,value);
        return null;
    }

    public int min(Node node){
        if(node.left==null)
            return node.data;
        else
            return min(node.left);
    }
    public int max(Node node){
        if(node.right==null)
            return node.data;
        else
            return max(node.right);
    }
    public static void main(String []args){
        HelloWorld hw =new HelloWorld();
        hw.add(25);
        hw.add(20);
        hw.add(27);
        hw.add(15);
        hw.add(22);
        hw.add(26);
        hw.add(30);
        hw.add(29);
        hw.add(32);
        System.out.println("PRE-ORDER TRAVERSE: ");
        hw.traversePreOrder(hw.root);
        System.out.println();
        System.out.println("IN-ORDER TRAVERSE: ");
        hw.traverseInOrder(hw.root);
        System.out.println();
        System.out.println("POST-ORDER TRAVERSE: ");
        hw.traversePostOrder(hw.root);
        // System.out.println("Hello World");
        System.out.println();
        Node node = hw.find(hw.root, 30);
        if(node!=null)
        System.out.println("Data: "+node.data);
        else
            System.out.println("Data Not Found");
        System.out.println("Min is: "+hw.min(hw.root));
        System.out.println("Max is: "+hw.max(hw.root));
    }

}
