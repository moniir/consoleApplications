package com.DS;

class BinaryTree {

    Node root;
//#######################INSERT#####################
    public void add(int value) {
        root = insert(root, value);
    }
    public Node insert(Node current, int value) {
        Node temp = new Node(value);
        if (current == null) {
            current = temp;
            //  System.out.println("EMPTY!");
            return current;
        }
        if (value < current.data)
            current.left = insert(current.left, value);
        else if (value > current.data)
            current.right = insert(current.right, value);
        else
            return current;
        return current;
    }
    //##################DELETE############################
    public void delete(int value) {
        root = deleteRecursive(root, value);
    }
    private int findSmallestValue(Node root) {
        return root.left == null ? root.data : findSmallestValue(root.left);
    }
    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }
        if (value == current.data) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }
            int smallestValue = findSmallestValue(current.right);
            current.data = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
            // Node to delete found
            // ... code to delete the node will go here
        }
        if (value < current.data) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.delete(6);
    }
}
